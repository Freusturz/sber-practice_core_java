package ru.sber.Multithreading;

class Task3 extends Thread {

    private final ResourceProcessor processor;

    public Task3(ResourceProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void run() {
        Increaser increaser = new Increaser(processor);

        for (int i = 0; i < 6; i++) {
            increaser.run();
        }
    }
}

class Task7Increaser extends Thread {

    private final ResourceProcessor processor;

    public Task7Increaser(ResourceProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void run() {
        Increaser increaser = new Increaser(processor);

        synchronized (processor) {
            for (int i = 0; i < 100; i++) {
                if (processor.get() >= 5) {
                    try {
                        processor.wait();
                    } catch (InterruptedException ignored) {}
                }

                increaser.run();
                processor.notify();
            }
        }
    }
}

class Task7Decreaser extends Thread {

    private final ResourceProcessor processor;

    public Task7Decreaser(ResourceProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void run() {
        Decreaser decreaser = new Decreaser(processor);

        synchronized (processor) {
            for (int i = 0; i < 100; i++) {
                if (processor.get() == 0) {
                    try {
                        processor.wait();
                    } catch (InterruptedException ignored) {}
                }

                decreaser.run();
                processor.notify();
            }
        }
    }
}

public class MultithreadingDemo {

    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        ResourceProcessor processor = new ResourceProcessor(resource);

        Task3 firstThread = new Task3(processor);
        Task3 secondThread = new Task3(processor);
        Task3 thirdThread = new Task3(processor);

        firstThread.start();
        secondThread.start();
        thirdThread.start();

        firstThread.join();
        secondThread.join();
        thirdThread.join();

        int result = processor.get();
        System.out.println("Результат 3 потоков по 6 увеличений: " + result);

        while (processor.get() > 0) {
            processor.decrease();
        }

        Task7Increaser increaser = new Task7Increaser(processor);
        Task7Decreaser decreaser = new Task7Decreaser(processor);

        increaser.start();
        decreaser.start();

        increaser.join();
        decreaser.join();

        System.out.println("Результат после 100 итераций должен равняться 0: " + processor.get());
    }

}

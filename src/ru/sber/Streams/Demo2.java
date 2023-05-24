import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

public class Demo2 {
    private static final Random rng = new Random();


    public static  void main(String[] args) {

        //HM4
        Map<String, List<StringContainer>> streamContainer = Map.of(
                "actors", List.of(
                        new StringContainer("Jeremy Allen White", rng.nextInt()),
                        new StringContainer("Cameron Monaghan", rng.nextInt()),
                        new StringContainer("Frank Gallagher", rng.nextInt())
                ),
                "shameless", List.of(
                        new StringContainer("Lip Gallagher", rng.nextInt()),
                        new StringContainer("Ian Gallagher", rng.nextInt()),
                        new StringContainer("Frank Gallagher", rng.nextInt())
                )
        );

        Stream <StringContainer> StreamContainers = streamContainer.values().stream().flatMap(List::stream);

        List <StringContainer> listOfContainers = StreamContainers.toList();
        long count = listOfContainers.stream().count();

        //HM5
        String binaryString = Stream.generate(() -> rng.nextInt(0, 1)).limit(10).toString();

        Stream<Boolean> booleans = binaryString.chars().mapToObj(ch -> ch == '1');
        boolean result = booleans.reduce(true, (identity, value) -> identity & value);
    }
}

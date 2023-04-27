package ru.sber.StringDataTime;

public class HM4 {
    public static void main(String[] args) {
        String str1 = new String("strstrmystr");
        String str2 = new String("str");
        int count = 0, i = 0;
        while(i < str1.length()){
            if (str1.indexOf(str2, i) != -1){
                count++;
                i = str1.indexOf(str2, i) + 1;
            } else {
                i++;
            }
        }
        System.out.println(count);
    }
}

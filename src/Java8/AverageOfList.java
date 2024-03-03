package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class AverageOfList {
    public static void main(String[] args) {
        List < Integer > numbers = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        System.out.println(average(numbers));
        System.out.println(sumOfEvenNumber(numbers));
        System.out.println(uniqueElements(numbers));
        System.out.println(Max(numbers));
        System.out.println(SecondLargest(numbers));
        List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        System.out.println(upperCase(colors));
        System.out.println(lowerCase(colors));
        System.out.println(NumOfColorsStartingWith("B",colors));
        System.out.println(ColorWithNumOfCharacter(colors));
        System.out.println(SortInDesc(colors));
    }

    private static Integer SecondLargest(List<Integer> numbers) {
        return numbers.stream().sorted().skip(1).findFirst().orElse(0);
    }

    private static int Max(List<Integer> numbers) {
        return numbers.stream().mapToInt(t->t).max().orElse(0);
    }

    private static List<String> SortInDesc(List<String> colors) {
        return colors.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    private static Map<String, Integer> ColorWithNumOfCharacter(List<String> colors) {
        Map<String, Integer> hmap = colors.stream().collect(Collectors.toMap(t -> t, t -> t.length()));
        return hmap;
    }

    private static long NumOfColorsStartingWith(String b, List<String> colors) {
        long count = colors.stream().filter(t -> t.startsWith(b)).count();
        return count;
    }

    private static List<Integer> uniqueElements(List<Integer> numbers) {
        //numbers.stream().collect(Collectors.toSet()).stream().sorted().forEach(t-> System.out.print(t+","));
        return numbers.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    private static Integer sumOfEvenNumber(List<Integer> numbers) {
        return numbers.stream().filter(t->t%2==0).mapToInt(Integer::intValue).sum();
    }

    private static List<String> upperCase(List<String> colors) {
        return colors.stream().map(t->t.toUpperCase()).collect(Collectors.toList());
    }

    private static List<String> lowerCase(List<String> colors) {
        return colors.stream().map(t->t.toLowerCase()).collect(Collectors.toList());
    }

    private static double average(List<Integer> numbers) {
        return numbers.stream().mapToInt(t -> t).average().orElse(0);
    }
}

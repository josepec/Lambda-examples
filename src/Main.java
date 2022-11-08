import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(System.out::println);
        System.out.println("---------------");
        numbers.stream().reduce(0, (x, y) -> {
            var res = x + y;
            System.out.print(x + "+");
            System.out.print(y + "\n");
            System.out.println(res);
            return res;
        });
        System.out.println("---------------");
        numbers.stream().reduce(0, (x, y) -> {
            var res = x + y;
            System.out.print(x + "+");
            System.out.print(y + "\n");
            System.out.println(res);
            return res;
        });
        System.out.println("---------------");
        System.out.println("SUM: " + numbers.stream().reduce(0, Integer::sum).toString());
        System.out.println("---------------");
        System.out.println("MIN: " + numbers.stream().reduce(Integer::min).toString());
        System.out.println("---------------");
        System.out.println("MAX: " + numbers.stream().reduce(Integer::max).toString());
        System.out.println("---------------");
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // Comparator.comparing(Clase::metodo)
        // Comparator.comparing(Clase::metodo).reversed()

        System.out.println("---------------");
        System.out.println(numbers.stream().map(n -> n.toString()).collect(Collectors.joining(" ")));
        System.out.println("---------------");
        System.out.println(numbers.stream().map(n -> n.toString()).collect(Collectors.joining("-")));
        System.out.println("---------------");
        List<String> words = List.of("probando", "testing");
        List<String> separatedWords = words.stream().map(w -> w.split("")).flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(separatedWords);
        System.out.println("---------------");
        List<List<String>> lists = List.of(List.of("manzana", "pera", "platano"),
                List.of("pimientos", "tomates", "zanahorias"));
        System.out.println(lists);
        var joinnedLists = lists.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
        System.out.println(joinnedLists);
        var listsLettersCount = lists.stream().flatMap(s -> s.stream()).map(String::length)
                .collect(Collectors.toList());
        System.out.println(listsLettersCount);
        lists.stream().map(s -> s.stream().map(w -> w.length()).collect(Collectors.toList()))
                .forEach(System.out::println);
        var SeparattedListsLettersCount = lists.stream()
                .map(s -> s.stream().map(w -> w.length()).collect(Collectors.toList())).collect(Collectors.toList());
        System.out.println(SeparattedListsLettersCount);
    }
}

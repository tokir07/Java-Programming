package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 20);

        List<Integer> result = list.stream()
                .filter(x -> x > 10)
                .map(x -> x * 2)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}

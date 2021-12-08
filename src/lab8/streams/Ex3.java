package lab8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3 {

    public class Ch2 {
        public static List<String> replaceWithUpper(List<String> words) {
            return words.stream().map(s -> s.toUpperCase())
                    .collect(Collectors.toList());
        }

        public static void main(String [] args) {
            List<String> res = replaceWithUpper(Arrays.asList("abc","er","u","1234"));
            System.out.println(res);
        }
    }
}

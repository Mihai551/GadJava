package lab8.ch1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {
    @Test
    public void consumer_1() {
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c"));

        Consumer<List<String>> consumer = (List<String> l) -> l.clear();
        consumer.accept(list);
        Assert.assertEquals(list, new ArrayList<>());
    }


}

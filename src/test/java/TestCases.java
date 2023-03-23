import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {

    @Test
    public void testCase1() {
        SimpleQueue<Integer> queue = new SimpleQueue<>();

        Assertions.assertEquals(true, queue.empty());

        queue.push(1);

        Assertions.assertEquals(1, queue.peek());
        Assertions.assertEquals(false, queue.empty());

        queue.push(2);

        Assertions.assertEquals(1, queue.pop());
        Assertions.assertEquals(false, queue.empty());
        Assertions.assertEquals(2, queue.pop());
        Assertions.assertEquals(true, queue.empty());
    }

}

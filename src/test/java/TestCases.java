import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {

    @Test
    public void testCase1() {
        SimpleQueue<Integer> queue = new SimpleQueue<>();

        Assertions.assertEquals(true, queue.empty());
    }

    @Test
    public void testCase2() {
        SimpleQueue<Integer> queue = new SimpleQueue<>();
        queue.push(1);

        Assertions.assertEquals(1, queue.peek());
        Assertions.assertEquals(false, queue.empty());
    }

    @Test
    public void testCase3() {
        SimpleQueue<Integer> queue = new SimpleQueue<>();
        queue.push(1);
        queue.push(2);

        Assertions.assertEquals(false, queue.empty());
        Assertions.assertEquals(1, queue.pop());
        Assertions.assertEquals(false, queue.empty());
        Assertions.assertEquals(2, queue.pop());
        Assertions.assertEquals(true, queue.empty());
    }

    @Test
    public void testCase4() {
        SimpleQueue<Integer> queue = new SimpleQueue<>();
        queue.push(1);
        queue.push(2);

        Assertions.assertEquals(1, queue.peek());
        Assertions.assertEquals(1, queue.peek());
        Assertions.assertEquals(false, queue.empty());
    }

    @Test
    public void testCase5() {
        SimpleQueue<Integer> queue = new SimpleQueue<>();

        queue.push(1);
        Assertions.assertEquals(1, queue.pop());
        queue.push(2);
        Assertions.assertEquals(2, queue.pop());
        queue.push(1);
        Assertions.assertEquals(1, queue.pop());
        queue.push(2);
        Assertions.assertEquals(2, queue.pop());

        Assertions.assertEquals(true, queue.empty());
    }

}

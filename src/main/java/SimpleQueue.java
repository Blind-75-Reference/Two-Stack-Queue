import java.util.Stack;

public class SimpleQueue<E> {
    /*
    This version of SimpleQueue implements push() in O(N) time. All other operations are O(1) time.

    The push operation pops everything out of stackA and into stackB (reversing the order). We then add the new item
    into the empty stackA, before bringing all items back from stackB in their original order. In this way we always
    have a stack we can pop the oldest item from.
     */

    private Stack<E> stackA;
    private Stack<E> stackB;

    public SimpleQueue() {
        stackA = new Stack<E>();
        stackB = new Stack<E>();
    }

    /**
     * Add a new item to the end of the queue
     * @param x - the item to be added
     */
    public void push(E x) {
        while(!stackA.isEmpty()) {
            stackB.push(stackA.pop());
        }

        stackA.add(x);

        while(!stackB.isEmpty()) {
            stackA.push(stackB.pop());
        }
    }

    /**
     * Remove and return the first item in the queue
     * @return the item at the front of the queue
     */
    public E pop() {
        return stackA.pop();
    }

    /**
     * Return the first item in the queue without removing it
     * @return the item at the front of the queue
     */
    public E peek() {
        return stackA.peek();
    }

    /**
     * Returns true if the queue is empty, has no items
     * @return true if the queue is empty, false otherwise
     */
    public boolean empty() {
        if(stackA.isEmpty() && stackB.isEmpty()) {
            return true;
        }
        return false;
    }
}

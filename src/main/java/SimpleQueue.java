import java.util.Stack;

public class SimpleQueue<E> {
    /*
    This solution does the extra work of re-ordering the stacks during the pop() and peak() operations with enqueue().
    Any time we need to consider the item at the front of the queue, we call enqueue() which checks if stackB is empty,
    and if it is everything gets moved from A to B while reversing the order. If it wasn't empty we can safely peek
    or pop the items that had been enqueued previously.

    This is a bit faster than solution-1 as the time consuming operation of moving between stacks and re-ordering
    the items is performed less often, only when necessary. In the worst case scenario this preforms about the same
    as solution-1.
     */

    private Stack<E> stackA;
    private Stack<E> stackB;

    public SimpleQueue() {
        stackA = new Stack<E>();
        stackB = new Stack<E>();
    }

    private void enqueue() {
        if(stackB.isEmpty()) {
            while(!stackA.isEmpty()) {
                stackB.push(stackA.pop());
            }
        }
    }

    /**
     * Add a new item to the end of the queue
     * @param x - the item to be added
     */
    public void push(E x) {
        stackA.push(x);
    }

    /**
     * Remove and return the first item in the queue
     * @return the item at the front of the queue
     */
    public E pop() {
        enqueue();
        return stackB.pop();
    }

    /**
     * Return the first item in the queue without removing it
     * @return the item at the front of the queue
     */
    public E peek() {
        enqueue();
        return stackB.peek();
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

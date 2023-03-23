import java.util.Stack;

public class SimpleQueue<E> {
    /*
    Complete the SimpleQueue class so that it can preform the push, pop, peek, and empty operations using two Stacks.
    Two private Stack references stackA, and stackB are already defined, as well as a constructor that initializes them.

    Complete the push(), pop(), peek(), and empty() methods.
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

    }

    /**
     * Remove and return the first item in the queue
     * @return the item at the front of the queue
     */
    public E pop() {

    }

    /**
     * Return the first item in the queue without removing it
     * @return the item at the front of the queue
     */
    public E peek() {

    }

    /**
     * Returns true if the queue is empty, has no items
     * @return true if the queue is empty, false otherwise
     */
    public boolean empty() {

    }
}

package ch.hslu.pcp;

/**
 * Interface represents a stack data structure.
 */
public interface Stackable {

    /**
     * add element to stack.
     *
     * @param e an Element.
     */
    void push(Element e);

    /**
     * returns top element.
     *
     * @return An Element.
     */
    Element top();

    /**
     * removes top element from stack.
     *
     * @return a boolean.
     */
    boolean pop();

    /**
     * prints all elements.
     */
    void print();

    /**
     * returns true when stack is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * returns size of elements in the stack.
     *
     * @return an int.
     */
    int size();

}

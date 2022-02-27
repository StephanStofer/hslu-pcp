package ch.hslu.pcp;

public class Stack implements Stackable {

    private static final int STACK_SIZE = 3;
    private static final int STACK_EMPTY_INDEX = -1;
    private static final int DEFAULT_VALUE = 1234;
    private Element[] elements;
    private int index = STACK_EMPTY_INDEX;

    public Stack() {
        elements = new Element[STACK_SIZE];
    }

    @Override
    public void push(Element e) {
        if (index + 1 < STACK_SIZE) {
            if (index != STACK_EMPTY_INDEX) {
                elements[index].setNext(e);
            }
            elements[++index] = e;
        } else {

            System.out.println("ERROR - push: stack full! Cannot add " + e.getValue());
        }

    }

    @Override
    public Element top() {
        if (index > STACK_EMPTY_INDEX) {
            return elements[index];
        } else {
            System.out.println("ERROR - top: stack empty!");
            return new Element(DEFAULT_VALUE);
        }
    }

    @Override
    public boolean pop() {
        if (index == STACK_EMPTY_INDEX) {
            return false;
        }

        elements[index--] = null;
        return true;
    }

    @Override
    public void print() {
        if (index > STACK_EMPTY_INDEX) {
            System.out.print("print - Stack contains: ");
            int i;
            for (i = 0; i <= index; i++) {
                System.out.print(elements[i].getValue() + ", ");
            }
            System.out.println("top element = " + top().getValue());
        } else {
            System.out.println("print - Stack is empty");
        }
    }

    @Override
    public boolean isEmpty() {
        return index == STACK_EMPTY_INDEX;
    }

    @Override
    public int size() {
        return index + 1;
    }
}

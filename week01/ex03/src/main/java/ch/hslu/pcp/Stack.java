package ch.hslu.pcp;

public class Stack implements Stackable {

    private static final int DEFAULT_VALUE = Integer.MIN_VALUE;
    private Element head;

    @Override
    public void push(Element element) {

        if (!isEmpty()) {
            element.setNext(head);
        }
        head = element;
    }

    @Override
    public Element top() {
        if (!isEmpty()) {
            return head;
        } else {
            return new Element(DEFAULT_VALUE);
        }
    }

    @Override
    public boolean pop() {
        if (isEmpty()) {
            return false;
        }

        head = head.getNext();
        return true;
    }

    @Override
    public void print() {
        var message = new StringBuilder();
        if (!isEmpty()) {
            message.append("print - Stack contains: ");
            var current = head;
            while (current != null) {
                message.append(current.getValue()).append(", ");
                current = current.getNext();
            }
            message.append("top element = ").append(top().getValue());
        } else {
            message.append("print - Stack is empty");
        }
        System.out.println(message);
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        var count = 0;
        var element = head;
        while (element != null) {
            count++;
            element = element.getNext();
        }
        return count;
    }
}

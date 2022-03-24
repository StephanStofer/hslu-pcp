package ch.hslu.pcp;

import java.util.Objects;

public final class Element {

    private final int value;
    private Element successor;

    public Element(int value) {
        this.value = value;
    }

    public Element getNext() {
        return this.successor;
    }

    public void setNext(final Element next) {
        this.successor = next;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        var that = (Element) obj;
        return this.value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Element[" +
            "value=" + value +
            "successor=" + successor + ']';
    }


}

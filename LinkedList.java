import java.util.Iterator;

public class LinkedList implements Iterator<Position> {
    private Position elem;

    public LinkedList(Position first) {
        elem = first;
    }

    @Override
    public boolean hasNext() {
        return elem != null;
    }

    @Override
    public Position next() {
        Position result = elem;
        elem = elem.getNext();
        return result;
    }

}
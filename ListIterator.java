import java.util.Iterator;

public class ListIterator<Link> implements Iterable<Position> {
    private Position<Link> first;
    private Position<Link> last;

    public ListIterator() {
        first = last = null;
    }

    public void add(Link data) {
        Position<Link> position = new Position<Link>();
        position.setData(data);
        position.setNext(null);
        if (first == null) {
            position.setPrev(null);
            first = position;
        } else {
            position.setPrev(last);
            last.setNext(position);
        }
        last = position;
    }

    @Override
    public Iterator<Position> iterator() {
        return new LinkedList(first);
    }
}
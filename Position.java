public class Position<Link> {
    private Position next;
    private Position prev;
    private Link data;

    public Position getNext() {
        return next;
    }

    public void setNext(Position next) {
        this.next = next;
    }

    public Link getData() {
        return data;
    }

    public void setData(Link data) {
        this.data = data;
    }

    public Position getPrev() {
        return prev;
    }

    public void setPrev(Position prev) {
        this.prev = prev;
    }

}
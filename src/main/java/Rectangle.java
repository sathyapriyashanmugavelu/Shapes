class Rectangle {
    private int length;
    private int breadth;
    static final private int increaseBy2 = 2;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    static Rectangle createSquare(int side) {
        return new Rectangle(side,side);
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return increaseBy2 * (length + breadth);
    }
}
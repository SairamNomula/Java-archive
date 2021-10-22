package Methods;

public class PassingbyReference {
    public static void main(String[]args){
        Point p1 = new Point();
        p1.x = 1;
        p1.y = 2;
        System.out.println("x= " + p1.x + ", y= " + p1.y);

        change(p1);
        System.out.println("x= " + p1.x + ", y= " + p1.y);
    }

    private static void change(Point p){
        p.x = 2;
        p.y = 1;
    }
}

// Note:

// The Point class represents a location in a two-dimensional (x, y) coordinate space. The x coordinate. The y coordinate. Constructs and initializes a point at the origin (0, 0) of the coordinate space.
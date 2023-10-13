package OOPs.Inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(double size) {
        this.l = size;
        this.w = size;
        this.h = size;
    }

    Box(double length, double width, double height) {
        this.l = length;
        this.w = width;
        this.h = height;
    }

    Box(Box other) {
        this.l = other.l;
        this.w = other.w;
        this.h = other.h;
    }

    void print() {
        System.out.println("Length: " + this.l);
        System.out.println("width: " + this.w);
        System.out.println("height: " + this.h);
    }

}

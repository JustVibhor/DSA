package OOPs.Inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        super();
        this.weight = -1;
    }

    BoxWeight(double size) {
        super(size);
        this.weight = size;
    }

    BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);
        this.weight = weight;
    }

    BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }

    void print() {
        super.print();
        System.out.println("weight: " + this.weight);
    }
}

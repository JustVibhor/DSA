package OOPs.Inheritance;

public class BoxPrice extends BoxWeight {
    double price;

    public BoxPrice() {
        super();
        this.price = -1;
    }

    public BoxPrice(double price) {
        super(price);
        this.price = price;
    }

    public BoxPrice(double l, double w, double h, double weight, double price) {
        super(l, w, h, weight);
        this.price = price;
    }

    public BoxPrice(BoxWeight other, double price) {
        super(other);
        this.price = price;
    }
}

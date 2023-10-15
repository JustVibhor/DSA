package OOPs.AccessModifiers.PrivateAndDefault;

public class Main extends Private_Default_Protected_Public {
    public static void main(String[] args) {
        // cannot be used outside the file as considered private
//        Private.print();
        Private_Default_Protected_Public.printDefault();
    }
}

package OOPs.AccessModifiers.PrivateAndDefault;

public class Private_Default_Protected_Public {

    // Private is for sensitive data (use getter and setter)
    // No Modifier for same package but in subclass
    // Protected can be used in subclasses in diff package also
    // public it can be used anywhere
    static private void print() {
        System.out.println("Its Private, Only in same ");
    }

    static void printDefault() {
        System.out.println("Protected");
    }

    static public void printPublic() {
        printDefault();
        print();
        System.out.println("Public");
    }

    static protected void printProtected() {
        System.out.println("Protected");
    }

    public static void main(String[] args) {
        Private_Default_Protected_Public.print();
        Private_Default_Protected_Public.printDefault();
    }

}

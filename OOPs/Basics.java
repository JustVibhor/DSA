package OOPs;

public class Basics {
    public static void main(String[] args) {
        // new
            // dynamic memory allocation
        Students student = new Students("Vibhor", 32, 33.4f);

//        A obj;
        // message appears when obj is destroyed
//        for(int i=0; i<1000000; i++) {
//            obj = new A("garbage bin");
//        }

        A a = new A("Someone");
        System.out.println(a);
    }

    static class Students {
        String name;
        int rollNo;
        float marks;

        Students () {
            this ("default", 1, 99.0f);
        }

        Students(String name, int rollNo, float marks) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        void print() {
            System.out.println(name + " " + rollNo + " " + marks);
        }

    }

    static class A {
        final int num = 5;
        String name;

        public A(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }
    }




}

package OOPs.Generics.Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student vibhor = new Student(8, 10.5f);
        Student megan = new Student(7, 20.54f);
        Student megan2 = new Student(6, 30.54f);
        Student megan3 = new Student(5, 40.54f);
        Student megan4 = new Student(4, 50.54f);
        Student megan5 = new Student(3, 60.54f);
        Student megan6 = new Student(2, 70.54f);
        Student megan7 = new Student(1, 80.54f);

        Student[] list = {megan, megan2, megan3, megan4, megan5, megan6, megan7, vibhor};
        System.out.println(Arrays.toString(list));
        // sorts in descending order
        Arrays.sort(list, (t1, t2) -> (int)(t2.marks - t1.marks));
        System.out.println(Arrays.toString(list));


//        if(megan.compareTo(vibhor) > 0) {
//            System.out.println("Megan outperformed Vibhor");
//        } else {
//            System.out.println("Vibhor outperformed Megan");
//        }


    }
}

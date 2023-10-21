package OOPs.ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        HumanShallowCopy obj = new HumanShallowCopy(24, "Vibhor");

        HumanShallowCopy obj2 = (HumanShallowCopy) obj.clone();

        obj.arr[0] = 99;

        // This represents Shallow copy
        System.out.println(obj.age + " " + obj.name + " " + Arrays.toString(obj.arr));
        System.out.println(obj2.age + " " + obj2.name + " " + Arrays.toString(obj2.arr));


        HumanDeepCopy obj3 = new HumanDeepCopy(80, "VIBHOR");
        HumanDeepCopy obj4 = new HumanDeepCopy(80, "VIBHOR");
        obj3.arr[0] = 99;
        System.out.println(obj3.age + " " + obj3.name + " " + Arrays.toString(obj3.arr));
        System.out.println(obj4.age + " " + obj4.name + " " + Arrays.toString(obj4.arr));

    }
}

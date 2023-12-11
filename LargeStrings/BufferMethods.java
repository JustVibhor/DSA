package LargeStrings;

import java.util.Arrays;

public class BufferMethods {
    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        StringBuffer sb2 = new StringBuffer("Kunal Kushwaha");
//        StringBuffer sb3 = new StringBuffer(30);
//
//        sb.append("WeMakeDevs");
//        sb2.append(" " + sb);
//
//        sb.replace(0, 6, "Goofy");
//        sb.insert(5, "Amazing");
//        System.out.println(sb.toString());
//        sb.delete(0, 5);
//
//        sb.reverse();
//
//        String str = sb.toString();
//        System.out.println(str);
//        System.out.println(sb3.capacity());

        // remove whitespaces
        String s = "Hi                    Damn Too                              Many Spaces Brother";
        s = s.replaceAll("\s",  "");
        System.out.println(s);

        //
        String ar = "Vibhor Rahul Kunal Ankit";
        String[] arr = ar.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }
}
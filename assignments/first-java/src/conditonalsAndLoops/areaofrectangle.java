package conditonalsAndLoops;

import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter length value:");
        float l=sc.nextFloat();
        System.out.println("enter breadth value:");
        float b=sc.nextFloat();
        float area=l*b;
        System.out.println("area of rectangle:"+area);
    }
}

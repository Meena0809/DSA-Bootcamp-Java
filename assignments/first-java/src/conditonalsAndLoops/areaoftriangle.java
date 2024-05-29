package conditonalsAndLoops;

import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter base value:");
        float b=sc.nextFloat();
        System.out.print("enter height value:");
        float h=sc.nextFloat();
        float area=(b*h)/2;
        System.out.println("area of triangle:"+area);
    }
}

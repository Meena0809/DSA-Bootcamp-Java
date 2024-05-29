package conditonalsAndLoops;

import java.util.Scanner;

public class perimeterofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius value:");
        float r = sc.nextFloat();
        double pi =3.14;
        double p =2*pi*r;
        System.out.print("perimeter of circle:" + p);
    }
}

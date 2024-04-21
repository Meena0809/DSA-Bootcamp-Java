import java.util.Scanner;

public class dollar {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter rupees:");
        float R=in.nextFloat();
        double usd=R*0.013;
        System.out.println("usd:"+usd);

    }
}

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter P value:");
        float P=in.nextFloat();
        System.out.print("enter T value:");
        float T=in.nextFloat();
        System.out.print("enter R value:");
        float R=in.nextFloat();
        float s=(P*T*R)/100;
        System.out.println("Simple interest is:" +s);

    }
}

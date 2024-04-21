import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter first no.");
        int a=in.nextInt();
        System.out.println(" enter second no.");
        int b=in.nextInt();
        if(a>b)
        {
            System.out.println(a+ " is largest no.");
        }
        System.out.println("b is largest no,");
    }
}

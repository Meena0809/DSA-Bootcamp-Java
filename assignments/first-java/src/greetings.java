import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a name:");
        String s=in.next();
        System.out.println("Hello " +s);
    }
}

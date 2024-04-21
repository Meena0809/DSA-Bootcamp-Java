import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter n value:");
        int n=in.nextInt();
        int t1=0,t2=1,nextterm;
        System.out.println(t1);
        for(int i=1;i<=n;i++)
        {
            nextterm=t1+t2;
            t1=t2;
            t2=nextterm;
            System.out.println(nextterm);
        }

    }
}

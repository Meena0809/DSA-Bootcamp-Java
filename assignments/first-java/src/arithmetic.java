import java.util.*;

public class arithmetic {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a value:");
        float a= in.nextFloat();
        System.out.print("enter b value:");
        float b=in.nextFloat();
        System.out.println("enter any operation:");
        char c=in.next().charAt(0);
        if (c=='+')
        {
            float sum=a+b;
            System.out.println("sum of a&b is:" +sum);
        }else
        if (c=='-')
        {
            float diff=a-b;
            System.out.println("diff of a&b is:" +diff);
        }else
        if (c=='*')
        {
            float multi=a*b;
            System.out.println("multi of a&b is:" +multi);

        }else
        if (c=='/')
        {
            float div=a/b;
            System.out.println("div of a&b is:" +div);

        }

    }
}

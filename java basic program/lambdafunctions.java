import java.util.ArrayList;
import java.util.Scanner;
public class lambdafunctions {
    public static void main(String[] args) {
        Scanner inn=new Scanner(System.in);
        System.out.println("enter the value for a: ");
        int num=inn.nextInt();
        System.out.println("enter the value for b: ");
        int num1=inn.nextInt();
        System.out.println("***************************************-->MY CALCULATOR USING LAMDA FUNCTIONS<--***************************************************");
        lambdafunctions in=new lambdafunctions();
        operation sum=(a,b)-> a+b;
        operation diff=(a,b)->a-b;
        operation mul=(a,b)->a*b;
        operation div=(a,b)->a/b;
        operation mod=(a,b)->a%b;
        System.out.println("Addition of two number: "+in.performer(num,num1,sum));
        System.out.println("Substraction of two number: "+in.performer(num,num1,diff));
        System.out.println("Multiplication of two number: "+in.performer(num,num1,mul));
        System.out.println("Divison of two number: "+in.performer(num,num1,div));
        System.out.println("Modulo of two number: "+in.performer(num,num1,mod));
        System.out.println("*********************************************************************************************************************");
    }
    private int performer(int a,int b,operation op){
        return op.calculator_operation(a,b);
    }
}
interface operation{
    int calculator_operation(int a,int b);
}
package assignment;
import java.util.Scanner;
public class Ss_Calculator
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter integer input number 1:");
	int i = sc.nextInt();
    System.out.println("Enter integer input number 2:");
    int j = sc.nextInt();
    Ss_Calculator ss=new Ss_Calculator();
    int out1=ss.add(i,j);
    System.out.println("Addition output: " +out1);
    int out2=ss.sub(i,j);
    System.out.println("Subtraction output: " +out2);
    int out3=ss.mult(i,j);
    System.out.println("Multiplication output: " +out3);
    int out4=ss.div(i,j);
    System.out.println("Division output: " +out4);
    int out5=ss.mod(i,j);
    System.out.println("Modulus output: " +out5);
	}
	
	public static int add(int a,int b)
	{
	    int c=a+b;
	    return c;
	}
	public static int sub(int a,int b)
	{
	    int c=a-b;
	    return c;
	}
	public static int mult(int a,int b)
	{
	    int c=a*b;
	    return c;
	}
	public static int div(int a,int b)
	{
	    int c=a/b;
	    return c;
	}
	public static int mod(int a,int b)
	{
	    int c=a%b;
	    return c;
	}
}

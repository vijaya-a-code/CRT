import arithematic.ArithematicOperations;
import java.util.Scanner;
class PackageDemo
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in);
int a,b;
a=sin.nextInt();
b=sin.nextInt();
ArithematicOperations art=new ArithematicOperations(a,b);
System.out.println("Sum ="+art.add());
System.out.println("Subtraction ="+art.sub());
System.out.println("Multiplication ="+art.mul());
System.out.println("Division ="+art.div());
System.out.println("remainder ="+art.rem());
}
}

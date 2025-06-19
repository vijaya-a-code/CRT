import arithematic.ArithematicOperations;
class PackageDemo1
{
public static void main(String args[])
{
ArithematicOperations1 art=new ArithematicOperations1();
 art.display();
System.out.println("Sum ="+art.add(2,4));
System.out.println("Subtraction ="+art.sub(4,2));
System.out.println("Multiplication ="+art.mul(8,3));
System.out.println("Division ="+art.div(54.00,2.23));
System.out.println("remainder ="+art.rem(22,7));
}
}

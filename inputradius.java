import java.util.*;
class strInputs
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter radius");
int r =sc.nextInt();
double p=3.14;
double A=r*r*p;
double C=2*r*p;
System.out.print("Area of the CIRCLE is : "+A+ "\nCircumference Of the CIRCLE is :"+C);
}
}
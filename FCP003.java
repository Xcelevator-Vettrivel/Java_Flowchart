import java.util.*;

public class FCP003{
public static void main(String[]args){
Scanner scan = new Scanner(System.in);

System.out.println("Enter the Numbers :");
int a = scan.nextInt();
int b = scan.nextInt();

System.out.println("a is "+a);
System.out.println("b is "+b);


int temp = a;
a=b;
b=temp;
System.out.println("After Swap");
System.out.println("a is "+a);
System.out.println("b is "+b);
}}
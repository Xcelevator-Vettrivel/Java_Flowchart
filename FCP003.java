public class FCP003{
public static void main(String[]args){

int a = 2;
int b = 3;

System.out.println("a is "+a);
System.out.println("b is "+b);

int temp = a;
a=b;
b=temp;

System.out.println("a is "+a);
System.out.println("b is "+b);
}}
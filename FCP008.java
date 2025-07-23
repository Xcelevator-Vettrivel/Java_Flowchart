public class FCP008{
public static void main(String[]args){

int a = 10;
int b = 20;

System.out.println("the value of a = " +a);
System.out.println("the value of b = " +b);

a = a+b;
b = a-b;
a = a-b;

System.out.println("After Swap");

System.out.println("the value of a = " +a);
System.out.println("the value of b = " +b);
}
}
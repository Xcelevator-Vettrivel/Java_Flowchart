import java.util.*;

public class FCP008{
public static void main(String[]args){
Scanner sc = new Scanner(System.in); 
int a = sc.nextInt();
int b = sc.nextInt();

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
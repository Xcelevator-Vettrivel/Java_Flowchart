import java.util.*;

public class FCP005{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Numbers :");
int a = sc.nextInt();
int b = sc.nextInt();
int c = a/b;
int d = a%b;
System.out.println("Quotient="+c);
System.out.println("Remainder="+d);
}
}

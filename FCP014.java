import java.util.*;

public class FCP014{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

if(a>b){
	if(a>c){
		System.out.println("The Greatest number:"+a);
		}
	else{
		System.out.println("The Greatest number:"+c);
	     }
}
else{
	if(b>c){
		System.out.println("The Greatest number:"+b);
		}
	else{
		System.out.println("The Greatest number:"+c);
	    }
}
}
}
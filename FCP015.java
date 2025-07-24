import java.util.*;

public class FCP015{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int d = sc.nextInt();
int max1 = 0;
int max2 = 0;
if(a>b){
max1 = a;
}
else{
max1 = b;
}
if(c>d){
max2 = c;
}
else{
max2 = d;
}
if(max1>max2){
System.out.println("The Largest Num:"+max1);
}
else{
System.out.println("The Largest Num:"+max2);
}
}
}



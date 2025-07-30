import java.util.*;

public class FCP018{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
double hra = 0;
double da = 0;
int gs  = 0;
if(a<=10000){
hra = a*.2;
da = a*.8;
gs = (int)(a + hra + da);
}
else if(a<=20000){
hra = a*.25;
da = a*.9;
gs = (int)(a + hra + da);
}
else{
hra = a*.3;
da = a*.95;
gs = (int)(a + hra + da);
}

System.out.println(gs);

}
}
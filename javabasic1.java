
import java.util.*;
public class javabasic1 {
    

public static int factorial(int n ){
    int f = 1;
for(int i=1;i<=n;i++){
    f = f * i;

}
return f;//factorial of n
}
public static void main(String args[]){
int a =5;
int b=10;
System.out.println(factorial(4));

}
}
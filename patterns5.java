public class patterns5 {
    public static void Binary_traingle(int n){
//outer loop
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
if((i+j)%2==0)
{ //even
System.out.print("1");
}else{
    System.out.print("0");
}

}
System.out.println();
}
  }

public static void main(String args[]){
        Binary_traingle(5);

    }
}

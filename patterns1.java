public class patterns1 {

public static void hollow_rectangle(int totRows, int totCols){
//outer loop
for(int i=1;i<=totRows;i++){
//  inner - coloumns

for(int j=1;j<=totCols;j++){
//cells-(i,j)

if(i == 1||i == totRows ||j == 1|| j==totCols){
//boundat cells

System.out.print("*");
}
else {
System.out.print( " ");
}}
System.out.println();
}
}


    public static void main(String args[]){

hollow_rectangle(4,5);


    }
}

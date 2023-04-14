import java.util.*;
public class hiddentext {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("What is your name ?");
String yourname= sc.nextLine();    

System.out.println("what is your partner's name ?");
String partername= sc.nextLine();    
System.out.println(" press 1 to 9 to know their hidden message for you ");
char num= sc.next().charAt(0);

switch(num){

case'1': System.out.println("we have future together");
break;
case'2': System.out.println("you was, you will be , you will always be my forever !");
break;
case'3':System.out.println("chalo 2 se 3 hojaye! ");
break;
case'4': System.out.println(" chalo duriyon ko dur krein ,todha tum chalo todha mai");
break;
case'5': System.out.println(" Incase you forget just wanna tell you I love you ");
break;
case'6': System.out.println(" text me , it feels empty");
break;

case'7': System.out.println(" call me , I miss your voice ");
break;

case'8': System.out.println("  Please come back , yeh aakhe bhi tumhe dhudh rhi h  ");
break;

case'9': System.out.println(" I ONLY LOVE YOU");
break;





 default: System.out.println(" Play Samjhawan song to know more:)");


}

    }
}

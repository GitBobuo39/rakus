import java.util.Random;
import java.util.Scanner;


public class Heads{


public static void main(String args[]){

    Random r = new Random();
    int x;
    int count1=0;
    int count2=0;

Scanner sc = new Scanner(System.in);
System.out.println("Who are you?");
System.out.print("> ");
String name = sc.next();
System.out.println("Hello, " + name + "!");


    System.out.println("Tossing a coin...");

    for(int i=0; i<3; i++){

      x = r.nextInt(2);
      if(x==0){
        System.out.println("Round " + (i+1) + ": Heads");
        count1++;
      }else if(x==1){

        System.out.println("Round " + (i+1) + ": Tails");
        count2++;
      }
    }

    System.out.println("Heads: " + count1 + ", Tails: " + count2);

if(count1>count2){

      System.out.println(name +" won");
    }else{

      System.out.println(name +" lost");
    }


}

}

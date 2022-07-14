import java.util.Random;


public class Heads{


public static void main(String args[]){

    Random r = new Random();
    int x;
    int count1=0;
    int count2=0;



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

      System.out.println("You won");
    }else{

      System.out.println("You lost");
    }


}

}

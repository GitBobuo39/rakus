import java.util.Scanner;

public class Who {


public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Who are you?");
System.out.print("> ");
String name = sc.next();
System.out.println("Hello, " + name + "!");



}

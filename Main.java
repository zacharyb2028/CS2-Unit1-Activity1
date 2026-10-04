import java.util.Scanner; 
/* Yestery day when I woke up, I got out of bed and VERB(ed) my teeth. After that I went to the PLACE, where I found my PERSON eating some FOOD. I decided to VERB because I was NUMBER minutes late for school. On my way to school, I was greeted by my PERSON who was VERB-ing. PRONOUN asked me why I was so late for school, so I said ADJECTIVE. */

public class Main {

   public static void main(String []args) {
      Scanner scan = new Scanner (System.in);

      System.out.print("Enter a verb that ends in -ed: ");
      String verb1 = scan.nextLine();
      System.out.print("Enter a place: ");
      String place1 = scan.nextLine() ;
      System.out.print("Enter a family member or relative: ");
      String person1 = scan.nextLine();
      System.out.print("Enter a food: ");
      String food1 = scan.nextLine();
      System.out.print("Enter a verb: ");
      String verb2 = scan.nextLine();
      System.out.print("Enter a number: ");
      String number1 = scan.nextLine();
      System.out.print("Enter a person: ");
      String person2 = scan.nextLine();
      System.out.print("Enter a verb that ends in -ing: ");
      String verb3 = scan.nextLine();
      System.out.print("Enter a pronoun: ");
      String pronoun1 = scan.nextLine();
      System.out.print("Enter an adjective: ");
      String adjective1 = scan.nextLine();
      scan.close();

      String sentence1 = "Yesterday when I woke up, I got out of bed and " + verb1 + " my teeth.";
      String sentence2 = "After that I went to the " + place1 + ", where I found my " + person1.toLowerCase() + " eating some " + food1 + ".";
      String sentence3 = "I decided to " + verb2 + " because I was " + number1 + " minutes late for school.";
      String sentence4 = "On my way to school, I was greeted by my " + person2 + " who was " + verb3 + ".";
      String sentence5 = pronoun1 + " asked me why I was so late for school, so I said I was " + adjective1.toUpperCase() + "!";

      System.out.println("\n ZACH'S AWESOME MADLIB STORY \n");
      System.out.println(sentence1);
      System.out.println(sentence2);
      System.out.println(sentence3);
      System.out.println(sentence4);
      System.out.println(sentence5);
   }
}
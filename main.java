import java.util.concurrent.ThreadLocalRandom;
public class GenerateRandom {
    public static void main( String args[] ) {
      // Génère des random integers  
      int int_random = ThreadLocalRandom.current().nextInt();  
  
      // Print des random integers 
      System.out.println("Random Integers: " + int_random); 

      // Génère des doubles random 
      double double_rand = ThreadLocalRandom.current().nextDouble(); 
  
      // Print des randoms doubles 
      System.out.println("Random Doubles: " + double_rand); 
       
      // Generate randoms booleans 
      boolean boolean_rand = ThreadLocalRandom.current().nextBoolean(); 
       
      // Print des randoms booleans 
      System.out.println("True / false " + boolean_rand); 
    }
}
import java.util.Random;
import java.util.Arrays;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {
  
  /**
   * The number of consecutive shuffle steps to be performed in each call
   * to each sorting procedure.
   */
  private static final int SHUFFLE_COUNT = 8;
  
  /**
   * The number of values to shuffle.
   */
  private static final int VALUE_COUNT = 15;
  
  /**
   * Tests shuffling methods.
   * @param args is not used.
   */
  public static void main(String[] args) {
    System.out.println("Results of " + SHUFFLE_COUNT +
                       " consecutive perfect shuffles:");
    int[] values1 = new int[VALUE_COUNT];
    for (int i = 0; i < values1.length; i++) {
      values1[i] = i;
    }
    for (int j = 1; j <= SHUFFLE_COUNT; j++) {
      perfectShuffle(values1);
      System.out.print("  " + j + ":");
      for (int k = 0; k < values1.length; k++) {
        System.out.print(" " + values1[k]);
      }
      System.out.println();
    }
    System.out.println();
    
    System.out.println("Results of " + SHUFFLE_COUNT +
                       " consecutive efficient selection shuffles:");
    int[] values2 = new int[VALUE_COUNT];
    for (int i = 0; i < values2.length; i++) {
      values2[i] = i;
    }
    for (int j = 1; j <= SHUFFLE_COUNT; j++) {
      selectionShuffle(values2);
      System.out.print("  " + j + ":");
      for (int k = 0; k < values2.length; k++) {
        System.out.print(" " + values2[k]);
      }
      System.out.println();
    }
    System.out.println();
    
    System.out.println("Flipping a coin: " + flip());
    
    System.out.println("Are {0, 1, 2} and {2, 1, 0, 5} permutations: " + arePermutations(new int[] {0, 1, 2}, new int[] {2, 1, 0, 5}));
    
    System.out.println("Are {0, 1, 2} and {2, 1, 0} permutations: " + arePermutations(new int[] {0, 1, 2}, new int[] {2, 1, 0}));
  }
  
  
  /**
   * Apply a "perfect shuffle" to the argument.
   * The perfect shuffle algorithm splits the deck in half, then interleaves
   * the cards in one half with the cards in the other.
   * @param values is an array of integers simulating cards to be shuffled.
   */
  public static void perfectShuffle(int[] values) {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
    int[] original = new int[values.length];
    
    for (int i = 0; i < values.length; i++)
      original[i] = values[i];
    
    int k = 0, j = 0;
    for (;j < (values.length + 1 )/ 2; j++){
      values[k] = original[j];
      k+= 2;
    }
    k = 1;
    j = (values.length + 1 ) / 2;
    for (;j < values.length; j++){
      values[k] = original[j];
      k+= 2;
    }
    values = original;
  }
  
  /**
   * Apply an "efficient selection shuffle" to the argument.
   * The selection shuffle algorithm conceptually maintains two sequences
   * of cards: the selected cards (initially empty) and the not-yet-selected
   * cards (initially the entire deck). It repeatedly does the following until
   * all cards have been selected: randomly remove a card from those not yet
   * selected and add it to the selected cards.
   * An efficient version of this algorithm makes use of arrays to avoid
   * searching for an as-yet-unselected card.
   * @param values is an array of integers simulating cards to be shuffled.
   */
  public static void selectionShuffle(int[] values) {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
    
    for (int k = values.length - 1; k > 0; k--){
      int j = new Random().nextInt(k + 1);
      int temp = values[k];
      values[k] = values[j];
      values[j] = temp;
    }
  }
  
  public static String flip () {
    int coin = new Random().nextInt(3);
    if (coin > 0)
      return "heads";
    else
      return "tails";
  }
  
  public static boolean arePermutations (int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length){
      return false;
    }
    
    boolean found = false;
    
    for(int i = 0; i  <  arr1.length; i++){
      for(int j = 0; j < arr2.length; j++){
        if (arr1[i] == arr2[j]){
          found = true;
        }
      }
      
      if (found != true)
        return false;
      
      found = false;
    }
    
    return true;
  }
}

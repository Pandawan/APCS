// Exam 5 Question 2

public class DNA
{
  /********************** Part (a) **********************/
  
  /** Validates a given str as a DNA string.
   *  @param str string to be validated
   *  @return true if str contains only letters A, C, G, and T;
   *          false otherwise.
   *  Precondition: str is not null and not empty
   */
  public static boolean isValidDNA(String str)
  {
 //ENTER YOUR OWN CODE; YOU WILL NEED TO CHANGE THE RETURN
    return true;
  }

  /********************** Part (b) **********************/

  /** Finds the first occurrence in a given DNA string of
   *  each of the genes from a given array of genes and
   *  returns the sum of the gaps between the matched genes.
   *  @param dnaString a DNA string
   *  @param genes an array of genes to be matched
   *  @return the sum of the gaps between the matched
   *          genes or -1 if one of the genes
   *          is not found or is found out of order or
   *          overlaps with one of the previously matched genes.
   *  Precondition: genes.length > 0; every gene in the array
   *                genes is a non-empty string
   */
  public static int matchGenes(String dnaString, String[] genes)
  {
 //ENTER YOUR OWN CODE; YOU WILL NEED TO CHANGE THE RETURN
    int previousMax = 0;
    int diff = 0;
    
    for(String gene : genes){
     int x = dnaString.indexOf(gene);
     if (x != -1){
       if (x < previousMax) 
         return -1;
       else
         diff += (x - previousMax);
       previousMax = x + gene.length();
     }
    }
    return diff;
  }

  /********************** Part (c) **********************/

  /** Returns an integer whose binary digits encode a given
   *  DNA segment. Two binary bits are used to encode each
   *  letter: 00 for A, 01 for C, 10 for G, and 11 for T.
   *  @param dnaSegment a string to be encoded
   *  @return an integer code
   *  Precondition: dnaSegment is a valid DNA string
   *                0 < dnaSegment.length() <= 15;
   */
  public static int encode(String dnaSegment)
  {
    //ENTER YOUR OWN CODE; YOU WILL NEED TO CHANGE THE RETURN
    return 1;
  }

  /********************** Extra **********************/

  /** Returns a string of a given length that represens a DNA
   *  segment corresponding to a given binary code.
   *  @param code the code of the segment
   *  @param len the length of the the segment
   *  @return a string that corresponds to code
   */
  /*public static String decode(int code, int len)
  {
    ....................
  }*/
  
  /********************** Test **********************/

  public static void main(String[] args)
  {
    String[] dnaStrings = {"GTACGTAATG", "GXACGTAATG", "GTAC_GTAATG"};
    for (String s : dnaStrings)
      System.out.println(s + " is valid? " + isValidDNA(s));

    String[] genes = {"ACG", "AA", "ACA"};

    String[] dnaStrings2 = {"GTACGTAATGACAGT", "GTACGTAATAAGACAGTAA", "GTACGAATAAGACAGTAA",
            "AATACGTAATGACAGT", "GTACGTAGGAACAGT", "GTACGTATTGACAGT"};

    System.out.println("genes " + genes[0] + " " + genes[1] + " " + genes[2]);
    for (String s : dnaStrings2)
      System.out.println("Gaps in " + s + ": " + matchGenes(s, genes));

    String s = "GATCCGTA";
    int code = encode(s);
    //String s2 = decode(code, s.length());
    //System.out.println(s + " ==> " + code + " ==> " + s2);
  }
}

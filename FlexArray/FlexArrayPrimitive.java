/*
 * Name: Miguel Tenant de La Tour
 * 
 * Program File: FlexArrayPrimitive.java
 * 
 * Description: Creates a flexible array (basically a List) of INTs. It can dynamically change size, add and remove values.
 */

public class FlexArrayPrimitive {
  
  // Logical size of the array
  private int size = 0;
  
  private int[] array;
  
  public FlexArrayPrimitive () {
    array = new int[20];
  }
  
  public FlexArrayPrimitive (int s) {
    array = new int[s];
  }
  
  // Returns the logical size/length of the array
  public int getLength () {
    return size;
  }
  
  // Checks whether or not the modulable array is empty
  public boolean isEmpty () {
    return (size == 0);
  }
  
  // Adds an element to the array
  public void append (int data) {
    insert(size, data);
    size++;
  }
  
  public int discard(int index) {
    // Check if the array isn't empty (don't want out of bounds)
    if (!isEmpty()){
      // Another check for an out of bounds with index
      if (index < size || index < array.length) {
        // Set size smaller
        size--;
        
        // Create a new array with the correct values
        int[] newArr = new int[array.length - 1];
        
        // Loop through the old array, and add all values that aren't at the index chosen
        int j = 0;
        for (int i = 0; i < size; i++) {
          if (i != index) {
            newArr[j] = array[i];
            j++;
          }
        }
        // Apply changes
        array = newArr;
      }
      else {
        System.out.println("Trying to discard for an index out of logical or physical bounds.");
        return -999;
      }
    }
    else {
      System.out.println("Can't discard array if it's empty");
      return -999;
    }
    
    // Just one last return in case something goes wrong
    return -999;
  }
  
  public void insert (int index, int data) {
    if (index >= array.length) {
      resize(1);
    }
    // Check if we are getting an index higher than the last element
    if (index > size) {
      index = size;
      size++;
    }
    
    array[index] = data;
  }
  
  // Resizes by j
  private void resize (int j) {
    int[] newArr = new int[array.length + j];
    
    for (int i = 0; i < array.length; i++) {
      newArr[i] = array[i];
    }
    
    array = newArr;
  }
  
  // Returns every value inside the array in one line
  public String toString () {
    String str = "[";

    for (int r : array){
      str += r + ", ";
    }
    str += "]";
    return str;
  }
}
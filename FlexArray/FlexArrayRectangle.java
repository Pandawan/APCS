/*
 * Name: Miguel
 * 
 * Program File: FlexArrayRectangle.java
 * 
 * Description: Creates a flexible array (basically a List) of Rectangles. It can dynamically change size, add and remove values.
 */

public class FlexArrayRectangle {
  
  // Logical size of the array
  private int size = 0;
  
  private Rectangle[] array;
  
  public FlexArrayRectangle () {
    array = new Rectangle[20];
  }
  
  public FlexArrayRectangle (int s) {
    array = new Rectangle[s];
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
  public void append (Rectangle data) {
    if (size >= array.length) {
      resize();
    }
    
    array[size] = data;
    size++;
  }
  
  public Rectangle discard (int index) {
    // Check for errors
    if (index < 0){
        System.out.println("DISCARD: Index cannot be smaller than 0!");
        return null;
      }
    // Check for errors
    if (index >= size) {
      System.out.println("DISCARD: Cannot discard outside of logical size!");
      return null;
    }
    
    Rectangle value = array[index];
    // Loop through everything
    for (int i = index; i<= size-1; i++) {
      array[i] = array[i+1];
    }
    array[size] = null;
    size--;
    // Return the value of the discarded index
    return value;
    
  }
  
  public void insert (int index, Rectangle data) {
    // Append if we have the index bigger (or equal because less processing needed) than 1
    if (index >= size) {
      append(data);
    }else {
      // Check for errors
      if (index < 0){
        System.out.println("INSERT: Index cannot be smaller than 0!");
        return;
      }
      
      // Increase the logical size
      size++;
      // Copy the old array to keep the data
      Rectangle[] oldArr = array;
      
      // Create a new array with the correct values
      resize();
      
      // Loop through the old array, and add all values that aren't at the index chosen
      for (int i = 0; i < index; i++) {
        array[i] = oldArr[i];
      }
      array[index] = data;
      for (int i = index + 1; i < size; i++) {
        array[i] = oldArr[i - 1];
      }
    }
  }
  
  // Resizes by 1
  private void resize () {
    Rectangle[] newArr = new Rectangle[array.length + 1];
    
    for (int i = 0; i < array.length; i++) {
      newArr[i] = array[i];
    }
    
    array = newArr;
  }
  
  // Returns every value inside the array in one line
  public String toString () {
    String str = "[";
    
    for (int i = 0; i < size; i++){
      str += array[i];
      // If not last item
      if (i != size - 1) {
        // Add a ,
        str += "\r\n";
      }
    }
    
    str += "]";
    return str;
  }
}
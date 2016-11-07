/*
 * Name: Miguel Tenant de La Tour
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
      resize(1);
    }
    
    array[size] = data;
    size++;
  }
  
   public Rectangle discard (int index) {
    // Check if we have problems
    if (index < 0) throw new ArrayIndexOutOfBoundsException();
    if (index >= size) return null;
    
    Rectangle value = array[index];
    // Loop through everything
    for (int i = index; i<= size-1; i++) {
      array[i] = array[i+1];
    }
    array[size] = null;
    size--;
    
    return value;
    
   }
  
  public void insert (int index, Rectangle data) {
    if (index > size) {
      append(data);
    }else {
      size++;
      
      // Create a new array with the correct values
      Rectangle[] newArr = new Rectangle[array.length + 1];
      
      // Loop through the old array, and add all values that aren't at the index chosen
      for (int i = 0; i < index; i++) {
        newArr[i] = array[i];
      }
      newArr[index] = data;
      for (int i = index + 1; i < size; i++) {
        newArr[i] = array[i - 1];
      }
      // Apply changes
      array = newArr;
      
    }
  }
  
  // Resizes by j
  private void resize (int j) {
    Rectangle[] newArr = new Rectangle[array.length + j];
    
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
        // Add a new line
        str += "\r\n";
      }
    }
    str += "]";
    return str;
  }
}
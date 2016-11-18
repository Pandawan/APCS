/*
 * Name: Miguel Tenant de La Tour
 *
 * Program File: FlexArrayRectangle.java
 *
 * Description: Creates a flexible array (basically a List) of Rectangles. It can dynamically change size, add and remove values.
 */

public class FlexArrayRectangle {

  // Logical size of the array
  private int size;

  private Rectangle[] array;

  public FlexArrayRectangle () {
    array = new Rectangle[20];
    size = 0;
  }

  public FlexArrayRectangle (int s) {
    array = new Rectangle[s];
    size = 0;
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
  
  // A FlexArrayRectangle will be compared by the sum of the lengths of each of its active
  // elements.
  // EXAMPLE:
  // flexy1.compareTo(flexy2) returns a negative int if the sum of the lengths of
  // flexy1 < the sum of the lengths of flexy2
  // flexy1.compareTo(flexy2) returns a zero if the sum of the lengths are the same
  // flexy1.compareTo(flexy2) returns a positive int if the sum of the lengths of
  // flexy1 > the sum of the lengths of flexy2
  public int compareTo(FlexArrayRectangle flexy) {
    // Add all values of the first array
    int sumFlexy1 = 0;
    for (int i = 0; i < size; i++){
      sumFlexy1 += getValue(i).getLength();
    }
    
    // Add all values of second array
    int sumFlexy2 = 0;
    for (int i = 0; i < flexy.size; i++){
      sumFlexy2 += flexy.getValue(i).getLength();
    }
    
    // Check and return
    if (sumFlexy1 < sumFlexy2)
      return -1;
    else if (sumFlexy1 == sumFlexy2)
      return 0;
    else if (sumFlexy1 > sumFlexy2)
      return 1;
    
    // Check if for some reason I messed up
    return 0;
  }
  
  // A FlexArray object will be considered equal to another FlexArray if the quantity of
  // active elements are the same.
  // EXAMPLE: flexy1.equals(flexy2) returns true if the quantity of active elements
  // are the same; otherwise it returns false
  public boolean equals(FlexArrayRectangle flexy) {
    return (getLength() == flexy.getLength());
  }
  
  // Sorts the array using the Rectangle's compareTo
  //using any sort routine, sort from low to high, index 0 to mySize - 1
  public void sort()  {
    for (int outer = 0; outer < getLength(); outer++) {
      for (int inner = 0; inner < getLength() - 1 - outer; inner++) {
        if (array[inner].compareTo(array[inner+1]) > 0) {
          Rectangle temp = array[inner+1];
          array[inner+1] = array[inner];
          array[inner] = temp;
        }
      }
    }
  }
  
  // Returns the value at the position loc
  public Rectangle getValue(int loc) {
    if (loc >= getLength()) {
      return null;
    }
    
    return array[loc];
  }
  
  // Searches for and returns the first index with the same value
  // Returns -1 if not found
  public int searchFor(Rectangle target) {
    for (int i = 0; i < getLength(); i++) {
      if (array[i].equals(target)) {
        return i;
      }
    }
    
    return -1;
  }
}

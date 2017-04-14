import java.util.*;

/**
 *  Implementation of lists, using singly linked elements.
 *
 * @author     G. Peck
 * @created    April 27, 2002
 *
 *  modified March 2017 to only use int data type
 */
public class SinglyLinkedList
{
  private ListNode first;  // first element
  private int size;

  /**
   *  Constructor for the SinglyLinkedList object
   *  Generates an empty list.
   */
  public SinglyLinkedList()
  {
    first = null;
    size = 0;
  }

  /**
   *  Returns the first element in this list.
   *
   * @return  the first element in the linked list.
   */
  public Integer getFirst()
  {
    if (first == null)
    {
      System.out.println("The stack is empty.");
      throw new IllegalStateException();
    }
    else
      return first.getValue();
  }

  /**
   *  Inserts the given element at the beginning of the list (this is the list inside the stack).
   *
   * @param  value  the element to be inserted at the beginning of this list.
   */
  public void addFirst(int value)
  {
    // note the order that things happen:
    // head is parameter, then assigned
    first = new ListNode(value, first);
    size++;
  }
  
  /**
   *  Removes the first element of the list (this is the list inside the stack).
   */
  public int removeFirst() { 
    // Checks if it's empty
    if (first == null) {
      System.out.println("The stack is empty.");
      throw new IllegalStateException();
    }
    
    // Get the value to be returned
    int value = first.getValue();
    
    // Remove the element
    if (first.getNext() != null) 
      first = first.getNext();
    else 
      first = null;
    
    // Decrease size
    size--;
    
    return value;
  }
  
  /**
   *  Returns the size of the list (this is the list inside the stack)
   */
  public int size() {
    return size;
  }
  
  /**
   *  Prints the full list in the console (this is the list inside the stack)
   */
  public void print () {
    // Get the first element
    ListNode currentNode = first;
    System.out.print("[");
    
    // Loop while we are not done printing
    while (currentNode != null) {
      System.out.print(currentNode.getValue());
      
      // If there are more values later, continue looping
      if (currentNode.getNext() != null){
        System.out.print(", ");
        currentNode = currentNode.getNext();
      }
      // If there are no more values next, close the array and stop
      else{
        System.out.println("]");
        return;
      }
    }
    // Add this in case the array is empty
    System.out.println("]");
  }
}


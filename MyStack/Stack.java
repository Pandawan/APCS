import java.util.*;

/**
 *  Implementation of Stack, using singly linked.
 *
 * @author     G. Peck
 * @created    April 27, 2002
 *
 *  modified March 2017 to only use int data type
 */
public class Stack
{
  private ListNode first;  // first element
  private int size;
  
  /**
   *  Constructor for the Stack object
   *  Generates an empty stack.
   */
  public Stack()
  {
    first = null;
  }
  
  /**
   *  Returns the first element in this stack.
   *
   * @return  the first element in the stack
   */
  public int peekTop()
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
   *  Inserts the given element at the beginning of this stack.
   *
   * @param  value  the element to be inserted at the beginning of this stack.
   */
  public void push(int value)
  {
    // note the order that things happen:
    // head is parameter, then assigned
    first = new ListNode(value, first);
    size++;
  }
  
  /**
   *  Removes the first element of the stack.
   */
  public int pop() { 
    if (first == null) {
      System.out.println("The stack is empty.");
      throw new IllegalStateException();
    }
    
    int value = first.getValue();
    
    if (first.getNext() != null) 
      first = first.getNext();
    else 
      first = null;
    
    size--;
    
    return value;
  }
  
  /**
   *  Returns the size of the stack
   */
  public int size() {
    return size;
  }
  
  /**
   *  Prints the full stack in the console
   */
  public void printStack () {
    ListNode currentNode = first;
    System.out.print("[");
    while (currentNode != null) {
      System.out.print(currentNode.getValue());
      
      if (currentNode.getNext() != null){
        System.out.print(", ");
        currentNode = currentNode.getNext();
      }
      else{
        System.out.println("]");
        return;
      }
    }
  }
}


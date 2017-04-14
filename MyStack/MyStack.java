import java.util.*;

/**
 * Stack using LinkedList
 * 
 * @author     Miguel, Brian, Albert
 *
 * note: Apparently we needed to separate MyStack and SinglyLinkedList, a better way (that we did at first) would be to make them the same class.
 */
public class MyStack
{
  SinglyLinkedList list;
  
  /**
   *  Constructor for the Stack object
   *  Generates an empty stack.
   */
  public MyStack()
  {
    list = new SinglyLinkedList();
  }
  
  /**
   *  Returns the first element in this stack.
   *
   * @return  the first element in the stack
   */
  public int peekTop()
  {
    return list.getFirst();
  }
  
  /**
   *  Inserts the given element at the beginning of this stack.
   *
   * @param  value  the element to be inserted at the beginning of this stack.
   */
  public void push(int value)
  {
    list.addFirst(value);
  }
  
  /**
   *  Removes the first element of the stack.
   */
  public int pop() { 
    return list.removeFirst();
  }
  
  /**
   *  Returns the size of the stack
   */
  public int size() {
    return list.size();
  }
  
  /**
   *  Prints the full stack in the console
   */
  public void printStack () {
    list.print();
  }
}


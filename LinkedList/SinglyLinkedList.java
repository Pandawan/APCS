import java.util.*;

/**
 *  Implementation of lists, using singly linked elements.
 *
 * @author     G. Peck
 * @created    April 27, 2002
 * 
 * Modified: 
 * Miguel Tenant de La Tour
 * March 6, 2017
 */
public class SinglyLinkedList
{
  private ListNode first;  // first element
  private ListNode last; // last element
  
  /**
   *  Constructor for the SinglyLinkedList object
   *  Generates an empty list.
   */
  public SinglyLinkedList()
  {
    first = null;
  }
  
  /**
   *  Returns the first element in this list.
   *
   * @return  the first element in the linked list.
   */
  public Object getFirst()
  {
    if (first == null)
    {
      throw new NoSuchElementException();
    }
    else
      return first.getValue();
  }
  
  /**
   *  Returns the last element in this list.
   *
   * @return  the last element in the linked list.
   */
  public Object getLast()
  {
    if (last == null)
    {
      throw new NoSuchElementException();
    }
    else
      return last.getValue();
  }
  
  /**
   *  Inserts the given element at the beginning of this list.
   *
   * @param  value  the element to be inserted at the beginning of this list.
   */
  public void addFirst(Object value)
  {
    // note the order that things happen:
    // head is parameter, then assigned
    
    first = new ListNode(value, first);
    
    if (first.getNext() == null)
      last = first;
  }
  
  /**
   *  Inserts the given element at the beginning of this list.
   *
   * @param  value  the element to be inserted at the beginning of this list.
   */
  public void addLast(Object value)
  {
    // note the order that things happen:
    // head is parameter, then assigned
    
    if (first == null){
      first = new ListNode(value, null);
      last = first;
    }else {
      
      ListNode temp = new ListNode(value, null);
      last.setNext(temp);
      last = temp;
    }
  }
  
  /**
   * Returns the size of the linked list from front to end
   */
  public int size () {
    ListNode currentNode = first;
    int count = 0;
    
    while (currentNode != null) {
      count++;
      if (currentNode.getNext() != null){
        currentNode = currentNode.getNext();
      }
      else{
        return count;
      }
    }
    return -1;
  }
  
  /**
   *  Prints the full list in the console
   */
  public void printList () {
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
  
  /* 
   * Inserts an object in the list, and make sure it is sorted.
   * 
   * @param Object to insert
   */
  public void insertInOrder(Integer value) {
    if (first == null){
      addFirst(value);
    }
    
    // Throw error if the ListNode isn't of type Integer, can't compare them
    if ((first.getValue() instanceof Integer) == false)
      throw new IllegalArgumentException();
    
    
    // If the passed value is the lowest value
    if (((Integer)(first.getValue())) > value){
      addFirst(value);
    }
    // If the passed value is the highest value
    else if (((Integer)last.getValue()) < value) {
      addLast(value);
    }
    // If passed value is in between
    else {
      ListNode currentNode = first;
      while (currentNode.getNext() != null) {
        // If the node is bigger than the value, then insert here
        if (((Integer)currentNode.getNext().getValue()) > value){
          ListNode temp = new ListNode(value, currentNode.getNext());
          currentNode.setNext(temp);
          return;
        }
        // If the node is smaller than the value, continue
        else {
          currentNode = currentNode.getNext();
        }
      }
    }
  }
  
  /*
   * Removes the given value from the linked list
   * 
   * @param The object to test and remove
   */
  public Integer remove (Integer obj) {
    if (first == null){
      return null;
    }
    
    // Throw error if the ListNode isn't of type Integer, can't compare them
    if ((first.getValue() instanceof Integer) == false)
      throw new IllegalArgumentException();
    
    ListNode currentNode = first;
    // Loop until the end
    while (currentNode.getNext() != null) {
      // If we have found it
      if (currentNode.getNext().getValue().equals(obj)){
        ListNode removingNode = currentNode.getNext();
        currentNode.setNext(removingNode.getNext());
        return (Integer)removingNode.getValue();
      }
      // Not found, continue looping
      else {
        currentNode = currentNode.getNext();
      }
    }
    // Got through all of it and didn't find it
    return null;
    
  }
}


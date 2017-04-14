/**
 *  Implementation of a node of a singly linked list.
 *
 *  Adapted from the College Board's AP Computer Science AB:
 *  Implementation Classes and Interfaces.
 *
 *  Modification to only use int data types  March, 2017
 */
public class ListNode
{
  private int value;
  private ListNode next;

  /**
   *  Constructs a new element with object initValue,
   *  followed by next element
   *
   * @param  initValue  New element object
   * @param  initNext   Reference to next element
   */
  public ListNode(int initValue, ListNode initNext)
  {
    value = initValue;
    next = initNext;
  }

  /**
   *  Sets the value attribute of the ListNode object
   *
   * @param  theNewValue  value attribute of the ListNode object
   */
  public void setValue(int theNewValue)
  {
    value = theNewValue;
  }

  /**
   *  Sets reference to new next value
   *
   * @param  theNewNext  The new next value
   */
  public void setNext(ListNode theNewNext)
  {
    next = theNewNext;
  }

  /**
   *  Returns value associated with this element
   *
   * @return    The value associated with this element
   */
  public int getValue()
  {
    return value;
  }

  /**
   *  Returns reference to next value in list
   *
   * @return    The next value in the list
   */
  public ListNode getNext()
  {
    return next;
  }
}

/**
 *  Demostrates the use of the SinglyLinkedList class.
 *
 * @author     G. Peck
 * @created    May 12, 2002
 */
public class List1
{
  SinglyLinkedList myList;
  
  public List1()
  {
    myList = new SinglyLinkedList();
  }
  
  /**
   *  Creates a SinglyLinkedList of 5 ordered Integer nodes
   */
  public void createList()
  {
    for (int k = 1; k <= 20; k++)
    {
      myList.addLast(new Integer(k));
    }
  }
  
  /**
   *  Demostrates the use of the SinglyLinkedList class.
   *  Creates and prints a list of 5 consecutive Integer ojects.
   *
   * @param  args  The command line arguments (not used)
   */
  public static void main(String[] args)
  {
    
    System.out.println("====== Phase 1 ======");
    List1 sList = new List1();
    
    sList.createList();
    
    System.out.println("First Element: " + sList.myList.getFirst());
    System.out.println("Last Element: " + sList.myList.getLast());
    System.out.print("SinglyLinkedList: ");
    sList.myList.printList();
    System.out.println("Number of Nodes: " + sList.myList.size());
    
    System.out.println("\n\n====== Phase 2 ======");
    
    List1 listy = new List1();
    
    listy.myList.insertInOrder(new Integer(3));
    listy.myList.insertInOrder(new Integer(5));
    listy.myList.insertInOrder(new Integer(15));
    listy.myList.insertInOrder(new Integer(1));
    listy.myList.insertInOrder(new Integer(3));
    listy.myList.insertInOrder(new Integer(9));
    listy.myList.insertInOrder(new Integer(-2));
    listy.myList.insertInOrder(new Integer(8));
    
    System.out.print("Printing phase 2 list: ");
    listy.myList.printList();
    
    System.out.println("Item removed from list: " + listy.myList.remove(new Integer(9)));
    System.out.println("Item removed from list: " + listy.myList.remove(new Integer(8)));
    System.out.println("Item not in list: " + listy.myList.remove(new Integer(6)));
    
    System.out.print("After removing 9, 8, 6: ");
    listy.myList.printList();
  }
}

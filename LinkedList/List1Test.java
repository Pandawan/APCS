//Nirav Adunuthula 
// 
//List1Test.java 
// 
//Driver that accomplishes tasks from the assignment 
 
public class List1Test { 
         
  SinglyLinkedList myList; 
 
  public List1Test() 
  { 
    myList = new SinglyLinkedList(); 
  } 
 
  /** 
   *  Creates a SinglyLinkedList of 5 Integer nodes 
   */ 
  public void createList() 
  { 
    for (int k = 20; k >0; k--) 
    { 
      myList.addFirst(new Integer(k)); 
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
   System.out.println("****PHASE 1****"); 
    List1Test sList = new List1Test(); 
    sList.createList(); 
 System.out.println("First Element: " + sList.myList.getFirst()); 
    System.out.println("Last Element: " + sList.myList.getLast()); 
    sList.myList.printList(); 
    System.out.println("Number of Nodes: " + sList.myList.size()); 
     
    System.out.println("****PHASE 2****"); 
    List1Test listy = new List1Test(); 
     
    //insert the items in order 
    listy.myList.insertInOrder(new Integer(3)); 
    listy.myList.insertInOrder(new Integer(5)); 
    listy.myList.insertInOrder(new Integer(15)); 
    listy.myList.insertInOrder(new Integer(1)); 
    listy.myList.insertInOrder(new Integer(3)); 
    listy.myList.insertInOrder(new Integer(9)); 
    listy.myList.insertInOrder(new Integer(-2)); 
    listy.myList.insertInOrder(new Integer(8)); 
     
    listy.myList.printList(); 
     
    System.out.println("Item removed from list: "+listy.myList.remove(new Integer(9))); 
    System.out.println("Item removed from list: "+ listy.myList.remove(new Integer(8))); 
    System.out.println("Item not in list: "+listy.myList.remove(new Integer(6))); 
     
    listy.myList.printList(); 
 
  } 
} 

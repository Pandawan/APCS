class FlexTester2 {
  public static void main (String[] args) {
    System.out.println("Hello World!");
    System.out.println("This is FlexTester v2.0!\r\n");
    CompareToEqualsTest();
    SortTest();
    GetValueSearchForTest();
    System.out.println("\r\nGoodbye!");
  }
  
  public static void GetValueSearchForTest () {
    System.out.println("======== getValue() ========");
    FlexArrayRectangle list1 = CreateRandomRectangle(20, true);
    
    System.out.println("List before getValue: " + list1);
    
    System.out.println("Middle of the list: " + list1.getValue(list1.getLength() / 2 - 1));
    System.out.println("First element of the list: " + list1.getValue(0));
    System.out.println("Last element of the list: " + list1.getValue(list1.getLength() - 1));
    System.out.println("Non active element of the list: " + list1.getValue(list1.getLength() + 100));
    
    System.out.println("======== searchFor() ========");
    System.out.println("List before searchFor: " + list1);
    System.out.println("SearchFor element with value Rect(12,12) IN the list: " + list1.searchFor(new Rectangle(12, 12)));
    System.out.println("SearchFor element with value Rect(100,100) NOT IN the list: " + list1.searchFor(new Rectangle(100,100)));
  }
  
  public static void SortTest () {
    System.out.println("======== sort() ========");
    
    FlexArrayRectangle list1 = CreateRandomRectangle(20, true);
    
    System.out.println("List before sort: " + list1);
    
    list1.sort();
    
    System.out.println("List after sort: " + list1);
  }
  
  public static void CompareToEqualsTest () {
    System.out.println("======== compareTo() ========");
    
    FlexArrayRectangle list1 = CreateRandomRectangle(20, false);
    FlexArrayRectangle list2 = CreateRandomRectangle(20, true);
    FlexArrayRectangle list3 = CreateRandomRectangle(12, true);
    
    System.out.println(list1);
    System.out.println(list2);
    System.out.println(list3);
    
    System.out.println(list1.compareTo(list2)); // Returns 0, since they have same sum
    System.out.println(list1.compareTo(list3)); // Returns 1, they have different sum
    System.out.println(list2.compareTo(list3)); // Returns 1, they have different sum
    
    System.out.println("======== equals() ========");
    
    System.out.println(list1.equals(list2)); // Returns true, tho they are in different order, they have the same sum
    System.out.println(list1.equals(list3)); // Returns false, they have different sum
  }
  
  // Creates a Random Primitive Object for testing
  // j is the size of the array, random is whether or not the values should be in a random order
  public static FlexArrayRectangle CreateRandomRectangle (int j, boolean random) {
    FlexArrayRectangle list = new FlexArrayRectangle(j);
    for (int i = 0; i < j; i++) {
      if (random)
        list.insert((int)(Math.random() * j - 1), new Rectangle(i, i));
      else
        list.append(new Rectangle(i, i));
    }
    return list;
  }
}
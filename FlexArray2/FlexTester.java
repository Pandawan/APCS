class FlexTester {
  public static void main (String[] args) {
    //MainVersion1();
    //MainError();
    MainVersion2();
  }
  
  static void MainVersion2 () {
    System.out.println("\r\n========== Test Version 2 Primitive ========== \r\n");
    TestVersion2Int();
    System.out.println("\r\n========== Test Version 2 Rectangle ========== \r\n");
    TestVersion2Rect();
  }
  
  static void MainError () {
    System.out.println("========== ERROR CHECK ========== \r\n");
    Errors();
  }
  
  static void MainVersion1 () {
    System.out.println("========== Primitive ========== \r\n");
    Primitive();
    System.out.println();
    System.out.println("========== Rectangle ========== \r\n");
    Rectangle();
    System.out.println();
  }
  
  static void TestVersion2Int () {
    FlexArrayPrimitive fr = new FlexArrayPrimitive();
    
    for (int i = 0; i < 15; i++){
      fr.append(i);
    }
    
    FlexArrayPrimitive fr2 = new FlexArrayPrimitive();
    
    // Not the same [false]
    System.out.println(fr.equals(fr2));
    
    for (int i = 0; i < 15; i++){
      fr2.append(i);
    }
    // Same [true]
    System.out.println(fr.equals(fr2));
    
    FlexArrayPrimitive fr3 = new FlexArrayPrimitive();
    
    for (int i = 15; i > 0; i--){
      fr3.append(i);
    }
    
    // Unsorted
    System.out.println(fr3);
    
    fr3.sort();
    
    //Sorted
    System.out.println(fr3);
    
    // Print out of logical size [-999]
    System.out.println(fr3.getValue(15));
    
    // Print correct value [4]
    System.out.println(fr3.getValue(3));
    
    // Search for unexisting value [-1]
    System.out.println(fr3.searchFor(100));
    
    // Search for Rectangle with value of 3 [2]
    System.out.println(fr3.searchFor(3));
    
  }
  
  static void TestVersion2Rect () {
    FlexArrayRectangle fr = new FlexArrayRectangle();
    
    for (int i = 0; i < 15; i++){
      fr.append(new Rectangle(i, i));
    }
    
    FlexArrayRectangle fr2 = new FlexArrayRectangle();
    
    // Not the same [false]
    System.out.println(fr.equals(fr2));
    
    for (int i = 0; i < 15; i++){
      fr2.append(new Rectangle(i, i));
    }
    // Same [true]
    System.out.println(fr.equals(fr2));
    
    FlexArrayRectangle fr3 = new FlexArrayRectangle();
    
    for (int i = 15; i > 0; i--){
      fr3.append(new Rectangle(i, i));
    }
    
    // Unsorted
    System.out.println(fr3);
    
    fr3.sort();
    
    //Sorted
    System.out.println(fr3);
    
    // Print out of logical size [null]
    System.out.println(fr3.getValue(15));
    
    // Print correct value [4]
    System.out.println(fr3.getValue(3));
    
    // Search for unexisting value [-1]
    System.out.println(fr3.searchFor(new Rectangle(5, 10)));
    
    // Search for Rectangle with value of 3 [2]
    System.out.println(fr3.searchFor(new Rectangle(3, 3)));
    
  }
  
  static void Errors () {
    FlexArrayPrimitive fp = new FlexArrayPrimitive();
    
    // Empty
    System.out.println("1" + fp);
    
    // Appending
    for (int i = 0; i < 15; i++){
      fp.append(i);
    }
    
    System.out.println("1.5" + fp);
    
    fp.insert(-1, 5);
    
    System.out.println("2" + fp);
    
    fp.insert(0, 5);
    
    System.out.println("3" + fp);
    
    fp.discard(-1);
    
    System.out.println("4" + fp);
    
    fp.discard(0);
    
    System.out.println("5" + fp);
    
    fp.insert(100, 5);
    
    System.out.println("6" + fp);
    
    fp.discard(102);
    
    System.out.println("7" + fp);
    
    fp.append(10);
    
    System.out.println("8" + fp);
    
    System.out.println("9" + fp.getLength());
    
    fp.insert(17, 2);
    
    System.out.println("10" + fp);
  }
  
  static void Rectangle () {
    FlexArrayRectangle fp = new FlexArrayRectangle(10);
    
    //Empty
    System.out.println(fp.isEmpty());
    
    //Length
    System.out.println(fp.getLength());
    
    // Empty
    System.out.println(fp);
    
    // Appending
    for (int i = 0; i < 5; i++){
      fp.append(new Rectangle(i, i));
    }
    System.out.println(fp);
    
    // Inserting
    fp.insert(2, new Rectangle(5, 5));
    System.out.println(fp);
    
    // Discarding
    fp.discard(2);
    System.out.println(fp);
    
    //Is Empty
    System.out.println(fp.isEmpty());
    
    //Length
    System.out.println(fp.getLength());
  }
  
  static void Primitive () {
    FlexArrayPrimitive fp = new FlexArrayPrimitive(10);
    
    //Empty
    System.out.println(fp.isEmpty());
    
    //Length
    System.out.println(fp.getLength());
    
    // Empty
    System.out.println(fp);
    
    // Appending
    for (int i = 0; i < 5; i++){
      fp.append(i);
    }
    System.out.println(fp);
    
    // Inserting
    fp.insert(2, 5);
    System.out.println(fp);
    
    // Discarding
    fp.discard(2);
    System.out.println(fp);
    
    //Is Empty
    System.out.println(fp.isEmpty());
    
    //Length
    System.out.println(fp.getLength());
  }
  
}

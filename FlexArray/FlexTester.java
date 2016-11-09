class FlexTester {
  public static void main (String[] args) {
    System.out.println("========== Primitive ========== \r\n");
    Primitive();
    System.out.println();
    System.out.println("========== Rectangle ========== \r\n");
    Rectangle();
    System.out.println();
    System.out.println("========== ERROR CHECK ========== \r\n");
    Errors();
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

class FlexTester {
  public static void main (String[] args) {
    System.out.println("========== Primitive ========== \r\n");
    Primitive();
    System.out.println();
    System.out.println("========== Rectangle ========== \r\n");
    Rectangle();
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

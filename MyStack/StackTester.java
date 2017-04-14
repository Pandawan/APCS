public class StackTester
{
 public static void main(String[] args)
 {
  
  System.out.println("====== Tester ======");
  Empty();
  Normal();
 }
 
 public static void Empty() {
  System.out.println("\n==== Empty ====");
  MyStack stack = new MyStack();
  
  System.out.println("Stack Size: " + stack.size());
  System.out.print("Empty Stack: ");
  stack.printStack();
  
  try {
   System.out.println(stack.pop());
  }catch (IllegalStateException e) {
   System.out.println("Pop Illegal: " + e);
  }
  
  try {
   System.out.println(stack.peekTop());
  }catch (IllegalStateException e) {
   System.out.println("PeekTop Illegal: " + e);
  }
 }
 
 public static void Normal () {
  System.out.println("\n==== Normal ====");
  // Create Stack Object
  MyStack stack = new MyStack();
  // Print size
  System.out.println("Stack Size: " + stack.size());
  
  // Push values 0-4
  for(int i = 0; i < 5; i++)
   stack.push(i);
  
  System.out.print("After Pushing 5 values ");
  stack.printStack();
  System.out.println("Stack Size: " + stack.size());
  
  // Pop 2 values
  for(int i = 0; i < 2; i++)
   stack.pop();
  
  System.out.print("After Popping 2 values ");
  stack.printStack();
  System.out.println("Stack Size: " + stack.size());
  
  // Pop 1 value
  stack.pop();
  
  System.out.print("After Popping 1 value ");
  stack.printStack();
  System.out.println("Stack Size: " + stack.size());
  
  for(int i = -4; i < -2; i++)
   stack.push(i);
  
  System.out.print("After Pushing 2 (negative) values ");
  stack.printStack();
  System.out.println("Stack Size: " + stack.size());
  
  System.out.println("Peek Top: " + stack.peekTop());
 }
 
}

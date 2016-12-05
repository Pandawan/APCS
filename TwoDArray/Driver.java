public class Driver{
  public static void main(String[] args){
    final int NUM = 6;
    TwoDArray app = new TwoDArray();
    int [][] matrix = new int[NUM][NUM];
    app.load(matrix);
    System.out.println("original values read from file: ");
    app.display(matrix);
    System.out.println("values after a call to method fun: ");
    app.fun(matrix);
    app.display(matrix);
    System.out.println("values after a call to method numberOfDiagZeros: ");
    app.numberOfDiagZeros(matrix);
    app.display(matrix);
    
  }
}

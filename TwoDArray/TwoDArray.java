import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class TwoDArray {
  final private static int NUM = 6;
  
  public TwoDArray(){
  }
  
  public void load(int[][] grid){
    int row, col;
    String fileName = "data.txt";
    try{
      Scanner inFile = new Scanner(new File(fileName));
      for (row = 0; row < NUM; row++){
        for (col = 0; col < NUM; col++){
          grid[row][col] = inFile.nextInt();
        }
      }
    }catch(IOException e){
      System.out.println("Error: " + e.getMessage());
    }
  }
  
  public void display(int[][] grid){
    int row, col;
    for (row = 0; row < NUM; row++){
      for (col =0; col < NUM; col++){
        System.out.print(grid[row][col] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
  
  public void fun(int[][] grid){
    int row, col;
    for (row = 0; row < NUM; row++){
      for (col = 0; col < NUM; col++)
        if ((grid[row][col] % 2) == 0){
        grid[row][col] = 0;
      }
    }
  }
  
  public void numberOfDiagZeros(int[][] grid)
  {
    int[][] copy = new int[grid.length][grid[0].length];
    
    for(int col = 0; col < grid.length; col++){
      for (int row = 0; row < grid[col].length; row++){
        copy[col][row] = grid[col][row];
        grid[col][row] = 0;
        
        if (col > 0 && row > 0)
          if (copy[col - 1][row - 1] == 0)
          grid[col][row]++;
        
        if (col < grid.length - 1 && row > 0)
          if (copy[col + 1][row - 1] == 0)
          grid[col][row]++;
        
        if (col > 0 && row < grid[col].length - 1)
          if (copy[col - 1][row + 1] == 0)
          grid[col][row]++;
        
        if (col < grid.length - 1 && row < grid[col].length - 1)
          if (copy[col + 1][row + 1] == 0)
          grid[col][row]++;
        
      }
    }
    grid = copy;
  }
}







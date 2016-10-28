// Name: Miguel Tenant de La Tour
//
// Program File: Die.java
//
// Class Description: Creates a die object that randomly picks a number between 1-6 (both inclusive).

public class Die
{
  int dieRoll = 0;
  
  public void roll () {  
    int result = (int)(Math.random() * 6 + 1);
    dieRoll = result;
  }
  
  public int getNumDots () {
    return dieRoll;
  }
  
}
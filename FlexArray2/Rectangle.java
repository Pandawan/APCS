/**
 * @(#)Rectangle.java
 *
 * purpose:  used in driver to show difference of memory allocation
 *   of Strings vs. "real" objects (Rectangles)
 *
 * @author Debra Troxell
 *
 * @version 1.00 2009/11/13
 */

public class Rectangle
{
 int myLength;
 int myWidth;

 //default constructor
 public Rectangle()
    {
     myWidth = 0;
     myLength = 0;
    }

    //constructor that takes values for both parameters
    public Rectangle(int w, int l)
    {
     myWidth = w;
     myLength = l;
    }

    //accessors
    public int getWidth()
    {
     return myWidth;
    }

    public int getLength()
    {
     return myLength;
    }

    //modifiers
    public void setWidth(int w)
    {
     myWidth = w;
    }

    public void setLength(int len)
    {
     myLength = len;
    }

    public String toString()
    {
     return("Rectangle, width = " + myWidth + " length = " + myLength);
    }

    // Returns true if both length and width are equal
    public boolean equals(Rectangle r) {
        return (myLength == r.myLength && myWidth == r.myWidth);
    }

    // Returns the difference between the two areas
    public int compareTo (Rectangle r) {
        return (myLength * myWidth) - (r.myLength * r.myWidth);
    }
}

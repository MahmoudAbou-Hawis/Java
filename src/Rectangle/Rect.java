package Rectangle;

public class Rect {
   private int width ;
   private int height;

   public Rect(int width, int height)
   {
       this.width = width;
       this.height = height;
   }

   public double getWidth()
   {
       return width;
   }

    public double getHeight()
    {
        return height;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public double getArea()
    {
        return width * height;
    }

    public double getPerimeter()
    {
        return (2 * width) + (2 * height);
    }
}

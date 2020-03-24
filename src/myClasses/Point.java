package myClasses;

public class Point implements Comparable<Point>
{
    float x;
    float y;
    float z;
    public Point( float x,float y, float z)

    {
        this.x = x; // координаты точки
        this.y = y;
        this.z = z;
    }

    @Override
        public String toString()
    {
        return "x="+x+" y="+y+" z="+z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }
    @Override
    public int hashCode()
    {
        float i=x + y + z ;
        return (int)i  ;
    }
    @Override
    public int compareTo(Point o)
    {
        return (int)(x-o.x);
    }
}



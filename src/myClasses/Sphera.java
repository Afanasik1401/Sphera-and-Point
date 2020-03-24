package myClasses;

public class Sphera {
    float x;
    float y;
    float z;
    float r;
    public Sphera( float x,float y, float z,float x0,float y0,float z0)

    {
        this.x = x; // координаты точки центра
        this.y = y;
        this.z = z;
        this.r = (float)(Math.sqrt(( Math.pow(x-x0, 2) + Math.pow(y-y0, 2)+Math.pow(z-z0, 2))));
    }
    /*public float getX()
    {
        return x;
    }

    public float getY()
    {
        return y;
    }

    public float getZ()
    {
        return z;
    }
    public float getR()
    {
        return r;
    }*/
    @Override
    public String toString()
    {
        return "(x" + "-" + x + ")^2" + "(y" + "-" + y + ")^2" + "(z" + "-" + z + ")^2 ="+ Math.pow(r, 2);
    }
    public int hashCode()
    {
        float i=x + y + z ;
        return (int)i  ;
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
    /* @Override
     public boolean equals(Object o) { //всегда передоется объект самого общего типа - Object
         if (o == null) //не пустой ли переданный указатель, те сущ-ет ли переданная ссылка
             return false;
         if (o == this) //this - ссылка на текущий объект класса Applicant
             return true;
         if (!(o instanceof Point)) //instanceof: 1 - o это объект класса Applicant, иначе - 0
             return false;
         Point a = (Point) o; //преобразование ссылки о к нужному типу Applicant
         return x == a.x && y== a.y && z==a.z ;
     }*/
    public int belongTo(float a,float b,float c)
    {
        int i=100;
        if( r==(float)(Math.sqrt(( Math.pow(a-x, 2) + Math.pow(y-y, 2)+Math.pow(c-z, 2)))))
            i=0;              //на сфере
        if( r>(float)(Math.sqrt(( Math.pow(a-x, 2) + Math.pow(y-y, 2)+Math.pow(c-z, 2)))))
            i=-1;              //внутри сферы
        if (r<(float)(Math.sqrt(( Math.pow(a-x, 2) + Math.pow(y-y, 2)+Math.pow(c-z, 2)))))
            i=1;              // вне сферы
        return i;
    }
   // @Override
  // public int compareTo(Sphera o)
   // {
    //    return (int)(r-o.r);
    //}
}


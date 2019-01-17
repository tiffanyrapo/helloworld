package quickstart;

/**
 * 建立CCircle類別來計算圓周率-1
 */

class CCircle
{
    double pi;//定義資料成員
    double radius;

    void show_area()//定義函數成員area,用於計算半徑和圓面積
    {
        System.out.println("area= " +pi *radius *radius);
        System.out.println("pi= " +pi);
        System.out.println("radius= " +radius);
    }

    void setCircle(double p, double r)
    {
        pi = p;
        radius = r;
    }

    double getRadius()  //用來傳回物件的半徑
    {
        return radius;
    }
//    void setRadius(double r)   //定義函數setRadius,可用來設定半徑值為r
//    {
//        radius = r;
//    }
}

public class hw0927_Class_circle
{
    public static void main(String args[])
    {
        CCircle cir1 = new CCircle();
//        CCircle cir2 = new CCircle();

        //cir1.radius = cir2.radius = 2.0;
        //cir2.pi = 3.0;
        cir1.setCircle(3.1416,2.0);
        cir1.show_area();
//        cir2.show_area();
//        cir1.setRadius(4.0);

    }
}

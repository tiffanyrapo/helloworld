package quickstart;

/**
 * private member私有成員 && public member公有成員 練習
 */

class Circle
{
    private double pi = 3.14;
    private double radius;

    private double area(){  //設定私有成員
        return pi * radius * radius;
    }
    public void show_area(){   //設定公有成員
        System.out.println("area="+ area()); //call私有成員area()
    }
    public void setRadius (double r){  //設定公有的函數成員
        if(r > 0)
        {
            radius = r;   //將私有成員設為r
            System.out.println("radius= "+radius);
        }
        else
            System.out.println("input error");
    }
}

public class hw1002_private_public
{
    public static void main(String args[])
    {
        Circle cir1 = new Circle();

//        cir1.radius = -2.0; //radius被private宣告成私有，無法被修改
        cir1.setRadius(2.0);
        cir1.show_area();   //呼叫公有的show_area函數

    }
}

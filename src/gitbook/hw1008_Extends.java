package gitbook;

/**
 * 繼承的應用練習
 * form Java 7 Unit 10 p10-1~p10-10
 */

class CCircle  //父類別
{
    private static double pi = 3.14;
    private double radius;

    public CCircle() //CCircle()建構元
    {
        System.out.println("CCircle() constructor called ");
    }

    public CCircle(double r)   //父類有1個引數的建構元
    {
        System.out.println("CCircle(double r) constructor called ");
        radius = r;
    }

    public void setRadius(double r)
    {
        radius = r;
        System.out.println("radius ="+radius);
    }
    public void show()
    {
        System.out.println("area = "+pi*radius*radius);
    }
}


class CCoin extends CCircle  //子類別ccoin,繼承ccircle類別
{
    private int value;  //子類別的資料成員

    public CCoin()   //子類別的建構元
    {
        System.out.println("CCoin () constructor called");
    }
    public CCoin(double r, int v)   //子類有2個引數的建構元
    {
        super(r);
        value = v;
        System.out.println("CCoin (double r, int v) constructor called");
    }

    public void setValue(int t)  //子類別的setValue函數
    {
        value = t;
        System.out.println("value="+value);
    }
}

public class hw1008_Extends
{
    public static void main(String args[])
    {
        CCoin coin1 = new CCoin();  //建立coin物件，call父類無引數的建構元
        CCoin coin2 = new CCoin(2.5,10);  //建立物件，call子類有2引數的建構元

        coin1.setRadius(2.0);  //呼叫由父類別繼承的setRadius
        coin1.show();
        coin1.setValue(5);  //呼叫由子類別繼承的setValue

        coin2.show();
    }
}

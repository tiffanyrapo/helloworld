package gitbook;

/**
 * protected 保護成員的練習
 * 只供父類跟子類的內部存取，外界無法更改或讀取
 * p10-16 ~
 */

class CCircle1  //super class
{
    protected static double pi = 3.14;  //宣告成protected
    protected double radius;

    public void show()
    {
        System.out.println("area = "+pi*radius*radius);
    }
}

class CCoin1 extends CCircle1  //sub class
{
    private int value;

    public CCoin1 (double r, int v)
    {
        radius = r;  //in sub class可直接取用super class的 protected成員
        value = v;
        System.out.println("radius="+radius+", value="+value);
    }
}

public class hw1008_protected
{
    public static void main(String args[])
    {
        CCoin1 coin = new CCoin1(2.5,10);
        coin.show();
    }
}

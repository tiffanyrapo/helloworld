package quickstart;

/**
 * 類別的物件建立及存取-3
 */
class CRectangle3
{
    int width,height; //定義資料成員

    int area ()  //定義函數成員area,用於計算面積
    {
        return width*height;
    }

    int perimeter()  //定義函數成員perimeter,用於計算周長
    {
        return 2*(width+height);
    }
}


public class hw0927_class3
{
    public static void main(String args[])
    {
        CRectangle3 rect1;
        rect1 = new CRectangle3();

        rect1.width = 20; //設定矩形rect1的寬及高
        rect1.height =15;

        System.out.println("area: " + rect1.area());
        System.out.println("perimeter: " + rect1.perimeter());
    }
}

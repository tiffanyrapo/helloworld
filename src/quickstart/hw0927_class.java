package quickstart;

/**
 *類別的物件建立及存取
 */
class CRectangle
{
    int width,height; //定義資料成員
}

public class hw0927_class
{
    public static void main(String args[])
    {
        CRectangle rect1;
        rect1 = new CRectangle(); //建立新物件

        rect1.width = 20; //設定矩形rect1的寬及高
        rect1.height =15;

        System.out.println("wigth: " + rect1.width);
        System.out.println("height: " + rect1.height);
    }
}

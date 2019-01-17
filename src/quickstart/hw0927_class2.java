package quickstart;

/**
 * 類別的物件建立及存取-2
 */
public class hw0927_class2
{
    public static void main(String args[])
    {
        CRectangle2 rect1,rect2; //宣告變數
        rect1 =new CRectangle2();  //建立物件
        rect2 =new CRectangle2();

        rect1.width = 20;  //設定矩形rect1的寬高
        rect1.height = 15;

        rect2.width = 25;  //設定矩形rect2的寬高
        rect2.height = rect1.height+3;

        System.out.println("rect1.wigth: " + rect1.width);
        System.out.println("rect1.height: " + rect1.height);
        System.out.println("rect2.wigth: " + rect2.width);
        System.out.println("rect2.height: " + rect2.height);
    }
}

class CRectangle2
{
    int width,height; //定義資料成員
}
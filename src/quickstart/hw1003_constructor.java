package quickstart;

/**
 * constructor建構元的使用練習
 */

class CCircle7
{
    private String color;
    private double pi = 3.14;
    private double radius;

//    public CCircle7(double r)   //定義建構元-1
    public CCircle7()   //沒有引數的建構元
    {
        System.out.println("constructor CCircle() called");
        color = "GREEN";
        radius = 1.0;

    }

    public void show(){
        System.out.println("radius ="+radius+ ", area= "+pi*radius*radius);
    }
}



public class hw1003_constructor
{
    public static void main(String args[])
    {
//        CCircle7 cir1 = new CCircle7(4.0);  //建立物件並呼叫建構元-1
        CCircle7 cir1 = new CCircle7();  //呼叫沒有引數的建構元

        cir1.show();

    }
}
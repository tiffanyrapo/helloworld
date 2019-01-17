package quickstart;

/**
 * 函數的多載練習-1
 * 註解:
 * 1) private運算子後 套void函數 println出來的值不能在main裡被修改
 */

class CCircle2  //定義類別
{
    String color;
    private double pi = 3.14;  //private:設為私有成員
    double radius;

    /**
     *不同函數名稱不同型態的多載用法
     */
    void Color(String str){  //設定color radius pi函數
        color = str;
    }
    void Radius (double r){
        radius = r;
    }

    void pi(double p){
        pi = p;
    }
//    void setAll (String str, double r){　　
//        color = str;
//        radius = r;
//    }

    /**
     *同個函數名稱不同型態的多載用法
     */
//    void setCircle(String str){  //設定color成員
//        color = str;
//    }
//    void setCircle(double r){   //設定radius成員
//        radius = r;
//    }
//    void setCircle(String str,double r) {
//        color = str;
//        radius = r;
//    }

    void show(){  //印出半徑、顏色與圓面積
        System.out.println("color= "+color+", Radius="+radius);
        System.out.println("area= "+pi*radius*radius);
        System.out.println("pi="+pi);
    }

}
public class hw1001_classCirle8
{
    public static void main(String args[])
    {
        CCircle2 cir1 = new CCircle2();

/**
 * 同個函數名稱不同型態的多載用法-解
 */
//        cir1.setCircle("Red");
//        cir1.setCircle(2.0);
//        cir1.setCircle("YELLOW",5.0);
//        cir1.setCircle();

/**
 * 不同函數名稱不同型態的多載用法-解
 */
        cir1.Radius(.55);
        cir1.Color("RED");
        cir1.show();
        cir1.pi(7.14999);
    }
}


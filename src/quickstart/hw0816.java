package quickstart;

public class hw0816 {
//    public static void main(String args[]){
//        int x=40;
//        if(x<50)
//            System.out.println("x的值小於50"); //if、關係運算子練習
//        else
//            System.out.println("x的值大於50");

//        if(x>50==true)
//            System.out.println("x的值小於50為真");
//        if (x>50==false)
//            System.out.println("x的值小於50為假");
//    }

    public static void main(String args[])
    {
        //運算子練習
        int a=5,b=5,c;
        System.out.println("a="+a+",b="+b); //遞增、遞減運算子
        c=a--;
        System.out.println("c="+c+",a="+a); //印出a++
        c=++b;
        System.out.println("c="+c+",b="+b); //印出++b

        //比較、條件運算
        System.out.println("10 > 5: "+ (10>5));
        System.out.println("10 >= 5: "+(10>=5));
        System.out.println("10 < 5: "+(10<5));
        System.out.println("10 <= 5"+(10<=5));
        System.out.println("10 == 5"+(10==5));
        System.out.println("10 != 5"+(10!=5));

    }

}

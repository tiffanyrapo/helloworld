package quickstart;

public class hw0910_AutoBox
{
    //參考: https://caterpillar.gitbooks.io/javase6tutorial/content/c4_2.html

//    public static void main(String args[])
//    {

//        Integer data1 = 10 ,data2 = 20;

        //轉為double值再除3
//        System.out.println(data1.doubleValue() / 3);

        //兩值比較
//        System.out.println(data1.compareTo(data2));

        //AutoBoxing另一種方法-1
//        int i = 10;
//        Integer integer = i;

        //AutoBoxing另一種方法-2,先autobox成Float型態，再指定給number
//        Number number = 3.14f;

//    }

    public static void main(String args[])
    {
        Integer i1 = 200 , i2 =200;

        if(i1.equals(i2))
           System.out.println("i1 == i2");
        else
            System.out.println("i1 != i2");
    }
}

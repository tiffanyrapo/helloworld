package quickstart;

public class hw0910_wrap
{
    public static void main(String args[])
    {
        int data1 = 10 , data2 = 20 ;

        //使用Integer來包裹int資料
        Integer data1Wrapper = new Integer(data1);
        Integer data2Wrapper = new Integer(data2);

        //除3
        System.out.println(data1 / 3);

        //轉為double型態後再除3
        System.out.println(data1Wrapper.doubleValue() / 3);

        //兩值比較
        System.out.println(data1Wrapper.compareTo(data2Wrapper));
    }
}

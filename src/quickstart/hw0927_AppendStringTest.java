package quickstart;

/**
 * 使用StringBuilder測試字串執行效能
 */
public class hw0927_AppendStringTest
{
    public static void main(String args[])
    {
        String text = "";

        //使用+串接字串
        long beginTime = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
            text = text + i;
        long endTime = System.currentTimeMillis();
        System.out.println("執行時間: " + (endTime - beginTime));

        //使用StringBuilder取得for迴圈執行前、後的系統時間
        StringBuilder builer = new StringBuilder("");
        beginTime = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
            //append也接受基本資料型態,執行時間會更縮短
            builer.append(i);
            //builer.append(String.valueOf(i));
        endTime = System.currentTimeMillis();
        System.out.println("執行時間: " + (endTime - beginTime));


    }
}

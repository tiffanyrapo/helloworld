package quickstart;

/**
 * Flyweight模式DEMO
 */
public class hw0925_InternString
{
    public static void main(String args[])
    {
        String str1 = "fly";
        String str2 = "weight";
        String str3 = "flyweight";
        String str4 = null;

        str4 = str1 + str2;
        System.out.println(str3 == str4);

        str4 = (str1 + str2).intern();
        System.out.println(str3 == str4);
        System.out.println(str1.equals(str2));
        //比較兩個字串物件的字元值是否相同用equals
    }
}

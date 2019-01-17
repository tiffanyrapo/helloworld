package quickstart;

public class hw0921_StringDemo
{
    public static void main(String args[])
    {
        String text = "HELLO";

        System.out.println("字串內容: " + text);
        System.out.println("字串長度: " + text.length());
        System.out.println("等於HELLO?: " + text.equals("HELLO"));
        System.out.println("轉為大寫: " + text.toUpperCase());
        System.out.println("轉為小寫: " + text.toLowerCase());
    }
}

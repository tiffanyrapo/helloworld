package quickstart;

/**
 * 輸入命令列引數（Command line argument）
 */
public class hw0927_CommandLineArg
{
//    public static void main(String[] args)
//    {
//        System.out.print("讀入的引數: ");
//        for(int i = 0; i < args.length; i++)
//            System.out.print(args[i] +" ");
//        System.out.println();
//    }
     public static void main(String[] args)
     {
         System.out.print("讀入的引數: ");
         for(String arg : args)
             System.out.print(arg + " ");
         System.out.println();
     }
}
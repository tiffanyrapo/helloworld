package quickstart;

/**
 * 加上每行註解
 */

/**
 *
 * public class hw0810 {
 *     public static void main(String args[]) {
 *         int n;
 *         n=8;
 *         System.out.println(n+"+"+n+"="+(n+n));
 *         顯示為n+n=(n+n)，實際運算為(n+n)
 *
 *         System.out.println(n+"*5="+(n*5));
 *         顯示為n*5，實際運算為(n*5)
 *     }
 * }
 */


/**
 * public class hw0810{
 *     public static void main(String args[]){
 *         System.out.println("never too old to learn");
 *         System.out.print("East or west");
 *         println會斷行，print不會
 *     }
 * }
 */

public class hw0810{
    public static void main(String args[]){

        //印出整數型態最大值
        long lmax=java.lang.Long.MAX_VALUE;
        int imax=java.lang.Integer.MAX_VALUE;
        short smax=Short.MAX_VALUE; //省略類別庫java.lang
        byte bmax=Byte.MAX_VALUE; //省略類別庫java.lang

        //印出整數型態最小值
        long lmin=Long.MIN_VALUE; //皆會自動省略類別庫java.lang
        int imin=Integer.MIN_VALUE;
        short smin=Short.MIN_VALUE;
        byte bmin=Byte.MIN_VALUE;

        System.out.println("MAX value of long :"+lmax);
        System.out.println("MAX value of int :"+imax);
        System.out.println("MAX value of short :"+smax);
        System.out.println("MAX value of byte :"+bmax);
        System.out.println();
        System.out.println("MIN value of long :"+lmin);
        System.out.println("MIN value of int :"+imin);
        System.out.println("MIN value of short :"+smin);
        System.out.println("MIN value of byte :"+bmin);
    }
}


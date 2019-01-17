package quickstart;

/**
 * 使用endsWith()過濾副檔名
 */
public class hw0925_FileFilter
{
    public static void main(String args[])
    {
        String[] filenames = {"caterpillar.jpg", "cater.gif", "bush.gif",
                "wuwuw.jpg", "clocking.gif"};

        System.out.print("過濾出jpg檔案: ");

        for(int i = 0; i < filenames.length; i++)
        {
            if(filenames[i].endsWith("gif"))
            {
                System.out.print(filenames[i] + " ");
            }
        }
        System.out.println("");
    }
}

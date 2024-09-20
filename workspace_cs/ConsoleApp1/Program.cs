
class Program
{
    static void Main(string[] args)
    {
        Console.Write("Hello, World!,  ");  /* print */
        Console.WriteLine("Hello, C#"); /* println */

        int[] products = new int[3];

        int[] p = new int[3];  
        p[0] = 10;
        test();
        int[] arr = {1,2, 3,4,5};
        foreach(int i in arr)
        {
            Console.Write(i + ","); 
        }
    }
    static void test()
    {
        Console.WriteLine("test");
    }
}



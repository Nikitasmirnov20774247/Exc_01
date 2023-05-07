public class Ds_01
{
    public static void main(String[] args)
    {
        String[] array1 = {"TXT1", "TXT2", null};
        int[] array2 = {9,3,7,4,6,2,10,1,5,8};
        division(16, 0);
        printArray(array1);
        findIndex(array2,2);
    }

    public static void division(double a, double b)
    {
        if (b == 0) throw new ArithmeticException("!! Деление на ноль невозможно !!");
        double result = a / b;
        System.out.printf("%f / %f = %f.\n", a, b, result);
    }
    
    public static void findIndex(int[] array, int index)
    {
        if (index > array.length-1) throw new ArrayIndexOutOfBoundsException("!! Элемент под указанным индексом не найден !!");
        else System.out.printf("index %d = %d.\n",index, array[index]);
    }

    public static void printArray(String[] array)
    {
        for (String i : array)
        {
            if (i == null) throw new NullPointerException("!! Массив имеет \"null\" эдемент !!");
            System.out.println(i);
        }
    }
}
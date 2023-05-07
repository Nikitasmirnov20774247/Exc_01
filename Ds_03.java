import java.util.Random;
import java.util.Arrays;

public class Ds_03
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] array1 = random.ints(10, 1, 20).toArray();
        System.out.println(Arrays.toString(array1));

        int[] array2 = random.ints(9, 1, 20).toArray();
        System.out.println(Arrays.toString(array2));

        double[] resultArray1 = newArray(array1, array2);
        System.out.println(Arrays.toString(resultArray1));

        double[] resultArray2 = newArray(null, null);
        System.out.println(Arrays.toString(resultArray2));
    }

    public static double[] newArray(int[] array1, int[] array2)
    {
        if (array1 == null || array2 == null) throw new RuntimeException("!! Массивы не найдены !!");
        if (array1.length != array2.length) throw new RuntimeException("!! Длины массивов не равны !!");

        double[] resultArray = new double[array1.length];
        for (int i = 0; i < resultArray.length; i++)
        {
            double a = array1[i];
            double b = array2[i];
            resultArray[i] = a / b;
        }
        return resultArray;
    }
}
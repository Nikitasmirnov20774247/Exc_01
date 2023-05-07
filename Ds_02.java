import java.util.Random;
import java.util.Arrays;

public class Ds_02
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] array1 = random.ints(10, 1, 20).toArray();
        System.out.println(Arrays.toString(array1));

        int[] array2 = random.ints(9, 1, 20).toArray();
        System.out.println(Arrays.toString(array2));

        int[] resultArray = newArray(array1, array2);
        System.out.println(Arrays.toString(resultArray));
    }

    public static int[] newArray(int[] array1, int[] array2)
    {
        if (array1.length != array2.length) throw new RuntimeException("!! Длины массивов не равны !!");
        int[] resultArray = new int[array1.length];
        for (int i = 0; i < resultArray.length; i++)
        {
            resultArray[i] = array1[i] - array2[i];
        }
        return resultArray;
    }
}
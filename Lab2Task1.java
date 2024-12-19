import java.util.Random;
class Main {
    public static int findMax(int[] array)
    {
        int max = -1;
        for(int val : array)
        {
            if (val > max) max = val;
        }
        return max;
    }
    public static int findMin(int[] array)
    {
        int min = 2000;
        for(int val : array)
        {
            if (val < min) min = val;
        }
        return min;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int arr[], max = -1, min = 2000;
        arr = new int[1000];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = rand.nextInt(1001);
        }
        long timeBeforeForMax = System.nanoTime ();
        findMax(arr);
        long timeAfterForMax = System.nanoTime ();
        long timeBeforeForMin = System.nanoTime ();
        findMin(arr);
        long timeAfterForMin = System.nanoTime ();
         System.out.println("The maximum number in the array: " + max);
         System.out.println("Elapsed time for finding the maximum: " + (timeAfterForMax-timeBeforeForMax));
         System.out.println("The minimum number in the array: " + min);
         System.out.println("Elapsed time for finding the minimum: " + (timeAfterForMin-timeBeforeForMin));
        
    }
}
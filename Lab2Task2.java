import java.util.Random;
import java.util.Arrays;
class Main {
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] < key) {
                low = mid + 1;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else {
                return mid; // key found
            }
        }
        return -1; // key not found
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int arr[];
        arr = new int[1000];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = rand.nextInt(1001);
        }
        Arrays.sort(arr);
        int max = arr[0];
        int min = arr[999];
        long timeBeforeForMax = System.nanoTime ();
        binarySearch(arr, max);
        long timeAfterForMax = System.nanoTime ();
        System.out.println("The maximum number in the array: " + max);
        System.out.println("Elapsed time for finding the maximum: " + (timeAfterForMax-timeBeforeForMax));
        long timeBeforeMin = System.nanoTime ();
        binarySearch(arr, min);
        long timeAfterForMin = System.nanoTime ();
        System.out.println("The minimum number in the array: " + min);
        System.out.println("Elapsed time for finding the minimum: " + (timeAfterForMin-timeBeforeMin));
        
    }
    
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static sorts.JavaSorts.quickSort;

public class SortTest {
   @Test
   void randomArrayTest(){
       Random rand = new Random(42);
       for (int k = 0; k < 1000000; k++) {
           int arr_size = rand.nextInt(10);
           int[] arr1 = new int[arr_size];
           int[] arr2 = new int[arr_size];
           for (int i = 0; i <arr_size ; i++) {
               arr1[i] = rand.nextInt(2);
               arr2[i] = arr1[i];
           }
           quickSort(arr1);
           Arrays.sort(arr2);
           if (!Arrays.equals(arr1,arr2)){
               throw new IllegalStateException();
           }
       }
   }
    @Test
    void checkSameValues() {
       int[] arr = {2,2,2,2};
       quickSort(arr);
       Assertions.assertArrayEquals(arr, new int[]{2,2,2,2});
    }
}

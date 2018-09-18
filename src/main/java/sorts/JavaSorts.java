package sorts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class JavaSorts {
    private static void quickSort(int[] arr, int low,int high){
       if (high - low >= 1 ){
         int e = arr[high];
         int i = 0;
         for (int j = 0; j <  high; j++) {
              if (arr[j] <= e){
                   swap(arr,i,j);
                   i++;
               }
         }
         swap(arr,i,high);
         quickSort(arr,0,i-1);
         quickSort(arr,i+1,high);
       }
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void quickSort(int[] arr){
       if ( !( arr.length == 0 || arr.length == 1 )){
           quickSort(arr,0,arr.length-1);
       };
    }

    public static void main(String[] args) {

    }
}

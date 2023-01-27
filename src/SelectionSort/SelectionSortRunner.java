package SelectionSort;

import java.util.Arrays;

public class SelectionSortRunner {
    public static void main(String[] args) {

        int[]arr ={7,4,5,9,8,2,1};
        System.out.println("Sort İşlemi öncesi array : " );
        System.out.println(Arrays.toString(arr));
        System.out.println("========================================================");
        System.out.println("SelectionSort işlemi sonrası : ");
        SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("========================================================");
    }
}

import BubbleSort.BubbleSort;
import InsertionSort.InsertionSort;
import QuickSort.QuickSort;
import SelectionSort.SelectionSort;
import ShellSort.ShellSort;
import mergeSort.MergeSort;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class WhichOneIsFaster {
    public static void main(String[] args) {
        int[] siraliDizi = siraliArray(1000000);
        int[] siraliOlmayanDizi = createArray(10000000);
        int[] siraliOlmayanDizi2 = Arrays.copyOf(siraliOlmayanDizi,siraliOlmayanDizi.length);
        int[] siraliOlmayanDizi3 = Arrays.copyOf(siraliOlmayanDizi,siraliOlmayanDizi.length);
        int[] siraliOlmayanDizi4 = Arrays.copyOf(siraliOlmayanDizi,siraliOlmayanDizi.length);
        int[] siraliOlmayanDizi5 = Arrays.copyOf(siraliOlmayanDizi,siraliOlmayanDizi.length);
        int[] siraliOlmayanDizi6 = Arrays.copyOf(siraliOlmayanDizi,siraliOlmayanDizi.length);
        int[] siraliOlmayanDizi7 = Arrays.copyOf(siraliOlmayanDizi,siraliOlmayanDizi.length);


        long startTime;
        long endTime;
        double estimatedTime;

        //insertionSort
        startTime = System.currentTimeMillis();
      //  InsertionSort.insertionSort(siraliOlmayanDizi);
        InsertionSort.insertionSort(siraliDizi);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime - startTime) / 1000;
        System.out.println("InsertionSort süresi : " + estimatedTime);


        //SelectionOrder
        startTime = System.currentTimeMillis();
    //    SelectionSort.selectionSort(siraliOlmayanDizi2);
        SelectionSort.selectionSort(siraliDizi);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime - startTime) / 1000;
        System.out.println("SelectionSort süresi : " + estimatedTime);

        //bubblesort
        startTime = System.currentTimeMillis();
       // BubbleSort.bubbleSort(siraliOlmayanDizi3);
        BubbleSort.bubbleSort(siraliDizi);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime - startTime) / 1000;
        System.out.println("BubbleSort süresi : " + estimatedTime);


        //MergeSort
        startTime = System.currentTimeMillis();
     //   MergeSort.mergeSort(siraliOlmayanDizi4,0,siraliOlmayanDizi4.length-1);
        MergeSort.mergeSort(siraliDizi,0,siraliDizi.length-1);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime - startTime) / 1000;
        System.out.println("MergeSort süresi : " + estimatedTime);

        //quickSort
//        startTime = System.currentTimeMillis();
//       // QuickSort.quickSort(siraliOlmayanDizi5,0,siraliOlmayanDizi5.length-1);
//        QuickSort.quickSort(siraliDizi,0,siraliDizi.length-1);
//        endTime = System.currentTimeMillis();
//        estimatedTime = (double) (endTime - startTime) / 1000;
//        System.out.println("QuickSort süresi : " + estimatedTime);

        //shellSort
        startTime = System.currentTimeMillis();
     //   ShellSort.shellSort(siraliOlmayanDizi6);
        ShellSort.shellSort(siraliDizi);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime - startTime) / 1000;
        System.out.println("ShellSort süresi : " + estimatedTime);

        //ArraysSort
        startTime = System.currentTimeMillis();
       // Arrays.sort(siraliOlmayanDizi7);
        Arrays.sort(siraliDizi);
        endTime = System.currentTimeMillis();
        estimatedTime = (double) (endTime - startTime) / 1000;
        System.out.println("ArraysSort süresi : " + estimatedTime);















    }

    public static int[] createArray(int elemanSayisi) {
        int[] arr = new int[elemanSayisi];
        Random rm = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rm.nextInt(10000);
        }
        return arr;
    }


    public static int[] siraliArray(int elemanSayisi) {
        int[] arr = new int[elemanSayisi];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }
}

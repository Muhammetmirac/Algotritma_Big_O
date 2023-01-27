package InsertionSort;

public class InsertionSort {

    public  static  void insertionSort(int arr[]){

        for (int i = 1; i < arr.length ; i++) {

            int temp = arr[i]; // başlama yapacağım elemanı tempe atıyorum
            int j = i-1;  // bir önceki elemanla kıyaslamak için

            while (j>=0 && arr[j]>temp){
                arr[j+1] =arr[j];
                j=j-1;
            }
            arr[j+1] = temp;
        }
    }
}

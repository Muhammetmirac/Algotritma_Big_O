package BigO;

public class On2 {      // On^2 şeklinde gösterilir ------> Quadratic Complexity (Katlanarak artar)

    public static void main(String[] args) {

        int count =0;

        int[] arr = {2,1,5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.println(arr[i]+arr[j]);
                count++;
            }
        }
        System.out.println("count : "+ count);
    }

}

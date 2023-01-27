package BigO;


//elimizdeki veri seti arttıkça çalıştırılma süreside doğru orantılı olarak artıyor
public class On {       //O(n) şeklinde gösterilir.     ---> Linear(Doğrusal) Complexity
    public static void main(String[] args) {

        int [] arr = {10,2,20,40,55,7};
        for (int w: arr             ) {
            System.out.println(w+", ");     // 6 işlem şeklinde gösterilir O(6)
        }
    }
}

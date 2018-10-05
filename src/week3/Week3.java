package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số
        if( m > n) return m;
        else return n;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần t
        int i;
        int x = array[0];
        for( i=0; i<array.length; i++){
            if(x > array[i]) x = array[i];
        }
        return x;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao

     * @return Thiếu cân, Bình thường, Thừa cân, Béo p
     * hì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double BMI = weight/(height*height);
        if( BMI < 18.5) return "Thieu can";
        else if(( BMI >= 18.5) && (BMI <= 22.99)) return "Binh thuong";
        else if((BMI >= 22) && (BMI<=24.99)) return "Thua can";
        else return "Beo phi";
    }
}

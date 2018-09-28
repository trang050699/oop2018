package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private  int Numberator;
    private int Denominator;
    
    public static void main(String[] args){
        Fraction phanso1 = new Fraction(1,5);
        
        
        phanso1.add(phanso2);
        phanso1.subtract(phanso2);
        phanso1.multiply(phanso2);
        phanso1.divide(phanso2);
        System.out.println("cong hai phan so 1/5 + 1/3 = " + phansotong.Numberator+ "/"+ phansotong.Denominator);
        System.out.println("tru hai phan so 1/5 - 1/3 = " + phansohieu.Numberator+ "/"+ phansohieu.Denominator);
        System.out.println("nhan hai phan so 1/5 * 1/3 = " + phansotich.Numberator+ "/"+ phansotich.Denominator);
        System.out.println("chia hai phan so 1/5 : 1/3 = " + phansothuong.Numberator+ "/"+ phansothuong.Denominator);
        
        
         

    }

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.Numberator = numerator;
        this.Denominator = denominator;
        
    }
    
    public int getNumberator() {
        return Numberator;
    }
 
    public void setNumberator(int numberator) {
        this.Numberator = numberator;
    }
 
    public int getDenominator() {
        return Denominator;
    }
 
    public void setDenominator(int denominator) {
        this.Denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        int tu = this.getNumberator() * other.getDenominator() + other.getNumberator() * this.getDenominator();
        int mau = this.getDenominator() * other.getDenominator();
        Fraction phansotong = new Fraction(tu, mau);
        return phansotong;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int tu = this.getNumberator() * other.getDenominator() - other.getNumberator() * this.getDenominator();
        int mau = this.getDenominator() * other.getDenominator();
        Fraction phansohieu = new Fraction(tu, mau);
        return phansohieu;

    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int tu = this.getDenominator() * other.getDenominator();
        int mau = this.getNumberator() * other.getDenominator();
        Fraction phansotich = new Fraction(tu,mau);
        return phansotich;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int tu = this.getDenominator() * other.getNumberator();
        int mau = this.getNumberator() * other.getDenominator();
        Fraction phansothuong = new Fraction(tu,mau);
        return phansothuong;
    }
    
}

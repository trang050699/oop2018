
package week4.task1;

public class Hoaqua {
	public int gia;
	public String nguongoc;
	public void setGia(int Gia){
		this.gia = Gia;
	}
	public void setNguongoc(String Nguongoc){
		this.nguongoc = Nguongoc;
	}
	public int getGia(){
		return this.gia;
	}
	public String getNguongoc(){
		return this.nguongoc;
	} 
        public void ShowInfo() {
            System.out.println("Nguoc goc: " + nguongoc);
            System.out.println("Gia: " + gia + "VND");
    }

}

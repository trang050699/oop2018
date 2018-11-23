package week11;

public class Task1 {
  public static <T extends Comparable<T>> void sapxep(T[] a){
        T z;
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j].compareTo(a[j+1])<0){
                    z=a[j];
                    a[j] =a[j+1];
                    a[j+1]=z;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Byte[] a = {9,4,7,2};
        Task1 t1=new Task1();
        t1.sapxep(a);
        
    
}
}

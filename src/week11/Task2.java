package week11;

public class Task2 {
  public static <T extends Comparable<T>> T LN(ArrayList<T> a){
        T x=a.get(0);
        for(int i=0;i<a.size();i++){
            if(a.get(i).compareTo(x)>0){
                x= a.get(i);
            }
        }
        return x;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList();
        a.add(2);
        a.add(6);
        a.add(0);
        System.out.print("Phan tu lon nhat:"+LN(a));
    }
}

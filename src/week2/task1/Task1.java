package week2.task1;

public class Task1 {
    public static void main(String[] args) {
        //in ra ước chung lớn nhất
	System.out.println("uoc chung lon nhat cua 45 va 0 :"+gcd(45,0));
	System.out.println("uoc chung lon nhat cua 145 va 505:"+gcd(145,505));
        if(gcd(0,0)==-1) System.out.println("uoc chung lon nhat cua 0 va 0: vo cung");
	//in ra so fibonacci		
	System.out.println("so fibonacci thu n=3 la: "+fibonacci(3));
	System.out.println("so fibonacci thu n=0 la: "+fibonacci(0));
        System.out.println("so fibonacci thu n=1 la: "+fibonacci(1));
		}
                
        //tìm uoc chung lon nhat cua hai so a va b
	public static int gcd(int a, int b) {
	    	int c;
	    	if(a==0&&b==0) return -1;
	    	if(a==0) return b;
	    	if(b==0) return a;
	    	while((c=(a%b))!=0) {
	    		a=b;
	    		b=c;
	    	}
	        return b;
	    }
        //tính so fibonacci thu n
	public static int fibonacci(int n) {
	        int a=0;
	        int b=1;
	        int c = 0;
	        if(n==0) return n;
	        if(n==1) return 1;
	        for(int i=2;i<=n;i++) {
	        	c=a+b;
	        	a=b;
	        	b=c;
	        }
	        return c;
	    }	    
}

public class fib{
	public static int fib1(int n){
	if(n == 0){
		return 0;
	}
	if(n==1 || n==2){
			return 1;
		}
	return fib1(n-2) + fib1(n-1);
	}
    public static void main(String args[]) {
	int num = 10;
	for(int i = 0; i <num; i++){
			System.out.print(fib1(i) +" ");
		}
	}
}

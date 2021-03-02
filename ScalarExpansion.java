public class ScalarExpansion {
	static final int LEN1D=32000;
	static final int ITERATIONS = 100000;
	public static void main(String[] args){
		int[] a = new int[LEN1D];
		int[] b = new int[LEN1D];
		
		for(int i=0; i<LEN1D; i++){
			a[i]=i;
			b[i]=i;
		}
		int s;
	
		long start, diff=0;
		for(int i=0; i< ITERATIONS; i++){	
			start = System.nanoTime();
			for(int j=0; j<LEN1D; j++){
				s=b[j];
				a[j]=s*s;
			}
			diff+= System.nanoTime() - start;
			

		}
		
		System.out.println(diff/ITERATIONS);

		
	}
	


}

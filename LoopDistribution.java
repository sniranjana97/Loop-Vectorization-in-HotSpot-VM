public class LoopDistribution {
	static final int LEN1D=32000;
	static final int ITERATIONS = 100000;
	public static void main(String[] args){
		int[] a = new int[LEN1D];
		int[] b = new int[LEN1D];
		
		for(int i=0; i<LEN1D; i++){
			a[i]=i;
			b[i]=i;
		}
		
		int c=5, d=6;
		long start, diff=0;
		for(int i=0; i<ITERATIONS; i++){
			start = System.nanoTime();
			for(int j=1; j<LEN1D; j++){
				a[j] += c * d;
				b[j] = b[j - 1] +a[j]+ d;
			}
			diff+= System.nanoTime() - start;
		}
		System.out.println(diff/ITERATIONS);

		
	}

}

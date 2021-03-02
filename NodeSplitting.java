public class NodeSplitting {
	static final int LEN1D=32000;
	static final int ITERATIONS = 100000;
	public static void main(String[] args){
		int[] a = new int[LEN1D];
		int[] b = new int[LEN1D];
		
		for(int i=0; i<LEN1D; i++){
			a[i]=i;
			b[i]=i;
		}

		long start, diff=0;
		for(int i=0; i<ITERATIONS;i++){
			start = System.nanoTime();
			for(int j=1; j<LEN1D-1; j++){
			 	a[j] = b[j];
			 	b[j] = a[j]*a[j+1];
			}
			diff+= System.nanoTime() - start;
		}
		System.out.println(diff/ITERATIONS);
		
	}


}

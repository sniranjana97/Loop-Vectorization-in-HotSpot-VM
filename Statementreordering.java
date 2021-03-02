
public class Statementreordering {
  static final int ITERATIONS= 100000;
  static final int LEN1D=32000;
  public static void main(String[] args){
    int[] a = new int[LEN1D];
    int[] b = new int[LEN1D];
    for(int i=0; i<LEN1D; i++){
      a[i]=i;
      b[i]=i;
    }
    testMethod(a, b);
  }
  public static void testMethod(int[] a, int[] b){
    for(int i=0; i< ITERATIONS; i++){
      for(int j=1; j<(LEN1D-1); j++){
        a[j]=b[j-1];
  b[j]=b[j+1];
      }

    }
  }
}
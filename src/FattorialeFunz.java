
public class FattorialeFunz {
	public static int Fattoriale2(int n) {
		int fatt=1;
		int i; 
		for (i=1; i<=n; i++) {
			fatt *= i; 
		}
		return fatt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int fatt=Fattoriale2(n);
		System.out.print(fatt);
	}
}

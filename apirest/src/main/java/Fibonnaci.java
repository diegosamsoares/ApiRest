
public class Fibonnaci {

	public static void main(String[] args) {
		int anterior =0;
		int prox = 1;
		int aux=0;
		System.out.println(anterior);
		System.out.println(prox);
		for (int i = 0; i <= 9; i++) {
			aux=anterior+prox;
			anterior=prox;
			prox=aux;
			System.out.println(prox);
		}
		

	}

}

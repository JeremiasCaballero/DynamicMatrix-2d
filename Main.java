
public class Main {

	public static void main(String[] args) {
		MatrizDinamica a = new MatrizDinamica();
		System.out.println(a.isEmpty());
		
		a.addElemento(1, 0);
		a.addElemento(2, 0);
		a.addElemento(3, 0);
		
		System.out.println(a.size());
		
		a.addElemento(3, 1);
		a.addElemento(4, 0);
		a.imprimirMatriz();
		
		System.out.println(a.getValor(0, 0));
	}

}

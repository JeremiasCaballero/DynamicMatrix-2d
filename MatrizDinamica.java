import java.util.ArrayList;
import java.util.Iterator;

public class MatrizDinamica {
	private ArrayList<ArrayList<Integer>> matriz;

	
	public MatrizDinamica() {
		this.matriz = new ArrayList<ArrayList<Integer>>();
	}
	// crea la matriz con un tamaño
	public void  imprimirMatriz() {
		for(int i=0; i<matriz.size(); i++) {
			for(int j=0; j<matriz.get(i).size(); j++) {
				System.out.print("["+matriz.get(i).get(j)+"]");
			}
			System.out.println();
		}
	}
	private void newFIla(int valor) {
		ArrayList<Integer>fila = new ArrayList<Integer>();
		fila.add(valor);
		matriz.add(fila);
	}
	
	public void addElemento(int valor, int fila) {
		int size = matriz.size();
		if(size == fila) { 
			this.newFIla(valor);
		}else if(size>fila){
			matriz.get(fila).add(valor);
		}
	}
	
	public int size() {
		int cont = 0;
		for (int i = 0; i<matriz.size(); i++) {
			cont += matriz.get(i).size();
		}
		return cont;
	}
	
	public int getValor(int fila, int columna) {
		return matriz.get(fila).get(columna);
	}
	
	public boolean isEmpty() {
		return matriz.size() == 0;
	}

}

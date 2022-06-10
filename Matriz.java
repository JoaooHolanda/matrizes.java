public class Matriz {
	public int rows;
	public int cols;
	public double matriz[][];
	
	//contrutor
	public Matriz(int linhas, int colunas,double[][] elementos){		
		rows = linhas;
		cols = colunas;
		matriz = new double[rows][cols];
		matriz = elementos;
		
	}	
	public Matriz(double[][] elementos){		
		int rows = elementos.length;
		int cols = elementos[0].length;
		matriz = new double[rows][cols];
		matriz = elementos;
		
	}	

	
	
	//metodos 
	
	public int getLinha() {
		return rows;
	}
	
	public int getColuna() {
		return cols;
	}
	public double[][] getMatriz(){
		return matriz;
	}
	
	
	public double get(int i, int j) {
		System.out.println(matriz[i-1][j-1]);
		return matriz[i-1][j-1];
	}
	
	public void set(int i, int j, double valor) {
		System.out.println(matriz[i-1][j-1]);
		matriz[i-1][j-1] = valor;
	}
	
	
}
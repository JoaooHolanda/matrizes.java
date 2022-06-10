public class Vector {
	public double vetor[];
	public int tamanho;
	
	public Vector(int qntElementos, double[] elementos){
		tamanho = qntElementos;
		vetor = new double[tamanho];
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = elementos[i];
		}
		
	}

	//metodos
	public double get(int i) {
		System.out.println(vetor[i]);
		return vetor[i-1];
	}
	
	public void set(int i,int value) {
		vetor[i-1] = value;
		System.out.println(vetor[i]);
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	
}
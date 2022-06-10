import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LinearAlgebra {
	

	//metodos
	
	
	public static double[][] transpose(double [][] m){
        double[][] temp = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                temp[j][i] = m[i][j];
        /*
        for(int i = 0; i < temp.length; i++) {
			for(int z = 0; z < temp[0].length; z++) {
					System.out.print(temp[i][z]);
					System.out.print("|");
			}
			System.out.println("");
		}
		System.out.print("-----------------------\n");
        */
		return temp;
		
		//Matriz r = new Matriz(temp);
        //return r;
        
    }

	public static double[][] transpose(Vector vector){
		double VT[][] = new double[vector.tamanho][1];
		for(int i = 0; i < vector.tamanho; i++) {
			VT[i][0] = vector.vetor[i];
			System.out.println("|"+ VT[i][0] + "|");
		}
		return VT;
}
	
	public static double[][] sum(Matriz M1, Matriz M2){
		double Sum[][] = new double[M1.getLinha()][M1.getColuna()];
		for(int i = 0; i < M1.getLinha(); i++) {
			for(int z = 0; z < M1.getColuna(); z++) {
				Sum[i][z] = M1.matriz[i][z] + M2.matriz[i][z];
			}
		}
		for(int i = 0; i < Sum.length; i++) {
			for(int z = 0; z < Sum[0].length; z++) {
					System.out.print(Sum[i][z]);
					System.out.print("|");
			}
			System.out.println("");
		}
		System.out.print("-----------------------");
		return Sum;
	}

	public static double[] sum(Vector V1, Vector V2){
		double Sum[]= new double[V1.tamanho];
		for(int i = 0; i < V1.tamanho; i++) {
			Sum[i] = V1.vetor[i] + V2.vetor[i];
			
		}
		System.out.print("Vetor resultado = |");
		for(int i = 0; i < V1.tamanho; i++) {
			System.out.print("|" + Sum[i] + "|");
		}
		System.out.print(" |");
		
		return Sum;
	}
	
	public static double[][] times(Matriz M1, Matriz M2){
		
		double resultado[][] = new double[M1.getLinha()][M1.getColuna()];
		for (int i = 0; i < M1.getColuna(); i++){ // 1

		    for(int z = 0; z < M1.getLinha(); z++) { // 1
		          resultado[z][i] = M1.matriz[z][i] * M2.matriz[z][i]; 
		   }
		}
		//Printa a matriz
				for(int i = 0; i < resultado.length; i++) {
					for(int z = 0; z < resultado[0].length; z++) {
							System.out.print(resultado[i][z]);
							System.out.print("|");
							
					}
					System.out.println("");
				}
				System.out.print("-----------------------");
		return resultado;
	}
	
	public static double[][] times(double escalar, Matriz M1){
		
		double resultado[][] = new double[M1.matriz.length][M1.matriz[0].length];
		for (int i = 0; i < M1.matriz[0].length; i++){

		    for(int z = 0; z < M1.matriz.length; z++) {
		          resultado[z][i] = M1.matriz[z][i] * escalar; 
		   }
		}
	
		return resultado;
	}
	
	public static double[] times(Vector V1, Vector V2) {
		System.out.print("|");
		double resultado[] = new double[V1.tamanho];
		for(int i = 0; i < V1.tamanho; i ++) {
			resultado[i] = 	V1.vetor[i] * V2.vetor[i];
			System.out.print(resultado[i] + "|");
		}
		
		
		return resultado;
	}
	
	public static double[] times(int escalar, Vector V1) {
		System.out.print("|");
		double resultado[] = new double[V1.tamanho];
		for(int i = 0; i < V1.tamanho; i ++) {
			resultado[i] = 	V1.vetor[i] * escalar;
			System.out.print(resultado[i] + "|");
		}
		
		
		return resultado;
	}
	
	public static Matriz dot(Matriz M1, Matriz M2){
		double MResultado[][] = new double[M1.getLinha()][M2.getColuna()];
		for(int i = 0; i < M1.getLinha(); i++) {                            //Linhas de M1
			for(int j = 0; j < M2.getColuna(); j++) {                       //Coluna de M2
				for(int k = 0; k < M1.getColuna(); k ++) {                  //Coluna de M1
					MResultado[i][j] += M1.matriz[i][k] * M2.matriz[k][j];
				}
			}
		}
		
		
		
	
		Matriz r = new Matriz(MResultado);
        return r;
	}
	
	public static Matriz dot(double[][] M1, double[][] M2){
        double MResultado[][] = new double[M1.length][M2[0].length];
        for(int i = 0; i < M1.length; i++) {                            //Linhas de M1
            for(int j = 0; j < M2[0].length; j++) {                       //Coluna de M2
                for(int k = 0; k < M1[0].length; k ++) {                  //Coluna de M1
                    MResultado[i][j] += M1[i][k] * M2[k][j];
                }
            }
        }
		
		double MResultado2[][] = new double[M1.length][1];
		
		for(int i = 0; i < MResultado.length; i++) {
			MResultado2[i][0] = MResultado[i][0]; 
		}

	

		
		Matriz r = new Matriz(MResultado2);
        return r;
        
	}
	
	
	public static String paraString(double[][] A) {
		String resultado = " ";
		for(int i= 0; i < A.length; i++) {
			for(int z = 0; z < A[0].length; i++) {
				resultado += A[i][z];
				resultado += ",";
			}
			resultado += " ";
 		}
		return resultado;
	}
	
	
	
	public static double[][] gauss(Matriz M1){
		
	
		
		int L = M1.getLinha();
		for(int i = 0; i < 	L; i++) {
			
			int M = i;
			for(int j = i+1; j < L; j++) {
				if(Math.abs(M1.matriz[j][i]) > Math.abs(M1.matriz[M][i])) {
					M=j;                                                          //encontra a linha com o maior elemento
				}
			}
			
			double[] T = M1.matriz[i];
			M1.matriz[i] = M1.matriz[M];
			M1.matriz[M] = T;
			//double V = v[i];
			//v[i] = v[M];
			//v[M] = V;
			
			
			 //eliminaï¿½ï¿½o	
			for(int k = i + 1;k < L ; k++) {
				
				double multip = M1.matriz[k][i] / M1.matriz[i][i];
				
				//v[k] -= multip*v[i];
				
				for(int r = i; r < L; r++) {
					M1.matriz[k][r] -= multip*M1.matriz[i][r];
				}
			}
			
			
 		}
		
		
		//Printa a matriz
				for(int i = 0; i < M1.getColuna(); i++) {
					for(int z = 0; z < M1.getLinha(); z++) {
							System.out.print(M1.matriz[i][z]);
							System.out.print("|");
					}
					System.out.println("");
				}
				System.out.println("-----------------------");
		
		
		
		return M1.matriz;
	}
	
	public static double[][] solve(Matriz M1){
		
		//para com soluï¿½ï¿½o
		double[] v = new double[M1.getLinha()];
		int ColunaVetor = M1.getColuna()-1;
		for(int P = 0; P < M1.getLinha(); P++) {
			v[P] = M1.matriz[P][ColunaVetor];
		}
		
		
		int L  = M1.getLinha() ;
		for(int i = 0; i < 	L; i++) {
			
			int M = i;
			for(int j = i+1; j < L; j++) {
				if(Math.abs(M1.matriz[j][i]) > Math.abs(M1.matriz[M][i])) {
					M=j;                                                          //encontra a linha com o maior elemento
				}
			}
			
			double[] T = M1.matriz[i];
			M1.matriz[i] = M1.matriz[M];
			M1.matriz[M] = T;
			double V = v[i];
			v[i] = v[M];
			v[M] = V;
			
			
			 //eliminaï¿½ï¿½o	
			for(int k = i + 1;k < L; k++) {
				
				double multip = M1.matriz[k][i] / M1.matriz[i][i];
				
				v[k] -= multip*v[i];
				
				for(int r = i; r < L; r++) {
					M1.matriz[k][r] -= multip*M1.matriz[i][r];
				}
			}
			
			
 		}
		
		double[]  solucao = new double[L];
		for(int i = L-1; i>= 0; i--) {
			double sum = 0.0;
			
			for(int j = i+1; j < L;j++) {
				sum += M1.matriz[i][j] * solucao[j];
			}
			solucao[i]= (v[i] - sum) / M1.matriz[i][i];
		}
		//Printa a matriz
				for(int i = 0; i < M1.getColuna()-1; i++) {
					for(int z = 0; z < M1.getLinha(); z++) {
							System.out.print(M1.matriz[i][z]);
							System.out.print("|");
					}
					System.out.println(" = " + v[i] + " => " + solucao[i] );
				}
				System.out.println("-----------------------");
		
				
		
		
		
		return M1.matriz;
	}
	
	
	public static void shearing(Matriz M1, double kx, double ky) {
		
		int rows = 3;
		int cols = 3;
		double elementosShearing[][] = {{1.0,kx,0.0},
										{ky,1.0,0.0},
										{0.0,0.0,1.0}};
		
		Matriz MShearing = new Matriz(rows,cols,elementosShearing); // matriz tranformação de Cisalhamento
		
		dot(MShearing, M1);
		
		
		
	}
	
	public static void rotation2D(Matriz m1, Double angle) {
		
		int rows = 2;
		int cols = 2;
		Double RAngle = Math.toRadians(angle);
		Double sen = Math.sin(RAngle);
		Double cos = Math.cos(RAngle);
		Double nsen = sen * -1;
		double elementosRot2d[][] = {{cos,nsen,},
									{sen,cos,}};
		
		Matriz Mrot2d = new Matriz(rows,cols,elementosRot2d);
		
		dot(Mrot2d, m1);
	}
	
	public static void rotation3D(Matriz m1, Double angle) {
		
		
		Double RAngle = Math.toRadians(angle);
		Double sen = Math.sin(RAngle);
		Double cos = Math.cos(RAngle);
		Double nsen = sen * -1;
		int rows = 3;
		int cols = 3;
		double elementosRot3dx[][] = {{1,  0,   0},
									  {0,cos,nsen},
									  {0,sen,cos}};
		
		Matriz Mrot3dx = new Matriz(rows,cols,elementosRot3dx);
		
		//Rotação em X
		System.out.println("Rotação em X");
		dot(Mrot3dx,m1);
		System.out.println("");
		
		rows = 3;
		cols = 3;
		double elementosRot3dy[][] = {{cos,0,sen},
								     {  0, 1,  0},
									 {nsen,0,cos}};
		
		Matriz Mrot3dy = new Matriz(rows,cols,elementosRot3dy);
		
		//Rotação em y
		System.out.println("Rotação em y");
		dot(Mrot3dy,m1);
		System.out.println("");

		rows = 3;
		cols = 3;
		double elementosRot3dz[][] = {{cos,nsen,0},
									 {sen, cos, 0},
									 {0,    0,  1}};
		
		Matriz Mrot3dz = new Matriz(rows,cols,elementosRot3dz);
		

		//Rotação em z
		System.out.println("Rotação em z");
		dot(Mrot3dz,m1);
		System.out.println("");
		
	}

	public static void trans(Matriz M1, double Dx, double Dy) {

	    int rows = 3;
	    int cols = 3;
	    double elementosTrans[][] = {{1.0,0.0,0.0},
	                                {0.0,1.0,0.0},
	                                {Dx,Dy,1.0}};
	
	    Matriz MTrans = new Matriz(rows,cols,elementosTrans); // matriz tranformacao de translacao
	    System.out.println("Translação 2d");
	    dot(MTrans, M1);
	
	

	}


	public static void trans3d(Matriz M4, double Tx, double Ty, double Tz) {

	    int rows = 4;
	    int cols = 4;
	    double elementosTrans3d[][] = {{1.0,0.0,0.0,0.0},
	                                   {0.0,1.0,0.0,0.0},
	                                   {0.0,0.0,1.0,0.0},
	                                   {Tx,  Ty, Tz,1.0}};
	
	    Matriz MTrans3d = new Matriz(rows,cols,elementosTrans3d); // matriz tranformacao de translacao3d
	    
	    System.out.println("Translação 3d");
	    dot(MTrans3d, M4);
	
	}
	
	public static void proj2D(Matriz m1) {
	
		int rows = 2;
	    int cols = 2;
	    double elementosProj2dx[][] = {{1.0,0.0},
	                                   {0.0,0.0}};
	    
	    Matriz MProjX = new Matriz(rows,cols,elementosProj2dx);  //instanciamento de matriz trasnformação X
	    
	    rows = 2;
	    cols = 2;
	    double elementosProj2dy[][] =  {{0.0,0.0},
	                                    {0.0,1.0}};
	    
	    Matriz MProjY = new Matriz(rows,cols,elementosProj2dy); //instanciamento de matriz trasnformação Y
		
	    System.out.println("Projeção em X \n");
	    
	    dot(MProjX, m1);
	    
	    System.out.print("\n");
	    
	    System.out.println("Projeção em Y \n");
	    
	    dot(MProjY, m1);
	}

	public static void proj3D(Matriz m1) {

		int rows = 3;
		int cols = 3;
		double elementosProj3dx[][] = {{1.0,0.0,0.0},
									   {0.0,0.0,0.0},
									   {0.0,0.0,0.0}};
		
		Matriz Mproj3dx = new Matriz(rows,cols,elementosProj3dx);
		
		//Projeção em X
		System.out.println("Projeção em X");
		dot(Mproj3dx,m1);
		System.out.println("");
		
		rows = 3;
		cols = 3;
		double elementosProj3dy[][] = {{0.0,0.0,0.0},
				                      {0.0,1.0,0.0},
				                      {0.0,0.0,0.0}};
		
		Matriz Mproj3dy = new Matriz(rows,cols,elementosProj3dy);
		
		//Projeção em y
		System.out.println("Projeção em y");
		dot(Mproj3dy,m1);
		System.out.println("");
	
		rows = 3;
		cols = 3;
		double elementosProj3dz[][] = {{0.0,0.0,0.0},
				                      {0.0,0.0,0.0},
				                      {0.0,0.0,1.0}};
		
		Matriz Mproj3dz = new Matriz(rows,cols,elementosProj3dz);
		
	
		//Projeção em z
		System.out.println("Projeção em z");
		dot(Mproj3dz,m1);
		System.out.println("");
		
		
	}
	public static double[][] centro(double[][] A, double[][] a) {


		Matriz az = dot(A,a);
		double bz = module(az);
		double z0 = 1/bz;

		double[][] resultadoC = times(z0, az);

		return resultadoC;
	}
	public static double[][] CentroAutoridade(double[][] A, double[][] h) {
			
		/*	
		a0 =
		h0 =
		a1 = 
		h1 = MH
		*/
			Matriz ax = dot(transpose(A),h);
			double bx = module(ax);
			double x0 = 1/bx;
				
			double[][] resultadoA = times(x0, ax);
			//Printa a matriz
			
			for(int i = 0; i < resultadoA.length; i++) {
				for(int z = 0; z < resultadoA[0].length; z++) {
						
						System.out.print("Site - " + i + "||");
						System.out.print(resultadoA[i][z]);
						System.out.print("|");
						
						
				
				}
				System.out.println("");
			}
			System.out.println("-----------------------");
			return resultadoA;
			
			
			
			
	}


	public static double module(Matriz a) {
        double resultado = 0.0;
        double temp;
        for(int i = 0; i < a.matriz.length; i ++) {
            temp = Math.pow(a.matriz[i][0],2);
            resultado = resultado + temp;
        }
        resultado = Math.sqrt(resultado);
        return resultado;
    }

    public static double[][] h0(Matriz a) {
        double[][] h0 = new double[a.getLinha()][1];
        for(int i = 0; i < a.getLinha(); i ++) {
            double h = 0.0;
            for(int z = 0; z< a.getColuna(); z++) {
                h = h + (a.matriz[i][z]);
            }
            h0[i][0] = h;
            System.out.println(h);

        }

        return h0;
    }
	public static double[][] a0(double[][] a) {
		double[][] a0 = new double[a[0].length][1];
		for(int i = 0; i < a[0].length; i ++) {
			double h = 0.0;
			for(int z = 0; z< a.length; z++) {
				h = h + (a[z][i]);
			}
			a0[i][0] = h;
			System.out.println(h);

		}

		return a0;
	}
	
    public static void printaM(Matriz m) {
        //Printa a matriz
                for(int i = 0; i < m.matriz.length; i++) {
                    for(int z = 0; z < m.matriz[0].length; z++) {
                            System.out.print(m.matriz[i][z]);
                            System.out.print("|");
                    }
                    System.out.println("");
                }
                System.out.print("-----------------------");
    }
    
    public static void organiza(double[][] a) {
    	ArrayList<Double> Lista = new ArrayList<>();
    	
    	for(int i = 0; i < a.length; i++) {
    		Lista.add(a[i][0]);
    	}
    	Collections.sort(Lista,new SortSites());
    	for(int i = Lista.size() - 1; i >= 0; i--) {
    		double aux = Lista.get(i);
    		System.out.println(aux);
    		
    	}
        
    }
    
    
  
}



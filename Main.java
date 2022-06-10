//import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
	try {
		int rows;
		int cols;
		
		double elementoV[] = {5.0,6.0,7.0,8.0,2.0,1.0};					
		Vector V1 = new Vector(6,elementoV);
		
		double elementoV2[] = {6.0,9.0,5.0,4.0,1.0,-3.0};
		Vector V2 = new Vector(6,elementoV2);
	
		//M1
		rows = 2;
		cols = 3;
		double elementos[][] = {{2.0,2.0,2.0},
								{1.0,1.0,1.0}};						//M1
						
		
		//double[][] M1 = elementos;
		Matriz M1 = new Matriz(rows,cols,elementos);
		
		//M2
		rows = 3;
		cols = 3;
		double elementos2[][] = {{2.0,2.0,2.0},
				                {2.0,2.0,2.0},				//M2
		                        {2.0,2.0,2.0}};
		
		Matriz M2 = new Matriz(rows,cols,elementos2);
		
		//M3
		rows = 3;
		cols = 4;
		double elementosM3[][] = {{3.0,-2.0,5.0,20.0},
				                  {6.0,-9.0,12.0,51.0},		//M3
				                  {-5.0,0.0,2.0,1.0}};
		
		Matriz M3 = new Matriz(rows,cols,elementosM3);
		
		
		//M4
		rows = 2;
		cols = 1;
		double elementosM4[][] = {{2.0},
								{3.0}};						//M4
		
		Matriz M4 = new Matriz(rows,cols,elementosM4);
		
		//M5
		rows = 3;
		cols = 1;
		double elementosM5[][] = {{3.0},
								 {2.0},						//M5
								 {5.0}};
		
		Matriz M5 = new Matriz(rows,cols,elementosM5);
		
		//M6
		 rows = 3;
		 cols = 1;
			double elementos6[][] = {{2.0},
					                 {3.0},					//M6
			                         {1.0}};
			
			Matriz M6 = new Matriz(rows,cols,elementos6);
		
		//M7
			rows = 4;
			cols = 1;
				double elementos7[][] = {{2.0},
						                 {3.0},				//M7 
				                         {4.0},
						                 {1.0}};
				
				Matriz M7 = new Matriz(rows,cols,elementos7);
				
			rows = 2;
			cols = 1;
				double elementos8[][] = {{8.0},							                
							             {9.0}};			//M8
					
				Matriz M8 = new Matriz(rows,cols,elementos8);				
			
				
			rows = 3;
			cols = 1;
				double elementos9[][] = {{5.0},
							             {6.0},				//M9 
					                     {7.0}};
					
				Matriz M9 = new Matriz(rows,cols,elementos9);
				
				
				
		//LinearAlgebra.times(M1, M2);
		//LinearAlgebra.gauss(M2);
		//LinearAlgebra.solve(M3);
		//LinearAlgebra.dot(M1,M2);
		//LinearAlgebra.times(2,M2);
		//LinearAlgebra.transpose(V1);
		//LinearAlgebra.transpose(M1);
		//LinearAlgebra.sum(M1, M2);
		//LinearAlgebra.sum(V1, V2);
		//cissalhamento
				//Para vetores no plano 2d, adicione um número na linha 3 e o desconsidere no resultado final
		// |2.0,2.0,2.0|
	    // |2.0,2.0,2.0|			M2
        // |2.0,2.0,2.0|	
			
		double kx = 2;
		double ky = 0;
		//LinearAlgebra.shearing(M2, kx, ky);			//cissalhamento
		
		
		//rotação2d
		// |2.0|					M4
	    // |3.0|
		//LinearAlgebra.rotation2D(M4, 30.00);			//rotação2d
		
		//rotação 3d
		// |3.0|
		// |2.0|					M5
		// |5.0|
		
		//LinearAlgebra.rotation3D(M5,30.0);			//rotação3d
		
		
		//translação2d
		// |2.0|
        // |3.0|					M6
        // |1.0|
       
		Double Dx = 8.0;
		Double Dy = 9.0;
        //LinearAlgebra.trans(M6, Dx, Dy);				//translação2d

        //translação3d
        // |2.0|
        // |3.0|					M7
        // |4.0|
        // |1.0|
        double Tx = 2;
        double Ty = 3;
        double Tz = 5;

        //LinearAlgebra.trans3d(M7, Tx, Ty, Tz);			//translação3d


        //Projeção 2D
        // |8.0|
        // |9.0| 					M8
	    //LinearAlgebra.proj2D(M8);
	    
	    
	    //Projeção 3D
	    // |5.0|
        // |6.0| 					M9
	    // |7.0|
	    //LinearAlgebra.proj3D(M9);
	   
	   
	   //autoridade
        
        rows = 4;
		cols = 4;
		double elementosEZ1[][] = {{0.0,0.0,1.0,0.0},
								   {1.0,0.0,0.0,0.0},
								   {1.0,1.0,0.0,0.0},
								   {0.0,1.0,0.0,0.0}};						//A
			
		double[][] ez1 = elementosEZ1;

		double elementosEZ2[][] = {{0.0,1.0,1.0,1.0,0.0},
				 				   {1.0,0.0,0.0,0.0,1.0},
				 				   {0.0,0.0,0.0,0.0,1.0},
				 				   {0.0,1.0,0.0,0.0,0.0},
				 				   {0.0,1.0,1.0,0.0,0.0}};						//A

		double[][] ez2 = elementosEZ2;
			

        double elementosEZ3[][] = {{0.0,1.0,1.0,0.0,1.0,1.0,0.0,0.0,0.0,1.0,},
        		                   {0.0,0.0,1.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},
        		                   {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0},
        		                   {0.0,1.0,1.0,0.0,0.0,1.0,1.0,0.0,0.0,1.0},
        		                   {0.0,0.0,0.0,1.0,0.0,0.0,0.0,0.0,0.0,0.0},
        		                   {0.0,1.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},
        		                   {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0,0.0},
        		                   {0.0,0.0,0.0,0.0,0.0,1.0,0.0,0.0,0.0,0.0},
        		                   {0.0,1.0,1.0,0.0,0.0,1.0,0.0,1.0,0.0,1.0},
        		                   {0.0,0.0,0.0,0.0,0.0,1.0,0.0,0.0,0.0,0.0},};
        
        double[][] ez3 = elementosEZ3;

        //EXEMPLO DO LIVRO
        double elementosEZ4[][] = {{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,},
                                   {0.0,2.0,1.0,1.0,2.0,0.0,0.0,2.0,0.0,1.0},
                                   {0.0,1.0,1.0,1.0,1.0,0.0,0.0,1.0,0.0,1.0},
                                   {0.0,1.0,1.0,1.0,1.0,0.0,0.0,1.0,0.0,1.0},
                                   {0.0,2.0,1.0,1.0,5.0,0.0,0.0,2.0,0.0,1.0},
                                   {0.0,0.0,0.0,0.0,0.0,3.0,1.0,0.0,0.0,0.0},
				                   {0.0,0.0,0.0,0.0,0.0,1.0,1.0,0.0,0.0,0.0},
				                   {0.0,2.0,1.0,1.0,2.0,0.0,0.0,3.0,0.0,1.0},
				                   {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},
				                   {0.0,1.0,1.0,1.0,1.0,0.0,0.0,1.0,0.0,2.0},};

        double[][] ez4 = elementosEZ4;
        
        double[][] a0 = LinearAlgebra.a0(ez4);
        
        
    	boolean executa = true;
        do {
        	int i = 0;
        	double[][] h1 = LinearAlgebra.centro(ez4,a0);
        	double[][] a1 = LinearAlgebra.CentroAutoridade(ez4,h1);
        	
        	while(true) {
        		if(a1[i][0] != 0) {
        			if(a1[i][0] == a0[i][0]) {
        				LinearAlgebra.organiza(a1);
        				executa = false;
        			}else {
        				a0 = a1;
        			}
        			break;
        		}else {
        			i++;
        		}
        	}
        	
        	
        }while(executa);
        
        
   
        
        
        
        
        
        

	}catch(Exception e) {
		System.out.println("Operação inválida");
	}
	}

}
public class Ex4 {
    public static void main(String[] args) {
        
        long dcom = 0; // contador de comparações
        long darit = 0; // contador de operações aritméticas
        long dponto = 0; // contador de índice array
        long drec = 0; // contador de recupeção de valores
        long darm = 0; // contador de atribuição de valores
               
        int lin = 5000;
        int col = lin;
        double[][] matriz = new double[lin][col];
        double[][] matrizT = new double[col][lin];

        dcom = dcom + 2;
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                darit++;
                dcom++;
                
                matriz[i][j] = -1;
                drec = drec + 4;
                dponto = dponto + 2;
                darm++;
            }
            darit++;
            dcom++;
        }

        dcom = dcom + 2;
		for(int i = 0; i < lin; i++) { //Determina transposta
            for(int j = 0; j < col; j++) {
                darit++;
                dcom++;

                matrizT[j][i]=matriz[i][j];
                drec = drec + 7;
                dponto = dponto + 4;
                darm++;    
            }
            darit++;
            dcom++;
        }
        
        dcom = dcom + 2;
        for(int i = 0; i < lin; i++) {  //Verifica simetria
            for(int j = 0; j < col; j++) {
                
                drec = drec + 7;
                dponto = dponto + 4;
                dcom++;
                if(matriz[i][j] != matrizT[j][i]){
                    System.out.println("A matriz não é simétrica");
                    break;
                }
                darit++;
                dcom++;
            }
            darit++;
            dcom++;
        }

        long dtotal = dcom + darit + dponto + drec + darm;
        System.out.println("Fórmula dos gastos: 37*N^2 + 6*N + 6 "); 
        System.out.println("Gasto de esforço: " + (dtotal));
    }
}
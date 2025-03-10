public class Ex3 {
    public static void main(String[] args) {
  
        long dcom = 0; // contador de comparações
        long darit = 0; // contador de operações aritméticas
        long dponto = 0; // contador de índice array
        long drec = 0; // contador de recupeção de valores
        long darm = 0; // contador de atribuição de valores
        
        int lin = 1000;
        int col = 1000;
        double[][] matriz = new double[lin][col]; 

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
        
        long dtotal = dcom + darit + dponto + drec + darm;
        System.out.println("Fórmula dos gastos: linhas*(2 + 9*colunas) + 2 "); 
        System.out.println("Gasto de esforço: " + (dtotal));
    }
}
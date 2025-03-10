public class SimetriaMatriz {
    public static void main(String[] args) {

        long dcom = 0; // contador de comparações
        long darit = 0; // contador de operações aritméticas
        long dponto = 0; // contador de índice array
        long drec = 0; // contador de recupeção de valores
        long darm = 0; // contador de atribuição de valores

        int[] tamanhos = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};

        System.out.println("Fórmula dos gastos: 37*N^2 + 6*N + 6 "); 
        
        dcom = dcom + 2;
        for (int N : tamanhos) {
            int[][] matriz = new int[N][N];
           
            for (int i = 0; i < N; i++) {

                for (int j = 0; j < N; j++) {
                    matriz[i][j] = (i == j) ? 1 : 0; 

                    darit++;
                    dcom++;
                    drec = drec + 4;
                    dponto = dponto + 2;
                    darm++;

                }
                darit++;
                dcom++;
            }
            dcom = dcom + 2;

            boolean simetrica = true;
            for (int i = 0; i < N; i++) {

                for (int j = 0; j < i; j++) { 
                    
                    darit++;
                    dcom++;
                    drec = drec + 7;
                    dponto = dponto + 4;
                    dcom++;

                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;


                        break;
                    }
                }
                if (!simetrica) break;
                darit++;
                dcom++;
            }

            long dtotal = dcom + darit + dponto + drec + darm;
            System.out.println("Gasto de esforço: " + (dtotal));

        }
    }
}

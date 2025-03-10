public class LimpaMatriz {
    public static void main(String[] args) {

        long dcom = 0; // contador de comparações
        long darit = 0; // contador de operações aritméticas
        long dponto = 0; // contador de índice array
        long drec = 0; // contador de recupeção de valores
        long darm = 0; // contador de atribuição de valores

        int[][] dimensoes = {{10, 10}, {50, 75}, {100, 300}, {500, 200}, {1000, 1000}, {5000, 7000}, {10000, 1}, {50000, 25000}, {100000, 100000}, {500000, 1000}};

        System.out.println("Fórmula dos gastos: linhas*(2 + 9*colunas) + 2 "); 
        
        dcom = dcom + 2;

        for (int[] dimensao : dimensoes) {
            int N = dimensao[0];
            int M = dimensao[1];
            double[][] matriz = new double[N][M];


            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    matriz[i][j] = -1;

                    darit++;
                    dcom++;
                    drec = drec + 4;
                    dponto = dponto + 2;
                    darm++;
                   
                }
                darit++;
                dcom++;
            }

            long dtotal = dcom + darit + dponto + drec + darm;
            System.out.println("Gasto de esforço: " + (dtotal));

            dcom = 2;
            darit = 0;
            dponto = 0;
            drec = 0;
            darm = 0;
        }
    }
}

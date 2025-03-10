public class LimpaMatriz {
    public static void main(String[] args) {

        int[][] dimensoes = {{10, 10}, {50, 75}, {100, 300}, {500, 200}, {1000, 1000}, {5000, 7000}, {10000, 1}, {50000, 25000}, {100000, 100000}, {500000, 1000}};
        
        for (int[] dimensao : dimensoes) {
            int N = dimensao[0];
            int M = dimensao[1];
            double[][] matriz = new double[N][M];

            int c = 2;
            int d = 0;
            
            long a = System.nanoTime();

            for (int i = 0; i < N; i++) {

                c++;
                d++;
                
                for (int j = 0; j < M; j++) {
                    matriz[i][j] = -1;

                    c++;
                    d++;

                }
            }
            long b = System.nanoTime();

            System.out.println("Tempo para N = " + N + " e M = " + M + ": " + (b - a) + " ns");
            System.out.println("Medição direta das Operações Aritméticas:e das Comparações: "+ (d+ c));

        }
    }
}

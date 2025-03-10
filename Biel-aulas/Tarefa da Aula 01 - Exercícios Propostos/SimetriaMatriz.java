public class SimetriaMatriz {
    public static void main(String[] args) {
        int[] tamanhos = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};
        
        for (int N : tamanhos) {
            int[][] matriz = new int[N][N];
           
            int c = 4;
            int d = 0;

            for (int i = 0; i < N; i++) {

                c++;
                d++;

                for (int j = 0; j < N; j++) {
                    matriz[i][j] = (i == j) ? 1 : 0; 

                    c++;
                    d++;

                }
            }

            long a = System.nanoTime();
            boolean simetrica = true;
            for (int i = 0; i < N; i++) {

                c++;
                d++;

                for (int j = 0; j < i; j++) { 

                    c++;
                    d++;

                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;

                        c++;

                        break;
                    }
                }
                if (!simetrica) break;
            }
            long b = System.nanoTime();

            System.out.println("Tempo N = " + N + ": " + ( b - a) + " ns");
            System.out.println("Matriz " + (simetrica ? "simétrica" : "não simétrica"));
            System.out.println("Medição direta das Operações Aritméticas:e das Comparações: "+ (d+ c));

        }
    }
}

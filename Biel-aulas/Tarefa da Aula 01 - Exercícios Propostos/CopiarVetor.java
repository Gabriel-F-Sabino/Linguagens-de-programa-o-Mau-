public class CopiarVetor {
    public static void main (String[] args){

        int[] vetorA, vetorCopiado;
        int[] N = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};
        
        for (int n : N) {

            vetorA = new int[n];
            vetorCopiado = new int[n];

            int c = 1;
            int d = 0;
            
            for (int i = 0; i < vetorA.length; i++) {

                vetorA[i] = i;
            }
            
            long a = System.nanoTime();
            
            for (int i = 0; i < vetorA.length; i++) {

                vetorCopiado[i] = vetorA[i];

                c++;
                d++;
            }
            
            long b = System.nanoTime();
            
            System.out.println("Tempo para N = " + n + ": " + (b - a) + " ns");
            System.out.println("Medição direta das Operações Aritméticas:e das Comparações: "+ (d+ c));
        }

    }
}

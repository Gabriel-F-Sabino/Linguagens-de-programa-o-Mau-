public class CopiarVetor {
    public static void main (String[] args){

        long dcom = 0; // contador de comparações
        long darit = 0; // contador de operações aritméticas
        long dponto = 0; // contador de índice array
        long drec = 0; // contador de recupeção de valores
        long darm = 0; // contador de atribuição de valores

        int[] vetorA, vetorCopiado;
        int[] N = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};

        dcom++;

        System.out.println("Fórmula dos gastos: 10*n + 1 "); 
        
        for (int n : N) {

            vetorA = new int[n];
            vetorCopiado = new int[n];

           
            for (int i = 0; i < vetorA.length; i++) {

                vetorA[i] = i;

                darit++;
                dcom++;

            }
            
           
            
            for (int i = 0; i < vetorA.length; i++) {

                vetorCopiado[i] = vetorA[i];

                drec = drec + 5;
                dponto = dponto + 2;
                darm++;
               
            }
            
           
            long dtotal = dcom + darit + dponto + drec + darm;
            System.out.println("Gasto de esforço: " + (dtotal));

            dcom = 1;
            darit = 0;
            dponto = 0;
            drec = 0;
            darm = 0;
        }

    }
}

public class InicializaVetor{
    public static void main(String[] args){

        long dcom = 0; // contador de comparações
        long darit = 0; // contador de operações aritméticas
        long dponto = 0; // contador de índice array
        long drec = 0; // contador de recupeção de valores
        long darm = 0; // contador de atribuição de valores

        int [] vetor;
        int N[] = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};

        System.out.println("Fórmula dos gastos: 7*n + 1 "); 

        dcom++;
        for (int n : N){
            vetor = new int[n];
            
            
            for (int i = 0; i < vetor.length; i++){
                vetor[i] = 0;
        
                drec = drec + 3;
                dponto++;
                darm++;
                darit++;
                dcom++;

               
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
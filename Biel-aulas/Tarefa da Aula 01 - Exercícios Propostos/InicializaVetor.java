public class InicializaVetor{
    public static void main(String[] args){

        int [] vetor;
        int N[] = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};
        

        for (int n : N){
            vetor = new int[n];
            long a = System.nanoTime();

            int c = 1;
            int d = 0;
            
            for (int i = 0; i < vetor.length; i++){
                vetor[i] = 0;

                c++;
                d++;
                
            }
            
            long b = System.nanoTime();
            System.out.println("Tempo para um N = " + n + ": " + ( b - a ) + " ns ");
            System.out.println("Medição direta das Operações Aritméticas:e das Comparações: "+ (d+ c));
        }

    }
}
import java.util.concurrent.TimeUnit; // biblioteca para usar o tempo de duração

public class Ex3 {
    public static void main(String[] args) {
        /*
        int lin = 10000; // 50000 e 100000 não rodou por falta de memória
        int col = 1; // 25000 e 100000 não rodou por falta de memória
        double[][] matriz = new double[lin][col];

        long startTime = System.nanoTime(); // inicia a contagem do tempo
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = -1;
            }
        }
        long endTime = System.nanoTime(); // finaliza a contagem do tempo
        long duration = (endTime - startTime); // calcula a duração
        System.out.println("Tempo de execução: " + duration + " nanosegundos");
        */
        
        long compar = 0; // contador de comparações
        long aritOpe = 0; // contador de operações aritméticas
        
        int lin = 50; // 50000 e 100000 não rodou por falta de memória
        int col = 75; // 25000 e 100000 não rodou por falta de memória
        double[][] matriz = new double[lin][col]; 


        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = -1;
                compar++;
                aritOpe++;
            }
            compar++;
            aritOpe++;
        }
        compar++; // do for externo
        compar++; // do for interno
        System.out.println("Comparacoes: " + compar);
        System.out.println("Operacoes aritmeticas: " + aritOpe);
        System.out.println("Gasto de esforço: " + (compar + aritOpe)); 
    }
}
import java.util.concurrent.TimeUnit; // biblioteca para usar o tempo de duração

public class Ex1 {
    public static void main(String[] args) {
        
        int tam = 500000;
        int[] array = new int[tam];
        
        long startTime = System.nanoTime(); // inicia a contagem do tempo
        for (int i = 0; i < tam; i++) {
            array[i] = 0;
        }
        long endTime = System.nanoTime(); // finaliza a contagem do tempo
        long duration = (endTime - startTime); // calcula a duração
        System.out.println("Tempo de execução: " + duration + " nanosegundos");
        
        /*
        long compar = 0; // contador de comparações
        long aritOpe = 0; // contador de operações aritméticas
        
        int tam = 500000;
        int[] array = new int[tam];
        for (int i = 0; i < tam; i++) {
            compar++;
            aritOpe++;
            array[i] = 0;
        }
        compar++;
        System.out.println("Comparacoes: " + compar);
        System.out.println("Operacoes aritmeticas: " + aritOpe);
        System.out.println("Gasto de esforço: " + (compar + aritOpe)); */
    }
}


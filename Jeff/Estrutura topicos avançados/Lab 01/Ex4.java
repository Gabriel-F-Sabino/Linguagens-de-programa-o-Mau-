import java.util.concurrent.TimeUnit; // biblioteca para usar o tempo de duração

public class Ex4 {
    public static void main(String[] args) {
        /*
        int lin = 50000; // 50000, 100000 e 500000 não rodou por falta de memória
        int col = lin;
        double[][] matriz = new double[lin][col];
        double[][] matrizT = new double[col][lin];

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = -1;
            }
        }

        long startTime = System.nanoTime(); // inicia a contagem do tempo
        
		for(int i = 0; i < lin; i++) { //Determina transposta
            for(int j = 0; j < col; j++) {
                matrizT[j][i]=matriz[i][j];
            }
        }
        
        for(int i = 0; i < lin; i++) {  //Verifica simetria
            for(int j = 0; j < col; j++) {
                if(matriz[i][j] != matrizT[j][i]){
                    System.out.println("A matriz não é simétrica");
                    break;
                }
            }
        }
        long endTime = System.nanoTime(); // finaliza a contagem do tempo
        long duration = (endTime - startTime); // calcula a duração
        System.out.println("Tempo de execução: " + duration + " nanosegundos");
        */

        long compar = 0; // contador de comparações
        long aritOpe = 0; // contador de operações aritméticas
        
                
        int lin = 10; // 50000, 100000 e 500000 não rodou por falta de memória
        int col = lin;
        double[][] matriz = new double[lin][col];
        double[][] matrizT = new double[col][lin];

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = -1;
                compar++;
                aritOpe++;
            }
            compar++;
            aritOpe++;
        }
        compar = compar + 2;

		for(int i = 0; i < lin; i++) { //Determina transposta
            for(int j = 0; j < col; j++) {
                matrizT[j][i]=matriz[i][j];
                compar++;
                aritOpe++;
            }
            compar++;
            aritOpe++;
        }
        compar = compar + 2;

        for(int i = 0; i < lin; i++) {  //Verifica simetria
            for(int j = 0; j < col; j++) {
                if(matriz[i][j] != matrizT[j][i]){
                    System.out.println("A matriz não é simétrica");
                    break;
                }
                compar++;
                aritOpe++;
            }
            compar++;
            aritOpe++;
        }
        compar = compar + 2;

        System.out.println("Comparacoes: " + compar);
        System.out.println("Operacoes aritmeticas: " + aritOpe);
        System.out.println("Gasto de esforço: " + (compar + aritOpe)); 
    }
}
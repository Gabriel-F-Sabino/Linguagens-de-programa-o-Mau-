public class Ex2 {
    public static void main(String[] args) {
        
        long dcom = 0; // contador de comparações
        long darit = 0; // contador de operações aritméticas
        long dponto = 0; // contador de índice array
        long drec = 0; // contador de recupeção de valores
        long darm = 0; // contador de atribuição de valores
        
        int tam = 500000;
        int[] array = new int[tam];
        int[] arraycopiado = new int[tam];

        dcom++;
        for (int i = 0; i < tam; i++) {
            darit++;
            dcom++;

            arraycopiado[i] = array[i]; // copia o array para o arraycopiado
            drec = drec + 5;
            dponto = dponto + 2;
            darm++;
        }
        
        long dtotal = dcom + darit + dponto + drec + darm;
        System.out.println("Fórmula dos gastos: 10*n + 1 "); 
        System.out.println("Gasto de esforço: " + (dtotal));
    }
}
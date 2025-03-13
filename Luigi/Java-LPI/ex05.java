import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ex05 {
    public static void lerArquivo(String nomeArquivo){
        String[] lista = new String[10];

        try{
            File arquivo = new File(nomeArquivo);
            Scanner sc = new Scanner(arquivo);
            int i = 0;

            while(sc.hasNext() && i < lista.length){
                lista[i] = sc.nextLine();
                i++;
            }

            sc.close();

            for (int j = lista.length - 1; j >= 0; j--) {
                System.out.println(lista[j]);    
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        lerArquivo("ex05.txt");
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex05 {
    public static void lerTexto(String nomeArquivo) {
        try {
            File arquivo = new File(nomeArquivo);
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado: " + nomeArquivo);
                return;
            }
            Scanner sc = new Scanner(arquivo);
            System.out.println("Arquivo encontrado: " + nomeArquivo);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        lerTexto("poema.txt");
    }
}
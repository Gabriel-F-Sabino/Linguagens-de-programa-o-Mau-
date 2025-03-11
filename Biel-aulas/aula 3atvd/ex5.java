import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ex5 {
    public static void lerTexto(String nomeArquivo){

        try{

            File arquivo = new File(nomeArquivo);
            Scanner sc = new Scanner(arquivo);
            while(sc.hasNext()){

                System.out.print(sc.nextLine());
            }
            sc.close();
        }
        catch (FileNotFoundException e){

            e.printStackTrace();
        }
       
    }
    public static void main (String[] args){

        lerTexto("poema.txt");
        
    }
}

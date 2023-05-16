import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
public class lecturaFitxers{
    public void llegirFitxer(String document){
        File paraules_joc = new File("/home/super/Escritorio/historic/paraules-partides.txt");
        //Mentre hague una linea
        String linea;
        try (Scanner sc = new Scanner(paraules_joc, StandardCharsets.UTF_8))
        {  
            while(sc.hasNextLine()){
                linea = sc.nextLine();
                System.out.println(linea);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
         
  
   
    }

}
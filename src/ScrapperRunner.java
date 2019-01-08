import java.io.IOException;
import java.util.Scanner;

public class ScrapperRunner {

    public static void main(String [] args){
        try{
            Scrapper scrapper = new Scrapper();
            scrapper.ScrapperofWeb("http://horstmann.com/index.html");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

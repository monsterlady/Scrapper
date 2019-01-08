import javax.imageio.IIOException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scrapper {

    public void ScrapperofWeb(String address)throws IOException {
        URL pageLocation = new URL(address);
        Scanner webaddress = new Scanner(pageLocation.openStream());
        PrintWriter links = new PrintWriter("Links.txt");
        while(webaddress.hasNextLine()){
            if(webaddress.nextLine().contains("<a href=")){
                String [] link = webaddress.nextLine().split("\"");
                links.println(link[0]);
            }
        }
        System.out.println("Finished!");
        webaddress.close();
        links.close();
    }


}

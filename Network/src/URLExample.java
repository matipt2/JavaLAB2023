import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class URLExample {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://if.uj.edu.pl//");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while((line=in.readLine())!=null){
            System.out.println(line);

        }
        in.close();
    }
}

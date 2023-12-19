import java.io.*;
import java.net.*;

public class EchoServer{

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(6666);
        } catch (IOException e) {
            System.out.println("Could not listen on port: 6666");
            System.exit(-1);
        }

        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.out.println("Accept failed: 6666");
            System.exit(-1);
        }
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        clientSocket.getInputStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            int result = 0;
            int startIndex = 0;

            for (int i = 0; i < inputLine.length(); i++) {
                if (!Character.isDigit(inputLine.charAt(i))) {
                    int num = Integer.parseInt(inputLine.substring(startIndex, i));
                    String operator = inputLine.substring(i, i + 1);
                    startIndex = i + 1;
                    Calculator calculator = new Calculator(result, operator, num);
                    result = calculator.doCalculations(result, operator, num);
                }
            }

            if (startIndex < inputLine.length()) {
                int num = Integer.parseInt(inputLine.substring(startIndex));
                Calculator calculator = new Calculator(result, "", num);
                result = calculator.doCalculations(result, "", num);
            }

            out.println(result);
        }

        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();

}
}
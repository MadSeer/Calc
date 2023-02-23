import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Vvedite chisla");
        float num1 = Float.parseFloat(reader.readLine()), num2 = Float.parseFloat(reader.readLine()), res = 0;
        System.out.println("Vvedite znak");
        String operation = reader.readLine();
        System.out.println("Operator " + operation);
        switch (operation) {
            case "*" -> res = num1 * num2;
            case "/" -> res = num1 / num2;
            case "+" -> res = num1 + num2;
            case "-" -> res = num1 - num2;
        }
        System.out.println(num1 + " " + operation + " " + num2 + " = " + res);
    }
}
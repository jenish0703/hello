import java.util.Scanner;

// import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String name = "APP\napp";
        int port = 12;
        float time = 10.0f;
        boolean abc = false;
        double d = 10.999d;
        char c = 's';
        System.out.println(name + "\n" + port + "\n" + time + "\n" + abc + "\n" + d + "\n" + c);

        String input = "\"Abc\"\\";
        System.out.println(input.length());
        System.out.println(input.toUpperCase());
        System.out.println(input.toLowerCase());
        System.out.println(input.contains("bc"));
        System.out.println("----------------------------------------------\n");
        System.out.println(Math.max(1, 3));
        System.out.println(Math.min(1, 3));
        System.out.println(Math.sqrt(39));
        System.out.println(Math.abs(-50));
        System.out.println(Math.abs(49));
        System.out.println(Math.random());
        System.out.println(4 + (8 - 4) * Math.random());
        System.out.println("----------------------------------------------\n");

        Scanner i = new Scanner(System.in);
        int inputs = i.nextInt();
    }
}
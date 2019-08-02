import java.io.IOException;
import java.util.Scanner;
 public class WaiterImpl implements EnterMethod {

     @MethodCallLogging
     public final void waitForInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                    System.out.println("Waiting for new lines. Key in Ctrl+D to exit. \n" +
                            "1 - to console\n" +
                            "2 - to file\n" +
                            "3 - to console and file");
                    String massageType = scanner.nextLine();
                    System.out.println("Enter massage:");
                    String massage = scanner.nextLine();

                    if (massageType.equals("1")) {
                        EnterToConsole.writeTo(massage);
                    } else if (massageType.equals("2")) {
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("Enter tag:");
                        String tag = scanner1.nextLine();
                        EnterToFile.writeTo(massage, tag);
                    } else if (massageType.equals("3")) {
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.println("Enter tag:");
                        String tag = scanner2.nextLine();
                        EnterToConsoleFile.writeTo(massage, tag);
                    } else {
                        System.out.println("error");
                        System.exit(0);
                    }

            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}

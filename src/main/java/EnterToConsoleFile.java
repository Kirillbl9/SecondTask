import java.io.FileWriter;
import java.io.IOException;

public abstract class EnterToConsoleFile implements EnterMethod{

    public static void writeTo(String massage, String tag) throws IOException {
        FileWriter writer = new FileWriter("src/main/resources/NewFile.txt");
        writer.write("Massage №"+Counter.score+" - "+"<"+tag+">"+massage+"</"+tag+">");
        writer.close();
        Counter.score++;
        System.out.println("Massage №"+Counter.score+" - "+massage);
        Counter.score++;
     }

}

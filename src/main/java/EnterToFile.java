import java.io.FileWriter;
import java.io.IOException;

public abstract class EnterToFile implements EnterMethod{
    public static void writeTo(String massage, String tag) throws IOException {
        FileWriter writer = new FileWriter("src/main/resources/NewFile.txt");
        writer.write("Massage №"+Counter.score+" - "+"<"+tag+">"+massage+"</"+tag+">");
        Counter.score++;
        writer.close();
    }
}



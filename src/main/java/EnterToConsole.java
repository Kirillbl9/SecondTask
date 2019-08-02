public abstract class EnterToConsole implements EnterMethod{

    public static void writeTo(String massage){
            System.out.println("Massage №"+Counter.score+" - "+massage);
        Counter.score++;
    }
}



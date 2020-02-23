package part2;

public class CompilerBehavior {
    public static void main(String[] args) throws Throwable {
        try {
            Throwable t = new Exception();
            throw t;
        } catch (Exception exception) {
            System.out.println("Got an exception");
        }
    }
}

package part1;

public class NonLocalControlTransfer {
    public static void main(String[] args) throws Exception {
        try {
        System.err.println("0");
            if (true) {
                throw new Exception();
            }
            System.err.println("1");
        } catch (RuntimeException e) {
            System.err.println(" 2");
        }
        System.err.println("3");
    }

}

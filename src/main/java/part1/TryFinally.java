package part1;

public class TryFinally {
    public static void main(String[] args) {
        try{
            System.exit(42);
//            Runtime.getRuntime().exit(42);    equals line 6
        }finally {
            System.err.println("finally");
        }
    }
}

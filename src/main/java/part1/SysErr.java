package part1;

public class SysErr {
    public static void main(String[] args) {
        System.err.println("sout");
        throw new Error();
    }
}

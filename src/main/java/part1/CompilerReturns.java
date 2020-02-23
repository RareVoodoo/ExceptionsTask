package part1;

public class CompilerReturns {
    public static double sqr(double arg){
        long time = System.currentTimeMillis();
        if (time % 2== 0){
            return arg * arg;
        }else if (time % 2 == 1){
            while (true);
        }else{
            throw  new RuntimeException();
        }
    }

    public static void error(){
        throw new RuntimeException();
    }

    public static void main(String[] args) {
//        System.out.println(sqr(20.0));
        error();
    }
}

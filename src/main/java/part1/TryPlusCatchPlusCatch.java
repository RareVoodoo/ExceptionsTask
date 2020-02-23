package part1;

public class TryPlusCatchPlusCatch {
    public static void main(String[] args) {
        try{
            Throwable t = new Exception();
            throw t;
        }catch (RuntimeException e){
            System.err.println("catch RuntimeException");
        }catch (Exception e){
            System.err.println("catch Exception");
        }catch (Throwable e){
            System.err.println("catch throwable");
        }
        System.err.println("next statement");
    }
}

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.logging();
        logger2.logging();

        if (logger1==logger2){
            System.out.println("Excelent");
        }else{
            System.out.println("Terrible");
        }
    }
}

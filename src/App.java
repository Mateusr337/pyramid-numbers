public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("starting program ...");

        for (int i = 1; i < 5; i++) {
            printLine(i);
        }
        System.out.println("Finished program.");
    }

    public static void printLine (int number) {
        String sequenceNumbers = "";

        for (int i = 0; i < number; i++) {
            sequenceNumbers = sequenceNumbers + number;
        }
        System.out.println(sequenceNumbers);
    }
}

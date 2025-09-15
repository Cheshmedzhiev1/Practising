public class MainPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.addJob("B", 5);
        printer.addJob("B", 2);
        printer.addJob("C", 1);

        printer.showQueue();

        while (printer.hasJobs()) {
            printer.printPage();
            printer.showQueue();
        }
        for (int i = 0; i < 2; i++) {
            printer.showQueue();
        }
    }
}

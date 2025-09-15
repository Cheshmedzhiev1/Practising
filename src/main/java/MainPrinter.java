public class MainPrinter {
    public static void main(String[] args) {

        Printer printer = new Printer();

      //  PrintJob printJob1 = new PrintJob(3, "First");
        //intJob printJob2 = new PrintJob(1, "Second");
        //PrintJob printJob3 = new PrintJob(2, "Third");


       // printer.addJob(printJob1);
       // printer.addJob(printJob2);
       // printer.addJob(printJob3);

        printer.printPage();
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

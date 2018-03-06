import java.util.Date;

public class PrintDate {
    private Printer printer;

    public PrintDate(Printer printer) {
        this.printer = printer;
    }

    public void printCurrentDate() {
        printer.print(createDate());
    }

    private Date createDate() {
        return new Date();
    }


}

package com.isaachome.study.machine;

public class PrinterApplication {
    static void main() {
        Printer printer = new BasicPrinter2000();
        printer.print();

        Scanner scanner = new OfficePrinter();
        scanner.scan();

        ModernMultiFunctionPrinter machine =
                new ModernMultiFunctionPrinter();

        machine.print();
        machine.scan();
        machine.fax();

    }

}

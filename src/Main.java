public class Main {
    public static void main(String[] args) {
        RAM ram1 = new RAM("Ram", "ramownia", "123", 100, 10, 30);
        System.out.println(ram1);
        ram1.increaseTiming(10);
        System.out.println(ram1);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        Processor processor1 = new Processor("Pro.", "Prr", "123", 100, 10, 40);
        System.out.println(processor1);
        processor1.increaseTiming(20);
        System.out.println(processor1);
        processor1.increaseTiming(50000);
    }
}

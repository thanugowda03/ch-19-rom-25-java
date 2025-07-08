class CanaraBank{
    static String banker = "Cashier";

    public static void main(String[] employee) {
        System.out.println("main started");
        service(banker);
        System.out.println("main ended");
    }

    public static void service(String service) {
        System.out.println("Position in bank: " + service);
    }
}

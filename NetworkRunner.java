class NetworkRunner {
    public static void main(String[] network) {
        System.out.println("main started");

        Network network1 = new Network(1, "Airtel", "5G", 3.5, "Nationwide", 250);
        network1.getNetworkInfo();

        Network network2 = new Network(2, "Jio", "4G", 2.3, "Urban", 150);
        network2.getNetworkInfo();

        Network network3 = new Network(3, "Vi", "3G", 2.1, "Rural", 30);
        network3.getNetworkInfo();

        Network network4 = new Network(4, "BSNL", "4G", 2.5, "Nationwide", 50);
        network4.getNetworkInfo();

        Network network5 = new Network(5, "ACT", "Wi-Fi", 5.0, "Urban", 300);
        network5.getNetworkInfo();

        Network network6 = new Network(6, "Hathway", "Wi-Fi", 2.4, "Urban", 180);
        network6.getNetworkInfo();

        Network network7 = new Network(7, "Excitel", "Wi-Fi", 5.0, "Urban", 275);
        network7.getNetworkInfo();

        Network network8 = new Network(8, "JioFiber", "Wi-Fi", 5.0, "Nationwide", 500);
        network8.getNetworkInfo();

        Network network9 = new Network(9, "Tata Comm", "5G", 3.6, "Urban", 220);
        network9.getNetworkInfo();

        Network network10 = new Network(10, "Idea", "3G", 2.1, "Rural", 25);
        network10.getNetworkInfo();

        Network network11 = new Network(11, "AT&T", "5G", 3.4, "Global", 280);
        network11.getNetworkInfo();

        Network network12 = new Network(12, "T-Mobile", "4G", 2.6, "Urban", 130);
        network12.getNetworkInfo();

        Network network13 = new Network(13, "Verizon", "5G", 3.7, "Urban", 330);
        network13.getNetworkInfo();

        Network network14 = new Network(14, "RailWire", "Wi-Fi", 2.4, "Rural", 90);
        network14.getNetworkInfo();

        Network network15 = new Network(15, "BSNL WiMax", "Wi-Fi", 2.5, "Rural", 85);
        network15.getNetworkInfo();

        Network network16 = new Network(16, "SPECTRUM", "4G", 2.3, "Urban", 100);
        network16.getNetworkInfo();

        Network network17 = new Network(17, "BSNL Fiber", "Wi-Fi", 5.0, "Nationwide", 310);
        network17.getNetworkInfo();

        Network network18 = new Network(18, "Google Fi", "5G", 3.5, "Global", 270);
        network18.getNetworkInfo();

        Network network19 = new Network(19, "Telenor", "4G", 2.5, "Urban", 105);
        network19.getNetworkInfo();

        Network network20 = new Network(20, "Orange", "5G", 3.8, "Europe", 320);
        network20.getNetworkInfo();

        System.out.println("main ended");
    }
}

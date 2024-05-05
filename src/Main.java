public class Main {
    public static void main(String[] args) {
        double uangDidompet = 5000000;
        double totalBayar = 2000000;
        int TokoComputer = 2;
        switch (TokoComputer) {
            case 1:
                if (uangDidompet > totalBayar) {
                    double kembalian = uangDidompet-totalBayar;
                    System.out.println("Graphics Card: [AMD Ryzen RX 7000] \"Delivery to your Address\" Your Balance left : "+kembalian);
                    break;
                }else if (uangDidompet < totalBayar){
                    System.out.println("[Please check your bank account when want to purchase our product]");
                    break;
                }
            case 2:
                if (uangDidompet > totalBayar) {
                    double kembalian = uangDidompet-totalBayar;
                    System.out.println("Graphics Card: [NVIDIA RTX 2090TI] \"Delivery to your Address\" Your Balance left : "+kembalian);
                    break;
                }else if (uangDidompet < totalBayar){
                    System.out.println("[Please check your bank account when want to purchase our product]");
                    break;
                }
        }
    }
}
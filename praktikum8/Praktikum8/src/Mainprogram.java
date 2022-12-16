public class Mainprogram {
    private static String Secound;

    public static void main(String[] args) {
        Customer Taufik_Hidayat = new Customer();
        Taufik_Hidayat.nama = "Taufik hidayat joker";
        Taufik_Hidayat.alamat = "Bcm";
        
        Order Laptop = new Order();
        
        Laptop.date = 5;
        Laptop.status = "New";
        
        Payment credit = new Payment();

        System.out.println("Harga_laptop   :15 jt  ");
    }
}
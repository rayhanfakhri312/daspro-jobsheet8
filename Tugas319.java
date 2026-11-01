import java.util.Scanner;
public class Tugas319 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;
        do{
            System.out.print("jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1){
                System.out.println("Jumlah toko minimal 1");
            }
        }while(jumlahToko < 1);

        int totalsemua = 0;
        int barangTerbanyak = 0;
        int tokoTerbanyak = 0;
        String ringkasan="";

        for (int toko = 1; toko<=jumlahToko;toko++){
            System.out.println("toko "+toko);
            int jumlahpelanggan;
            do {
                System.out.print("Jumlah pelanggan: ");
                jumlahpelanggan = sc.nextInt();
                if (jumlahpelanggan < 0){
                    System.out.println("jumlah pelanggan tidak boleh negatif");
                }
            }while(jumlahpelanggan < 0);

            int totalBarangperToko = 0;
            for (int p = 1; p <=jumlahpelanggan; p++){
                int barang;
                do {
                    System.out.print("barang di beli pelanggan "+p+": ");
                    barang = sc.nextInt();
                    if(barang < 0 ){
                        System.out.println("Barang tidak boleh negatif");
                    }
                }while(barang<0);
                totalBarangperToko += barang;
            }
            ringkasan += "toko " + toko + "- pelanggan: " + jumlahpelanggan + ", total barang: "+totalBarangperToko+"\n";
            totalsemua += totalBarangperToko;

            if(totalBarangperToko> barangTerbanyak){
                barangTerbanyak= totalBarangperToko;
                tokoTerbanyak = toko;
            }
            
        }
        System.out.print(ringkasan);
        System.out.println("Total barang seluruh toko: "+totalsemua);
        System.out.println("Toko dengan barang terbanyak: "+tokoTerbanyak);
        sc.close();
    }
}

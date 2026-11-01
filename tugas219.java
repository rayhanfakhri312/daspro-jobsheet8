import java.util.Scanner;
public class tugas219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai N: ");
        int n = sc.nextInt();
        int total=0,hasil;
        if (n < 3) {
            System.out.println("Nilai minimal 3!");
        }else{
            for(int i = 1;i <= n;i++){
                for (int j = 1;j <= n;j++){
                    hasil = i*j;
                    System.out.printf("%4d", hasil);
                    total+=hasil;
                }
            System.out.println();
            }
        System.out.println("Jumlah seluruh angka: "+total);
        }
        sc.close();
    }
}

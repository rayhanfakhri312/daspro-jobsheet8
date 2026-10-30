import java.util.Scanner;
public class tugas119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai N: ");
        int n = sc.nextInt();
        int total= 0;
        if (n<0) {
            System.out.println("Angka tidak valid");
        }else{
            for (int i = 1; i <=n;i++){
                for (int j =1; j<=i;j++){
                    System.out.print(j);
                    total++;
                }
            System.out.println();
            }
        System.out.println("Total angka tercetak: "+total);
        }
    }
}

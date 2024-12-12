import java.util.Scanner;

public class Nomor1 {

    public static void deretFizzBuzz(int N) {
        for (int i = 0; i <= N; i++) {
            if (i==0) {
                System.out.print("0 ");
            }else if(i % 3 == 0 && i % 5 == 0){
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();
        deretFizzBuzz(n);
         
System.out.println("Jumlah metode dalam kelas: " + Nomor1.class.getDeclaredMethods().length);

    }
}

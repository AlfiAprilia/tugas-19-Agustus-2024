import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) {
       
        double hargaBarang,diskon,jumlahBarang,totalHarga,hasilTotalHarga,hasilDiskon,hasilTotalHarga2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan harga barang : ");
        hargaBarang = input.nextDouble();
        System.out.println("Masukkan diskon  : ");
        diskon = input.nextDouble();
        System.out.println("Masukkan jumlah barang : ");
        jumlahBarang = input.nextDouble();
        System.out.println("Masukkan total harga : ");
        totalHarga = input.nextDouble();

        hasilTotalHarga = hargaBarang*jumlahBarang;
        System.out.println("Hasil total harga adalah: "+hasilTotalHarga);
        hasilDiskon = (diskon/100)*totalHarga;
        System.out.println("Hasil diskon belanja adalah: "+hasilDiskon);
        hasilTotalHarga2 = totalHarga - diskon;
        System.out.println("Hasil total harga belanja adalah: "+hasilTotalHarga2);


    }
    
}

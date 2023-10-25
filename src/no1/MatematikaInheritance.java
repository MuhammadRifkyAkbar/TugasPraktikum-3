package no1;

public class MatematikaInheritance {
    public static void main(String[] args) {
        // Buat objek Matematika
        Matematika matematika = new Matematika();

        // Panggil method dari class Matematika
        matematika.pertambahan(5, 3);
        matematika.pengurangan(7, 2);
        matematika.perkalian(4, 6);
        matematika.pembagian(10, 2);

        // Panggil method info untuk menampilkan hasil
        matematika.info();

        // Buat objek Matematika2
        Matematika2 matematika2 = new Matematika2();
        matematika2.CetakModukus(10,6);
        matematika2.disp();

    }
}

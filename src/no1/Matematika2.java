package no1;

public class Matematika2 extends Matematika {
    public int CetakModukus(int a, int b){
        this.angka9 = a;
        this.angka10 = b;
        return a%b;
    }
    public void disp(){
        // Panggil method info untuk menampilkan hasil dari Matematika2
        System.out.println("Modulus      : " +angka9 +" % " + angka10 + " = " + CetakModukus(angka9,angka10));
    }
}
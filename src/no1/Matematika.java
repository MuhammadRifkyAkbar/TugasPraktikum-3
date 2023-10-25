package no1;

public class Matematika{
    int angka1, angka2, angka3, angka4, angka5, angka6;
    int angka7, angka8;
    public int angka9, angka10;
    public int pertambahan(int a, int b) {
        this.angka1 = a;
        this.angka2 = b;
        return a + b;
    }
    public int pengurangan(int a, int b) {
        this.angka3 = a;
        this.angka4 = b;
        return a - b;
    }
    public int perkalian(int a, int b) {
        this.angka5 = a;
        this.angka6 = b;
        return a * b;
    }

    public int pembagian(int a, int b) {
        this.angka7 = a;
        this.angka8 = b;
        return a / b;
    }

    public void info() {
        System.out.println("Pertambahan  : " + angka1 + " + " + angka2 + " = " + pertambahan(angka1, angka2));
        System.out.println("Pengurangan  : " + angka3 + " - " + angka4 + " = " + pengurangan(angka3, angka4));
        System.out.println("Perkalian    : " + angka5 + " x " + angka6 + " = " + perkalian(angka5, angka6));
        System.out.println("Pembagian    : " + angka7 + " / " + angka8 + " = " + pembagian(angka7, angka8));
    }
}

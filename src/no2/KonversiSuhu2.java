package no2;

public class KonversiSuhu2 extends KonversiSuhu {
    public double fahrenheitToReamur() {
        double fahrenheit = getFahrenheit(); //nilai fahrenheit diambil dari nilai konversi suhu celcius ke fahrenheit
        double reamur = (4.0 / 9.0) * (fahrenheit - 32);
        return reamur;
    }

    public void display2() {
        System.out.println("");
        System.out.println("Nilai Konversi dari Celcius ke Fahnrenheit: " + getFahrenheit() + " kita konversi ke Reamur menjadi");
        System.out.println(fahrenheitToReamur() + " derajat reamur");
    }
}

package no2;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu ks1 = new KonversiSuhu();
        ks1.celciusToFahrenheit(97);
        ks1.celciusToReamur(36);
        ks1.display();

        KonversiSuhu2 ks2 = new KonversiSuhu2();
        ks2.celciusToFahrenheit(4);
        ks2.display2();
    }
}

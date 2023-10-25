package no2;

public class KonversiSuhu {
    private double celcius, fahrenheit, reamur;

    public void celciusToFahrenheit(double celcius) {
        this.celcius = celcius;
        fahrenheit = (9.0 / 5.0) * celcius + 32;
    }

    public void celciusToReamur(double celcius) {
        this.celcius = celcius;
        reamur = (4.0 / 5.0) * celcius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public double getReamur() {
        return reamur;
    }

    public void display() {
        System.out.println("Hasil Konversinya celcius ke fahrenheit adalah: " + getFahrenheit() + " derajat fahrenheit");
        System.out.println("Hasil Konversinya celcius ke reamur adalah: " + getReamur() + " derajat reamur");
    }
}

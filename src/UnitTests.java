import static java.lang.Math.pow;

public class UnitTests {

    public static double zinsBerechnung(double kapital, double zins, int jahre) {
        double gesamtBetrag = (kapital * (zins/100) * jahre);
        return gesamtBetrag;
    }
    public static double gesamtKapitalMitZinsen(double kapital, double zins, int jahre) {
            double gesamtbetrag = ((kapital * (zins/100) * jahre) + kapital);
            return gesamtbetrag;
    }
    public static double rendite(double startKapital, double endKapital, int jahre) {
        double rendite = ((endKapital - startKapital) / startKapital) * 100;
        return rendite;
    }
    public static double monatlicheRate(double kreditBetrag, double zins, int jahre) {
        double monatlicheZinsen = (zins / 100) / 12;
        double zahlungenMonat = jahre * 12;
        double monatlicheRate = (kreditBetrag * monatlicheZinsen) / (1 - Math.pow(1 + monatlicheZinsen, -zahlungenMonat));
        return monatlicheRate;
    }
    public static double divide(double zahl1, double zahl2) {
        if (zahl2 == 0) {
            throw new IllegalArgumentException("Division durch 0 nicht möglich");
        } else {
            return zahl1 / zahl2;
        }
    }
    public static void main(String[] args) {
        // UnitTests unitTests = new UnitTests(); // Object erzeugen für Methodenaufruf wenn Funktion nicht static
        // System.out.println(UnitTests.zinsBerechnung(1000,10,2));
        System.out.println(zinsBerechnung(1000,10,2));
    }
}

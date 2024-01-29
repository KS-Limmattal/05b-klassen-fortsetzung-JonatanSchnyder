public class FractionTester {
    public static void main(String[] args) {
        Fraction f = new Fraction();
        // Der folgende Code funktioniert nur, wenn die Felder von Fraction nicht privat sind:
        System.out.println(f);
        f.setNumerator(12);
        f.setDenominator(1);

	
        // System.out.println(f.numerator + "/" + f.denominator);
        System.out.println(f);
        
        // toString():

        // Encapsulation, Getter und Setter:

        // Copy-Konstruktor und equals():
	Fraction b = new Fraction(f);
	System.out.println((b.equals(f)) ? "b === f" : "b !== f");
        
        // Klassen- und Instanzenmethoden:

        // statische Variablen:

    }

}

public class FractionTester {
    public static void main(String[] args) {
        Fraction f = new Fraction();

	System.out.println(Fraction.pi);
	System.out.println(f.pi);
	// f.PI =5;

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
	
	Fraction a4 = new Fraction(2,3);
	Fraction b4 = new Fraction(3,2);

	System.out.println(Fraction.multiply(a4, b4));
	System.out.println(a4.multiply(b4));

        // statische Variablen:

    }

}

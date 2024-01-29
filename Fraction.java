public class Fraction {
    static int numberOfFractions;
    private int numerator, denominator;

    @Override
    public String toString() {
	    return this.numerator + "/" + this.denominator;
    }

    public Fraction(int numerator, int denominator) {
	    this.numerator = numerator;
	    this.denominator = denominator;
	    numberOfFractions++;
    }
    
    public Fraction(Fraction f) {
        this(f.numerator, f.denominator);
    }

    public Fraction() {
        this(0, 1);
    }

    public void setDenominator(int denominator) {
	    if (denominator == 0) {
		    throw new ArithmeticException("Division by zero");
	    } else {
		    this.denominator = denominator;
	    }
    }

    public void setNumerator(int numerator) {
	    this.numerator = numerator;
    }

    public void addTo(Fraction f) {
        this.setNumerator(this.numerator * f.denominator + this.denominator * f.numerator);
        this.setDenominator(this.denominator * f.denominator);
    }

    public Fraction add(Fraction f) {
	    return new Fraction(this.numerator * f.denominator + this.denominator * f.numerator, this.denominator * f.denominator);
    }

    public static Fraction add(Fraction f, Fraction g) {
	    // f.addTo(g);
	    return f.add(g);
    }
    
    public boolean equals(Fraction f) {
        return this.numerator * f.denominator == this.denominator * f.numerator;
    }

}

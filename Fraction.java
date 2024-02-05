public class Fraction {
	// final double PI = 3.14159;
	static int numberOfFractions;
	private int numerator, denominator;
	static protected float pi = 3.14159f;

	private static int gcd(int first, int second) {
		if (first % second == 0) {
			return second;
		}
		return gcd(second, first % second);
	}

	private void simplify() {
		int thegcd = gcd(this.numerator, this.denominator);
		this.numerator /= thegcd;
		this.denominator /= thegcd;
	}


	public static Fraction multiply(Fraction one, Fraction two) {
		return new Fraction(one.numerator * two.numerator, one.denominator * two.denominator); }
	public static Fraction multiply(Fraction one, int two) {
		return multiply(one, new Fraction(two)); }
	public static Fraction multiply(int one, Fraction two) {
		return multiply(new Fraction(one), two); }
	public static Fraction multiply(int one, int two) {
		return new Fraction(one * two);}
	public Fraction multiply(Fraction other) {
		return Fraction.multiply(this, other); }
	public Fraction multiply(int other) {
		return Fraction.multiply(this, new Fraction(other)); }


	public static Fraction subtract(Fraction one, Fraction two) {
		return new Fraction(one.numerator * two.denominator - one.denominator * two.numerator, one.denominator * two.denominator); }
	public static Fraction subtract(Fraction one,int two){
		return subtract(one, new Fraction(two));}
	public static Fraction subtract(int one, Fraction two){
		return subtract(new Fraction(one), two); }
	public static Fraction subtract(int one, int two){
		return new Fraction(one - two); }
	public Fraction subtract(Fraction other) {
		return Fraction.multiply(this, other); }
	public Fraction subtract(int other) {
		return Fraction.multiply(this, new Fraction(other)); }


	public static Fraction divide(Fraction one, Fraction two) {
		return new Fraction(one.numerator * two.denominator, one.denominator * two.numerator); }
	public static Fraction divide(Fraction one, int two) {
		return divide(one, new Fraction(two));}
	public static Fraction divide(int one, Fraction two) {
		return divide(new Fraction(one), two);}
	public static Fraction divide(int one, int two) {
		return new Fraction(one / two);}
	public Fraction divide(Fraction other) {
		return Fraction.divide(this, other); }
	public Fraction divide(int other) {
		return Fraction.divide(this, new Fraction(other)); }


	public static Fraction add(Fraction f, Fraction g) {
		return new Fraction(f.numerator * g.denominator + f.denominator * g.numerator, f.denominator * g.denominator); }
	public static Fraction add(Fraction f, int g) {
		return add(f, new Fraction(g)); }
	public static Fraction add(int f, Fraction g) {
		return add(new Fraction(f), g); }
	public static Fraction add(int f, int g) {
		return new Fraction(f + g); }
	public Fraction add(Fraction f) {
		return add(this, f); }
	public Fraction add(int f) {
		return add(this, new Fraction(f)); }


	@Override
	public String toString() {
		if (this.denominator == 1 || this.denominator == -1) {
			return "" + (this.numerator * this.denominator); }
		if (numerator / denominator >= 1) {
			return (numerator/denominator) + "+" + numerator%denominator + "/" + denominator; }
		return this.numerator + "/" + this.denominator;
	}

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		this.simplify();
		numberOfFractions++;
	}
	public Fraction(Fraction f) {
		this(f.numerator, f.denominator); }
	public Fraction() {
		this(0, 1); }
	public Fraction(int numerator) {
		this(numerator, 1); }


	public void setDenominator(int denominator) {
		if (denominator == 0) {
			throw new ArithmeticException("Division by zero");
		} else {
			this.denominator = denominator;
			this.simplify();
		}
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
		this.simplify();
	}

	public void addTo(Fraction f) {
		this.setNumerator(this.numerator * f.denominator + this.denominator * f.numerator);
		this.setDenominator(this.denominator * f.denominator);
		this.simplify();
	}



	public boolean equals(Fraction f) {
		return this.numerator * f.denominator == this.denominator * f.numerator;
	}

}

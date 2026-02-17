package com.Experiment;

// Importing the math package.
// In math package their are 3 classes are present and 1 enums
// BigDecimal, BigInteger and MathContext.
// RoundingMode is the enums.
import java.math.*;

public class Long {
//  Type mismatch: cannot convert from int to BigInteger
//	BigInteger bi = 100;

	BigDecimal bd;

	// To access the BigIntegers and BigDecimals we need to create the constructors.
	// Their are diiferent types of contructors are present in java api website.

	// grows as large as memory allows
	BigInteger bi = new BigInteger("5994306948999214382");
	BigInteger bi1 = new BigInteger("5994306948999214382");
	BigDecimal bd1 = new BigDecimal("5994306948999214382.123456789012345678901234567890");
	BigDecimal bd2 = new BigDecimal("5994306948999214382.123456789012345678901234567890");

	public static void main(String[] args) {

		Long l = new Long();
		System.out.println(l.bi);
		System.out.println(l.bd1);
//		System.out.println(l.bi+l.bd1); The operator + is undefined for the argument type(s) BigInteger, BigDecimal
		// BigInteger is done using the method summary.

		System.out.println();
		System.out.println("Returns a BigInteger whose value is (this + val).");
		// The method add(BigInteger) in the type BigInteger is not applicable for the
		// arguments (BigDecimal)
		System.out.println(l.bi.add(l.bi1));

		System.out.println();
		System.out.println("Returns a BigDecimal whose value is (this + val).");
		System.out.println(l.bd1.add(l.bd2));

		System.out.println();
		System.out.println("Returns a BigInteger whose value is (this * val).");
		System.out.println(l.bi.multiply(l.bi1));

		System.out.println();
		System.out.println("Returns a BigDecimal whose value is (this * val).");
		System.out.println(l.bd1.multiply(l.bd2));

		System.out.println();
		System.out.println("Returns the minimum of this BigInteger and val.");
		System.out.println(l.bi.min(l.bi1));

		System.out.println();
		System.out.println("Returns the minimum of this BigDecimal and val.");
		System.out.println(l.bd1.min(l.bd2));

		System.out.println();
		System.out.println("Returns the maximum of this BigInteger and val.");
		System.out.println(l.bi.max(l.bi1));

		System.out.println();
		System.out.println("Returns the maximum of this BigDecimal and val.");
		System.out.println(l.bd1.max(l.bd2));

		System.out.println();
		System.out.println("Returns a BigInteger whose value is (this / val).");
		System.out.println(l.bi.divide(l.bi1));

		System.out.println();
		System.out.println("Returns a BigDecimal whose value is (this / val).");
		System.out.println(l.bd1.divide(l.bd2));

		System.out.println();
		System.out.println("Converts this BigInteger to a float.");
		System.out.println(l.bi.floatValue());

		System.out.println();
		System.out.println("Converts this BigDecimal to a float.");
		System.out.println(l.bd1.floatValue());

		System.out.println();
		System.out.println("Converts this BigInteger to a long.");
		System.out.println(l.bi.longValue());

		System.out.println();
		System.out.println("Converts this BigDecimal to a long.");
		System.out.println(l.bd1.longValue());
	}

}

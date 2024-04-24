package com.promineotech;

import java.lang.Math;
import java.util.Random;

import com.google.common.annotations.VisibleForTesting;

public class TestDemo {
	public int addPositive(int a, int b) {
		if (a>0 && b>0) {
			return a+b;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public boolean isNumPrime(int a) {
		// First modify number to be able to take sqrt.
		if(a<0) {
			a = a*-1;
		}
		
		// Verify 0 or 1 are returned as not prime by definition.
		if(a == 0 || a == 1) {
			return false;
		}
		
		// Check to determine if a composite number of a lower integer starting at 2 and up to the root of the given number.
		int root = (int)Math.sqrt(a);
		
		for(int i = 2; i <= root; i++) {
			if(a%i == 0) {
				return false;
			}
		}
		
		// finally, if all other tests fail, the number must be prime
		return true;
	}
	
	public int randomNumberSquared() {
		int randValue = getRandomInt();
		return randValue*randValue;
		}

	@VisibleForTesting
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
}

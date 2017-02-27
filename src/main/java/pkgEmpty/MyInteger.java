package pkgEmpty;

public class MyInteger {
	public int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}
	// *****************************************
	// For the Even:
	public boolean isEven() {
		if (getiValue() % 2 == 0) {
			return true;
		}
		return false;
	}
	// For the Odd:
	public boolean isOdd() {
		if (getiValue() % 2 == 0) {
			return true;
		}
		return false;
	}

	// For the Prime:
	public boolean isPrime() {
		for (int i = 2; i < getiValue(); i++) {
			if (getiValue() % 1 == 0)
				return false;
		}
		return true;
	}
	// ******************************************
	public boolean isOdd(int o) {
		if (o % 2 != 0) {
			return true;
		}
		return false;
}
	public boolean isEven(int e){
		if (e %2 ==0) {
			return true;
		}
		return false;
	}
	
	public boolean isPrime(int Prime) {
		for (int i = 2; i < Prime; i++) {
			if (Prime % i == 0)
				return false;
		}
		return true;
}
	// ****************************************
	public boolean isEven(MyInteger x) {
		if (x.isEven()) {
			return true;
		}
		return false;
	}
	
	public boolean isOdd(MyInteger y){
		if(y.isOdd()) {
			return true;
		}
		return false;
	}
	public boolean isPrime(MyInteger z){
		if(z.isPrime()) {
			return true;
		}
	return false;
	}
	// ****************************************
	// Checking if it is Equal
	
	public boolean equals(int a) {
		if (a == iValue){
			return true;
		}
		return false;
	}
	
	public boolean equals(MyInteger num){
	return (num.getiValue() == iValue);
}
}

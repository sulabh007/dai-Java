class MyException extends Exception{
	String message;
	public MyException(String message) {
		this.message=message;
	}
	
	public String toString() {
		return message;
	}
}


public class Exception_Demo2 {
	public static double divide(int num, int den) throws MyException{
		if(den==0) {
			throw new MyException("Denominator is zero");
		}
		return (double)num/den;
	}

	public static void main(String[] args) {
		try {
			System.out.println(divide(12,0));
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
}

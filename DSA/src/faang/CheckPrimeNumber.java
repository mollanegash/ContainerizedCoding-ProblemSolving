package faang;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		isprime(5);//true
		isprime(12);//false
		isprime(36);//false
		isprime(7);//true
		isprime(500);//false
		isprime(15);//false
	}
	
	static void isprime(int num) {
		boolean isprime=true;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				isprime=false;
				
			}
			
		}
		System.out.println(isprime);
		
	}

}

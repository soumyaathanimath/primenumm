package primenum;

public class Unitt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isprime(91));
	}
	
	static boolean isprime(int n)
	{
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
	}
}
	


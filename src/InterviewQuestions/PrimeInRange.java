package InterviewQuestions;

public class PrimeInRange {
	public static void main(String[] args) {
		int start =10,end =50;
	
		for(int num =start;num<=end;num++) {
			boolean isprime=true;
			for(int i=2;i<=end;num++) {
				if (num%i==0) {
					isprime=false;
					break;
				}
			}
			if (isprime && num>1) {
				System.out.println(num +" ");
		}
		
		}
	}
}

package InterviewQuestions;

public class GCD {
// Calculate GCD of Two Number
	public static void main(String[] args) {
		int a=60,b=48;
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
			
		}
		System.out.println(a);
	}

}
package InterviewQuestions;

public class LeapYear {

	public static void main(String[] args) {
		int year=2024;
		boolean isLeap =(year%4==0&&year%100!=0)||(year%400==0);
	System.out.println(isLeap);
	}

}

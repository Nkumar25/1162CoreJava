package InterviewQuestions;

public class Trst2 {
	public static void main(String[] args) {
		int intValue= 100; 
		String strValue = "John";

			float floatValue =20.0F;
			
			if (intValue> 100 || strValue == "John" && floatValue < 20.011) {

			System.out.println("if");
			} else if (intValue>= 100 || strValue.endsWith("John") || floatValue <

			21.011) {
				System.out.println("elseif-1");
			}else if (intValue >= 100 || strValue.startsWith("John") || floatValue> 

			19.011) {

			System.out.println("elseif-2"); } else {

			System.out.println("else");
			}
	}
	}
	
	

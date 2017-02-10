
public class FindSubStringWithoutFunction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Example of find sub-string without using inbuilt function.
		StringBuilder sb = new StringBuilder();
		Character charval;
		String inputstring = "Java is better than C++";
		int len = inputstring.length();
		for(int i=4;i<len;i++)
		{
			if(i<=8)
			{
			charval = inputstring.charAt(i);
			sb.append(charval);
			}
			
		}
		System.out.println("The Sub String From Index 5 to 8 is :"+sb.toString());
		


	}
}

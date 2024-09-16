package practice;

public class SortString 
{

	public static void main(String[] args) 
	{
		String input = "123abcd!@#$";
		StringBuilder letter = new StringBuilder();
		StringBuilder digit = new StringBuilder();
		StringBuilder spchar = new StringBuilder();
		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			if(Character.isLetter(ch))
			{
				letter.append(ch);
			}
			else if(Character.isDigit(ch))
			{
				digit.append(ch);
			}
			else
			{
				spchar.append(ch);
			}
		}
		System.out.println("Letters are : " + letter);
		System.out.println("Digits are : " + digit);
		System.out.println("Special characters are : " + spchar );
	}

}

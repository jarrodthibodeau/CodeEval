import java.util.Scanner;


public class Disemvoweler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final char[] vowels = {'a', 'e', 'i', 'o', 'u'};	
		
		
		System.out.println("Please insert your sentence");
		Scanner input = new Scanner(System.in);
		
		String sentence = input.nextLine();
		
		char[] noVowels = new char[sentence.length()];
		char[] withVowels = new char[sentence.length()];
		int vowelCount = 0;
		int lineCount = 0;
		boolean isVowel;
		
		
		for(int i = 0; i < sentence.length(); i++)
		{
			isVowel = false;
						
			for(int j = 0; j < vowels.length; j++)
			{
				if(sentence.charAt(i) == vowels[j])
				{
					withVowels[vowelCount] = sentence.charAt(i);
					vowelCount++;
					isVowel = true;
				}
				
			
			}
			
			if(!isVowel && sentence.charAt(i) != ' ')
			{
				noVowels[lineCount] = sentence.charAt(i);
				lineCount++;
			}
			
		}
		
		System.out.println(noVowels);
		System.out.println(withVowels);
		
	}

}

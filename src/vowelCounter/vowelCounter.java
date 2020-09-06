package vowelCounter;

public class vowelCounter {
	public static void main(String[] args)
	{
		int vowelCount = 0;
		String word = "Revelation";
		String vowels = "aeiouAEIOU";
		
		for (int i = 0; i < word.length(); i++)
		{
			for (int x = 0; x < vowels.length(); x++)
			{
				if (word.charAt(i) == vowels.charAt(x))
				{
					vowelCount++;
				}
			}
		}
		System.out.println("There are " + vowelCount + " vowel(s) in the word " + word);
	}
}

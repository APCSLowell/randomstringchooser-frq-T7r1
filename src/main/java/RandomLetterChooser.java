public class RandomLetterChooser extends RandomStringChooser
{
	//private String[]jk;
	public RandomLetterChooser(String str)
	{ 
		super(getSingleLetters(str));

		
	}
	
	
	
}
 String[] getSingleLetters(String str)
	{ 
		String[] letterArray = new String[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			letterArray[i] = ""+str.charAt(i);
		}
		return letterArray;
	}

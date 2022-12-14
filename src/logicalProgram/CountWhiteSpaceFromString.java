package logicalProgram;

public class CountWhiteSpaceFromString {

	public static void main(String[] args) {
		
		String name="Ve l oc it y";
		int count=0;
		
		for(int i=0;i<=name.length()-1;i++)
		{
			char t=name.charAt(i);
			
			if(t==' ')
			{
				count++;
			}
		}
		System.out.println("Total no of blank space are "+count);
	}

}

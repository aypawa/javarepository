package stringStudy;

public class StringUse {

	private static final String Pu = null;

	public static void main(String[] args) {

		String s="Pune";
		String s1=new String("Pune");
		System.out.println("==============================");
		
		//use of length()method
		
	    String a="Velocity";
	    System.out.println(a.length());
		
	     int lengthOfString =a.length();
		System.out.println(lengthOfString);
		
		String a1="Velocity training corporate center";
		            
		int newLength =a1.length();
		System.out.println("length is "+newLength);
		
		System.out.println("=============================");
		
		String a2="Velocity";
		
		System.out.println(a2.toUpperCase());
		        
		String CapitalString= a2.toUpperCase();
		System.out.println("capital string is "+CapitalString);
		
		System.out.println(CapitalString.toLowerCase());
		
		System.out.println("=============================="); 
		
		String b="Pune";
		String b1="Pune";
		String c="";
		String c1="    ";
		String b2=new String("Pune");
		String b3=new String("Pune");
		String b4=new String("Pune1");
		String b5=new String("pune1");
		
		System.out.println(b==b1);
		System.out.println(b2==b1);
		System.out.println(b2==b3);
		System.out.println("====================");
		
		System.out.println(b.equals(b1));
		System.out.println(b.equals(b2));
		System.out.println(b2.equals(b3));
		System.out.println(b3.equals(b4));
		System.out.println(b4.equals(b5));
		System.out.println("===================");
		
		System.out.println(b4.equalsIgnoreCase(b5));
		
		
		System.out.println(b.contains("une"));
		
		 boolean result =b.contains("une");
		 
		 System.out.println(result);
		 System.out.println("=====================");
		 
		 System.out.println(b.charAt(3));
		 System.out.println(b1.charAt(3));
		 
		  char result1 =  b.charAt(3);
		  
		  System.out.println(result1);
		  System.out.println("=====================");
		  
		  System.out.println(b.isEmpty());
		  System.out.println(c.isEmpty());
		  System.out.println(c1.isEmpty());
		  
		  boolean result2 =c.isEmpty();
		  
		 System.out.println(result2);
		 System.out.println("=======================");
		 
		 System.out.println(b.isBlank());
		 System.out.println(c.isBlank());
		 System.out.println(c1.isBlank());
		 
		 boolean result3=c1.isBlank();
		 System.out.println(result3);
		 System.out.println("======================");
		 
		System.out.println(b.startsWith("Pu"));
		
		boolean result4=b.startsWith("Pu");
		System.out.println(result4);
		System.out.println("================");
		System.out.println(b.endsWith("ne"));
		
		boolean result5=b.endsWith("ne");
		System.out.println(result5); 
		System.out.println("=========================");
		
		String d="I love my parent";
		
		System.out.println(d.substring(10));
		System.out.println(d.substring(7));
		System.out.println(d.substring(7,9));
		System.out.println(d.substring(2,6));
		System.out.println(d.substring(0,16));
		
	     String result6=d.substring(0,16);
	     System.out.println(result6);
	     System.out.println("============================");
		
	     String i="Good ";
	     String j="night";
	     String k="Have a nice";
	     
	     System.out.println(i.concat(j).concat(" all"));
	     System.out.println(i.concat("Morning"));
	     System.out.println(k.concat("  day"));
	     System.out.println(i.concat(k).concat(" all"));
		 
	      String result7=k.concat(" day");
	      System.out.println(result7);
	      System.out.println("=========================");
	      
	      String r="Planning";
	      System.out.println(r.indexOf('a'));
	      System.out.println(r.indexOf('n'));
	      
	      System.out.println(r.indexOf('n',4));
	      System.out.println(r.lastIndexOf('n'));
	      System.out.println("=======================");
	      
	      String l="Good Bye";
	      
	      System.out.println(l.replace("Bye","Morning"));
	      System.out.println(l.replace("Bye", "night"));
	      System.out.println(l.replace("Bye", "afternoon"));
	      
	      String n="Me";
	      System.out.println(n.replace('e', 'y'));
	      System.out.println(n.replace("", ""));
	      System.out.println("=============================");
	      
	     
	}

}

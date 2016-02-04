import java.lang.reflect.Field;


public class StringReflection {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		//  Create test strings to mess with
		String s1 = "Max sucks";
		String s2 = s1;
		String s3 = s1.substring(4);
		
		//  Print out the original values before change
		System.out.println(s1+"\n" + s2 +"\n" + s3 + "\n");
		
		
		//  Get the value of the field inside the String class
		Field test = String.class.getDeclaredField("value");
		
		 
		//  Remove any 'private' properties, thereby making it accessible
		test.setAccessible(true);
		 
		
		//  Get the values of the first string
		char[] sVal = (char[]) test.get(s1);
		
		//  Change the values to something else
		sVal[4] = 'r';
		sVal[5] = 'o';
		sVal[6] = 'c';
		sVal[7] = 'k';
		
		//  The last string is not affected because a new String is made with the substring method
		System.out.println(s1+"\n" + s2 +"\n" + s3 + "\n");
	}

}

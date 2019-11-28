
public class Nothing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a a a";
		System.out.println(bytesToString(s.getBytes()));

	}
	  static String bytesToString(byte[] encrypted)
	    {
	        String test = "";
	        for (byte b : encrypted)
	        {
	            test += Byte.toString(b);
	        }
	        return test;
	    }

}

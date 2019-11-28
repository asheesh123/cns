import java.util.Scanner;

public class BlowFish {
	
	int [] stringTobitArray(String s)
	{
		char []arr=s.toCharArray();
		int []bit_array=new int[arr.length*8];
		for(int i=0;i<arr.length;i++)
		{
			int temp = (int)arr[i];int k=i+1;
			String t =Integer.toBinaryString(temp);
			
			while(t.length()<8)
			{
				t ="0"+t;
			}
			for(int j=0;j<8;j++)
			{
				bit_array[j*k]=Integer.parseInt(t.charAt(j)+"");
			}
				
		}
		return bit_array;
		
	}
	String encrypt(String p)
	{
		String c="";
		int bits[]=stringTobitArray(p);
		for(int i=0;i<64;i++)
			System.out.print(bits[i]);
		
		
		
		
		
		return c;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text:");
		String P=sc.next();
		BlowFish b = new BlowFish();
		System.out.println(b.encrypt(P));
		
		

	}

}

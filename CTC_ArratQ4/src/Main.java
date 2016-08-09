import java.util.Arrays;

public class Main {

	
	public static void main(String[] args) {
		
		/*String input1="ankur";
		String input2="nkura";
		boolean test=anagram2("abcs","cbas");
		System.out.println("Anagram is " +test);
		
		String fi=newStringWith("A N K U R");
		System.out.println(fi);
		boolean res=findAnagrams(input1,input2);
		System.out.println("Result   " + res);
		
		boolean a=IsUnique("abcde");
	System.out.println(a);
		*/
		String s1="waterbottLe";
		String s2="erbottLewat";
		System.out.println("Rotation of ankur is " +isRotate(s1,s2));
	char[] finalres=reverse("Be Patient");
	StringBuilder sb= new StringBuilder();
	for(char c:finalres)
	{
		sb.append(c);
	}
	System.out.println(sb);
	}
	
	
	public static boolean isRotate(String s1,String s2)
	{
		int len=s1.length();
		if(len==s2.length() && len>0)
		{
			
			String s1s2=s1+s1;
			return isSubstring(s1s2,s2);
		}
		return false;
		
	}
	
	public static boolean isSubstring(String smallStr, String largerStr) {
	    char[] larger = largerStr.toCharArray();
	    char[] smaller = smallStr.toCharArray();

	    int i = 0;

	    for (int j = 0; j < larger.length; j++) {
	        if(larger[j] == smaller[i]){
	            if(i == smaller.length -1){
	                //done we found that this string is substring
	                return true;
	            }
	            i++;
	            continue;
	        }else{
	            if(i > 0){
	                //that means we encountered a duplicate character before and if string was substring 
	                // it shouldn't have hit this condition..
	                if(larger.length - j >= smaller.length){
	                    i = 0;
	                    //reset i here because there are still more characters to check for substring..
	                }else{
	                    //we don't have enough characters to check for substring.. so done..
	                    return false;
	                }

	            }
	        }

	    }

	    return false;
	}
	/*public static boolean isSubstring(String s, String sub) {
	    return s.indexOf(sub) >= 0;
	}
	*/
	public static String newStringWith(String str)
	{
		int newlength=0;
		int lenght=str.length();
		char c[] =str.toCharArray();
		
		for(int i=0;i<lenght;i++)
		{
			if(c[i]==' ')
			{
				newlength++;
			}
		}
		int finallenght=lenght + 2*newlength;
		
		char[] c1= new char[finallenght];
		newlength=0;
		for(int j=0;j<lenght;j++)
		{
			if(c[j]!=' ')
			{
				c1[newlength]=c[j];
				newlength++;	
			}
			else
			{
				c1[newlength]='%';
               newlength++;
				c1[newlength]='2';
				newlength++;
				c1[newlength]='0';
				newlength++;
			}
		}
		return new String(c1);
		
	}
	public static boolean anagram2(String a, String b)
	{
		if(a.length()!=b.length())
			return false;
		boolean[] test = new boolean[256];
		
		char[] c= a.toCharArray();
		boolean t=false;
		for(char d:c)
		{
		 test[d]=true;
		}
		for(int i=0;i<b.length();i++)
		{
			int e=b.charAt(i);
			if(test[e])
			{
				t=true;
			}
			else
			{
			t=false;
			return false;
			}
			
		}
		return t;
	}
	
	public static boolean anagram(String a, String b)
	{
		if(a.length()!=b.length())
			return false;
		
		if(sort(a).equals(sort(b)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static String sort(String s)
	{
		char[] c=s.toCharArray();
		Arrays.sort(c);;
		return new String(c);
		
	}

	public static char[] reverse(String str)
	{
		char[] temp=str.toCharArray();
		int left=0; int right=0;
		right=str.length()-1;
		
		for(left=0;left<right;left++)
		{
			char temp1=temp[left];
			temp[left]=temp[right];
			temp[right]=temp1;
			right--;
			
		}
		return temp;
			
		
		
	}
	
	
	
	
	
	
	
	public static boolean IsUnique(String str)
	{
		if(str.length()>256)
			return false;
		
		boolean[] char_set= new boolean[256];
		for(int i=0;i<str.length();i++)
		{
			int val=str.charAt(i);
			
			if(char_set[val])
				return false;
			
			char_set[val]=true;
			
		}
		return true;
		
	}
	
	private static boolean findAnagrams(String input1, String input2) {
		 boolean status = true;
		char a[]=input1.toCharArray();
		char b[]=input2.toCharArray();
		//int k=1;
		/*boolean finalResult=false;
		for(int i=0 ;i<input1.length();i++)
		{
			for(int j=0 ;j<input2.length();j++)
			{
				if(a[i]==b[j])
					{
					finalResult=true;
					break;
					}
				else
				{
					finalResult=false;
				}
			}
		}
		
		return finalResult;*/
		
		Arrays.sort(a);
		Arrays.sort(b);
		status = Arrays.equals(a,b);
	return status;
	}
	}


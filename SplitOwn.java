import java.util.*;
import java.util.StringTokenizer;
class SplitOwn
{
static String []mySplit(String line, String delimiter)
		{
			ArrayList<String> L=new ArrayList<String>();
			StringTokenizer stringtokenizer=new StringTokenizer(line,delimiter);

			while(stringtokenizer.hasMoreTokens())
			{
				L.add(stringtokenizer.nextToken());
				//System.out.println(stringtokenizer.nextToken());
			}

			return L;
			
}
	
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);

			String string=new String();
			String delimiter=new String();
			string="this is me";
			delimiter="is";

			String[] words=mySplit(string,delimiter);

			for(String word:words)
				System.out.println(word);
}
}


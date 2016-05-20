import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;


public class FileReaderSorter {
	
	public static void main(String[] args) {
		FileReaderSorter b = new FileReaderSorter();
Map<String,Integer>	map=	b.getWordCount("C:/Myfile.txt");
		
	}

	private Map<String, Integer> getWordCount(String string) {
		
		try
		{
			FileInputStream fs =new FileInputStream(string);
			DataInputStream ds = new DataInputStream(fs);
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(ds));
			String line = null;
			while((line=br.readLine())!=null)
			{
				
				StringTokenizer st = new StringTokenizer(line, " ");
				
				while(st.hasMoreTokens())
				{
					
				}
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("file not found");
		}
		
		
		return null;
		
		
		
	}

}

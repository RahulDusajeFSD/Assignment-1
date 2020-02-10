import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class ReadWordsCharactersLines 
{   
    public static void main(String[] args) 
    {  
        int charCount = 0; 
        int wordCount = 0; 
        int lineCount = 0; 
        try
        {
             
            BufferedReader reader = new BufferedReader(new FileReader("Myfile.txt"));
            String currentLine = reader.readLine(); 
            while (currentLine != null)
            {
                  lineCount++;
                 
                String[] words = currentLine.split(" ");
                 
                wordCount = wordCount + words.length; 
                for (String word : words)
                {     
                    charCount = charCount + word.length();
                }
 
                currentLine = reader.readLine();
            }
             
            System.out.println("Character Count: "+charCount);
             
            System.out.println("Word Count : "+wordCount);
             
            System.out.println("Line Count: "+lineCount);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }   
}
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class TextFiles {
    private Formatter output;
    public Scanner input;

   public void createFile()  // enable user to open file
   {  try
      {  output = new Formatter( "texto.txt" );
      }  // end try
      catch( SecurityException securityException )
      {  System.err.println( "You do not have write access to this file." );
         System.exit( 1 );
      }  // end catch
      catch( FileNotFoundException filesNotFoundException )
      {  System.err.println( "Error creating file." );
         System.exit( 1 );
      } 
    }
    public void openFile(){  
        try
        {  input = new Scanner( new File( "texto.txt" ) );
        }  // end try
        catch ( FileNotFoundException fileNotFoundException )
        {  System.err.println( "Error opening file." );
            System.exit( 1 );
        }
    }  

    public String getLine(){ 
        openFile();
        return input.nextLine();
    }
    public void closeFile() // close file
    {  if ( output != null )
        output.close();
    } 
}

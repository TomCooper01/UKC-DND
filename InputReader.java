import java.util.Scanner;

public class InputReader
{
    private Scanner reader;

    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    public String[] getInput() 
    {
        System.out.print("> ");                
        String inputLine = reader.nextLine().trim().toLowerCase();

        String[] wordArray = inputLine.split(" ");  

        return wordArray;
    }
}
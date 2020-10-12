import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputClass {

  public static String readInput(String inputPhrase) {
    InputStreamReader inputStream =  new InputStreamReader(System.in);
    BufferedReader bufferedReader =  new BufferedReader(inputStream);
    System.out.println(inputPhrase);
    String eingabe;
    try {
      eingabe = bufferedReader.readLine();
      return eingabe;
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return null;
    }
  }
} 

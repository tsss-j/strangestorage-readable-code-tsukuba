import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadableCode {
	//task4
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String filename : args){
			try {
				FileInputStream inputStream = new FileInputStream(filename);
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
				String line = "";
				while((line = bufferedReader.readLine())!=null){
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		


	}

}

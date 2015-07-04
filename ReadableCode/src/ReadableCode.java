import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadableCode {
	//task5
	
	Boolean fileNameExists = false;
	Boolean targetNumExists = false;
	String filename = "";
	int targetNum = 0;
	int recipeID = 0;
	String line = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadableCode rc = new ReadableCode(args);
	}
	
	public ReadableCode(String[] args){
		init(args);
		
		try {
			FileInputStream inputStream = new FileInputStream(filename);
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			printUser();
			while((line = bufferedReader.readLine())!=null){
				recipeID++;
				printRecipe();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void init(String args[]){
		if(args.length==0){
			System.out.println("please input filename");
			return;
		}else{
			filename = args[0];
			fileNameExists = true;
			if(args.length==2){
				targetNum = Integer.parseInt(args[1]);
				targetNumExists = true;
			}
		}
	}
	
	public void printRecipe(){
		if(!targetNumExists){
			System.out.println(recipeID + ":"+ line);
		}
		else{
			if(recipeID==targetNum)System.out.println(recipeID + ":"+ line);
		}
	}
	public void printUser(){
		System.out.println("User: jun");
	}

}

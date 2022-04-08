//Imports
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class mainProjectCode {

	public static void main(String[] args) throws FileNotFoundException {
		
		//reading in .txt files (change filepath as needed!)
		try {
			File stops = new File("C:\\Users\\Arthur\\desktop\\stops.txt");
			File transfers = new File("C:\\Users\\Arthur\\desktop\\transfers.txt");
			File stopTimes = new File("C:\\Users\\Arthur\\desktop\\stop_times.txt");
			
			//turning files into ArrayLists
			ArrayList<String> stopsArrayList = fileToArrayList(stops);
			ArrayList<String> transfersArrayList = fileToArrayList(transfers);
			ArrayList<String> stopTimesArrayList = fileToArrayList(stopTimes);
			//------------------------------------------------------------------
			
			
			//convert Strings into String[] for data manipulation
			ArrayList<String[]>stopsData = new ArrayList<String[]>(); 
			ArrayList<String[]>transfersData = new ArrayList<String[]>(); 
			ArrayList<String[]>stopTimesData = new ArrayList<String[]>(); 
			for(int i = 0;i<stopsArrayList.size();i++) {
				stopsData.add(stopsArrayList.get(i).split(","));
			}
			for(int i = 0;i<transfersArrayList.size();i++) {
				transfersData.add(transfersArrayList.get(i).split(","));
			}
			for(int i = 0;i<stopTimesArrayList.size();i++) {
				stopTimesData.add(stopTimesArrayList.get(i).split(","));
			}
			//----------------------------------------------------------------------
			
			
			
			
		}
		catch(Exception e) {
			System.out.println("Error with path of files!");	
		}
	}
	
	//Method to turn File class into an ArrayList where each element is a line of the file
	public static ArrayList<String> fileToArrayList(File input){
		ArrayList<String> outputArray = new ArrayList<String>();
		
		try {
			Scanner fileScanner = new Scanner(input);
			while(fileScanner.hasNextLine()) {
				outputArray.add(fileScanner.nextLine());
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error turning files into array lists!");
		}
		return outputArray;
		
	}
	
	
}



//Method to read a .txt file into an ArrayList
	



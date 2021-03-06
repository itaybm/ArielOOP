package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import File.OpenFile;
import File.WriteFile;

public class FindAPLocation {

	private ArrayList<List<String>> Matrix, FinalMatrix;
	private OpenFile FileObject = new OpenFile();
	private MatrixScan MatrixScanObj = new MatrixScan();
	private WriteFile WriteFile_Obj = new WriteFile();

	public void Program(String userLocation, int numOfSamples){
		this.Matrix = FileObject.openFiles(userLocation); //Reading the CSV file and put in into a Matrix
		this.FinalMatrix = MatrixScanObj.Scan(this.Matrix, numOfSamples); //Generate the full and final matrix

		WriteFile_Obj.writeFiles(userLocation+" - Out.csv", FinalMatrix); //Write the final to disk
	}

}

package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import File.OpenFile;
import File.WriteFile;

public class Find_AP_Location {

	private ArrayList<List<String>> Matrix, FinalMatrix;
	private OpenFile OpenFile_Object = new OpenFile();
	Matrix_Scan_For_MAC Matrix_Scan_Obj = new Matrix_Scan_For_MAC();
	WriteFile WriteFile_Obj = new WriteFile();
	
	public void Program(String userLocation, int numOfSamples){
		this.Matrix = OpenFile_Object.openFiles(userLocation);
		this.FinalMatrix = Matrix_Scan_Obj.Matrix_Scan(this.Matrix, numOfSamples);
		WriteFile_Obj.writeFiles(userLocation+" - Out.csv", FinalMatrix);
	}

}

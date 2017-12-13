package Run;

import java.util.ArrayList;
import java.util.List;

import File.WriteFile;
import Folder.OpenFolder;
import Row.Merge_Rows;
import Row.Sort_Rows;

public class Run {
	String userLocation;
	String userDestination;
	ArrayList<List<String>> Matrix;

	OpenFolder Open_Folder_Object = new OpenFolder();
	Sort_Rows Sort_Rows_Object = new Sort_Rows();
	Merge_Rows Merge_Rows_Object = new Merge_Rows();
	WriteFile Write_File_Object = new WriteFile();
	
	public void Program(String userLocation, String userDestination){
		this.userLocation = userLocation;
		this.userDestination = userDestination;

		Matrix = Open_Folder_Object.openFolder(userLocation, userDestination);
		Sort_Rows_Object.sortBySignal(Matrix);
		Merge_Rows_Object.Merge(Matrix);
		Write_File_Object.writeFiles(userDestination+"mergeCSV.csv", Matrix);
	}


}

package Row;

import java.util.ArrayList;
import java.util.List;

public class Single_Row_After_Merge {
	String Time;
	String ID;
	String Lat;
	String Lon;
	String Alt;
	String SSID;
	String MAC;
	String Signal;
	String Channel;
	String Num_Of_WiFi;
	String Date;
	String LocalTime;
	String TimeStamp;
	int Row_Size;
	int Signal_As_Integer;
	int Num_Of_WiFi_As_Integer;
	List<String> Single_Row, Ans_Row;
	
	public Single_Row_After_Merge(List<String> Single_Row){
		this.Single_Row = Single_Row;
	}

	public List<String> Single_Row_As_List(List<String> Single_Row, String ID){
		ArrayList<String> Ans_Row = new ArrayList<>(); 
		Ans_Row.add(getTime());
		Ans_Row.add(ID);
		Ans_Row.add(getLat());
		Ans_Row.add(getLon());
		Ans_Row.add(getAlt());
		Ans_Row.add("1");
		Ans_Row.add(getSSID());
		Ans_Row.add(getMAC());
		Ans_Row.add(getChannel());
		Ans_Row.add(getSignal());

		return Ans_Row;
	}
	
	public int getRow_Size() {
		return this.Single_Row.size();
	}
	public String getDate() {
		return this.Single_Row.get(0).substring(0, 10);
	}
	public String getLocalTime() {
		return this.Single_Row.get(0).substring(11);
	}
	public String getTimeStamp() {
		return getDate()+"T"+getLocalTime()+"Z";
	}
	public String getTime() {
		return this.Single_Row.get(0);
	}
	public String getID() {
		return Single_Row.get(1);
	}
	public String getLat() {
		return this.Single_Row.get(2);
	}

	public String getLon() {
		return this.Single_Row.get(3);
	}
	public String getAlt() {
		return this.Single_Row.get(4);
	}	
	public String getNum_Of_WiFi() {
		return Single_Row.get(5);
	}
	public int getNum_Of_WiFi_As_Integer() {
		return Integer.parseInt(Single_Row.get(5));
	}

	public void setNum_Of_WiFi(String num_Of_WiFi) {
		Single_Row.set(5, num_Of_WiFi);
	}
	public String getSSID() {
		return this.Single_Row.get(6);
	}
	public String getMAC() {
		return this.Single_Row.get(7);
	}
	public String getChannel() {
		return this.Single_Row.get(8);
	}
	public String getSignal() {
		return this.Single_Row.get(9);
	}
	public int getIntegerSignal() {
		return Integer.parseInt(this.Single_Row.get(9));
	}
}

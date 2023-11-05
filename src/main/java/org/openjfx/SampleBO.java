package org.openjfx;

public class SampleBO {
	private String AName;
	private String ANum; 

	private SampleBO()
	{
		//
	}
	private SampleBO(String EntName , String EntNumber)
	{
		setAName(EntName);
		setANum (EntNumber);
	}
	

	//Ent means Entered
	public static SampleBO createNewBO (String EntName , String EntNumber ) 
	{
		SampleBO obj = new SampleBO(EntName , EntNumber );
		return obj;
	}
	public String getAName() {
		return AName;
	}
	public void setAName(String aName) {
		AName = aName;
	}
	
	public String getAnum() {
		return ANum;
	}
	public void setANum(String aNum) {
		ANum = aNum;
	}
}

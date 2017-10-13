public class ClimbInfo {

	String pName;
	int cTime;

	public ClimbInfo(String peakName, int climbTime) {
		pName = peakName;
		cTime = climbTime;
	}

	public String getName() {
		return pName;
	}

	public int getTime() {
		return cTime;
	}

}
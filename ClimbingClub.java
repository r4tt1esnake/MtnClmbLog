import java.util.List;
import java.util.ArrayList;

public class ClimbingClub {

	private List<ClimbInfo> climbList;

	public ClimbingClub() {
		climbList = new ArrayList<ClimbInfo>();
		climbList = this.climbList;
	}

	public void addClimb(String peakName, int climbTime) {
		ClimbInfo toBeAdded = new ClimbInfo(peakName, climbTime);
		climbList.add(toBeAdded);
	}

}
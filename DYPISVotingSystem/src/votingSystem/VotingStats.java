/**
 * 
 */
package votingSystem;

/**
 * @author User
 *
 */
public class VotingStats 
{
	private String candidate_ID;
	private String house;
	private int grade;
	private String position;
	private int voteCount;
	
	public VotingStats(String candidate_ID, String house, int grade,  String position, int voteCount) {
		this.candidate_ID = candidate_ID;
		this.house = house;
		this.grade = grade;
		this.position = position;
		this.voteCount = voteCount;
	}
	
	
	public String getCandidate_ID() {
		return candidate_ID;
	}
	public void setCandidate_ID(String candidate_ID) {
		this.candidate_ID = candidate_ID;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public int getGrade( ) {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}
	
	
	
	
}

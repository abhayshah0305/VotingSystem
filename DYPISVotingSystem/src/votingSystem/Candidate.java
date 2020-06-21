package votingSystem;
import java.util.Comparator;

public class Candidate 
{
	
	String candidate_ID;
	String FirstName;
	String LastName;
	String grade;
	String gender;
	String house;
	String position;
	String imgpath;
	int voteCount;
	
	
	Candidate ()
	{
		 candidate_ID = "";
		 FirstName = "";
		 LastName = "";
		 grade = "";
		 gender = "";
		 house = "";
		 position = "";
		 imgpath = "";
		 voteCount = 0;
		 
	}
	
	public Candidate(String candidate_ID, String firstName, String lastName, String grade, String gender, String house,
			String position, String imgpath, int voteCount) {
		super();
		this.candidate_ID = candidate_ID;
		FirstName = firstName;
		LastName = lastName;
		this.grade = grade;
		this.gender = gender;
		this.house = house;
		this.position = position;
		this.imgpath = imgpath;
		this.voteCount = voteCount;
	}
	
	public Candidate(String candidate_ID, String firstName, String lastName, String house,
			String position, int voteCount) {
		
		this.candidate_ID = candidate_ID;
		this. FirstName = firstName;
		this. LastName = lastName;
		this.grade = "";
		this.gender = "";
		this.house = house;
		this.position = position;
		this.imgpath = "";
		this.voteCount = voteCount;
	}

	public String getCandidate_ID() {
		return candidate_ID;
	}

	public void setCandidate_ID(String candidate_ID) {
		this.candidate_ID = candidate_ID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	public String getImgpath() {
		return imgpath;
	}
	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}
	public int getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}
	
	public static Comparator<Candidate> CandvoteCount = new Comparator<Candidate>() 
	{

		public int compare(Candidate a, Candidate a1) 
		{

		   int v1 = a.getVoteCount();
		   int v2 = a1.getVoteCount();

		   return v2-v1;
		   
		}
	
	};

}

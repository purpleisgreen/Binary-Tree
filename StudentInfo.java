
public class StudentInfo {
	public int studentNumber;
	public String firstName;
	public StudentInfo left;
	public StudentInfo right;
	
	public StudentInfo(int studentNumber) {
		this.studentNumber = studentNumber;
		left = null;
		right = null;
		firstName = null;
	}
}

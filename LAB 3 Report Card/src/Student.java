/**
 * Sets the first and last name for the student
 *
 */
public class Student 
{
	private String first_name;
	private String last_name;
	
	/**
	 * Default constructor for the student name
	 */
	Student () {
		 first_name = null;
		 last_name = null;
	 }
	 /**
	  * Argument constructor for student name
	  * @param f_name reference to first name
	  * @param l_name reference to last name
	  */
	Student(String f_name, String l_name) {
		 this.setLastName(l_name);
	     this.setFirstName(f_name);
	 }
	 /**
	  * Public method that accesses the last name
	  * @return the first name as a String
	  */
	public String getLastName() {
			return last_name;
	}
	/**
	 * Public method that sets the last name
	 * @param l_name refernce to last name
	 */
	public void setLastName(String l_name) {
			this.last_name = l_name;
	}
	/**
	 * Public method that accesses the first name
	 * @return the first name as a String
	 */
	public String getFirstName() {
			return first_name;
	}
	/**
	 * Public method that sets the first name
	 * @param f_name reference to first name
	 */
	public void setFirstName(String f_name) {
			this.first_name = f_name;
	}
}

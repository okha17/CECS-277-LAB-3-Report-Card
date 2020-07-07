
/**
 * Sets the grades for the students classes
 *
 */
public class Grades {
	private char grade0;
	private char grade1;
	private char grade2;
	private char grade3;
	private char grade4;
	/**
	 * Default constructor for grades
	 */
	Grades() {
		grade0 = '0';
		grade1 = '0';
		grade2 = '0';
		grade3 = '0'; 
		grade4 = '0';
	}
	/**
	 *  Argument constructor for grades
	 * @param grad0 reference to first grade
	 * @param grad1 reference to second grade
	 * @param grad2 reference to third grade
	 * @param grad3 reference to fourth grade
	 * @param grad4 reference to fifth grade
	 */
	Grades(char grad0, char grad1, char grad2, char grad3, char grad4) {
		this.setGrade(grad0, grad1, grad2, grad3, grad4);
	}
	/**
	 * Public method that accesses the first grade  
	 * @return the first grade as a char
	 */
	public char getGrade0() {
		return grade0;
	}
	/**
	 * Public method that accesses the second grade
	 * @return the second grade as a char
	 */
	public char getGrade1() {
		return grade1;
	}
	/**
	 * Public method that accesses the third grade
	 * @return the third grade as a char
	 */
	public char getGrade2() {
		return grade2;
	}
	/**
	 * Public method that accesses the fourth grade
	 * @return the fourth grade as a char
	 */
	public char getGrade3() {
		return grade3;
	}
	/**
	 * Public method that accesses the fifth grade
	 * @return the fifth grade as a char
	 */
	public char getGrade4() {
		return grade4;
	}
	/**
	 * Public method that sets value of grades
	 * @param grad0 reference to the 1st grade
	 * @param grad1 reference to the 2nd grade
	 * @param grad2 reference to the 3rd grade
	 * @param grad3 reference to the 4th grade
	 * @param grad4 reference to the 5th grade
	 */
	public void setGrade(char grad0, char grad1, char grad2, char grad3, char grad4) {
		this.grade0 = grad0;
		this.grade1 = grad1;
		this.grade2 = grad2;
		this.grade3 = grad3;
		this.grade4 = grad4;
	}
	/**
	 * Gets the double value of the letter grade
	 * @param grade passes in a grade reference 
	 * @return the double value of the grade
	 */
	public double getValue(char grade) {
		if (grade == 'A')
		{
			return 4.0;
		}
		else if (grade == 'B')
		{
			return 3.0;
		}
		else if (grade == 'C')
		{
			return 2.0;
		}
		else if (grade == 'D')
		{
			return 1.0;
		}
		else 
		{
			return 0.0;
		}
	}
	/**
	 * Computes the GPA of the student
	 * @param g0 student's grade for 1st class
	 * @param g1 student's grade for 2nd class
	 * @param g2 student's grade for 3rd class
	 * @param g3 student's grade for 4th class
	 * @param g4 student's grade for 5th class
	 * @return the average grade value of type double
	 */
	public double GPA (char g0, char g1, char g2, char g3, char g4) {
		double gpa;
		gpa = getValue(g0) + getValue(g1) + getValue(g2) + getValue(g3) + getValue(g4);
		return gpa = gpa/5.0;
	}
}

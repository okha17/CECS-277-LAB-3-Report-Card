/**
 * Sets the subjects for the student's report card
 *
 */
public class Subject {
	public String class0;
	public String class1;
	public String class2;
	public String class3;
	public String class4;
	/**
	 * Default constructor for classes
	 */
	Subject() {
		class0 = "NULL";
		class1 = "NULL";
		class2 = "NULL"; 
		class3 = "NULL";
		class4 = "NULL";
	}
	/**
	 * Argument constructor for classes
	 * @param c0 reference to first class
	 * @param c1 reference to second class
	 * @param c2 reference to third class
	 * @param c3 reference to fourth class
	 * @param c4 reference to fifth class
	 */
	Subject(String c0, String c1, String c2, String c3, String c4) {
		this.setClass(c0, c1, c2, c3, c4);
	}
	/**
	 * Public method that accesses the first class
	 * @return the first class as a String
	 */
	public String getClass0() {
		return class0;
	}
	/**
	 * Public method that accesses the second class
	 * @return the second class as a String
	 */
	public String getClass1() {
		return class1;
	}
	/**
	 * Public method that accesses the third class
	 * @return the third class as a String
	 */
	public String getClass2() {
		return class2;
	}
	/**
	 * Public method that accesses the fourth class
	 * @return the fourth class as a String
	 */
	public String getClass3() {
		return class3;
	}
	/**
	 * Public method that accesses the fifth class
	 * @return the fifth class as a String
	 */
	public String getClass4() {
		return class4;
	}
	/**
	 * Public method that sets the name of the classes
	 * @param c0 reference to the 1st class
	 * @param c1 reference to the 2nd class
	 * @param c2 reference to the 3rd class
	 * @param c3 reference to the 4th class
	 * @param c4 reference to the 5th class
	 */
	public void setClass(String c0, String c1, String c2, String c3, String c4) {
		this.class0 = c0;
		this.class1 = c1;
		this.class2 = c2;
		this.class3 = c3;
		this.class4 = c4;
	}
	
}


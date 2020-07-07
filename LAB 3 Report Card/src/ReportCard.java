/**
 * Formats entire student information for report card
 *
 */
public class ReportCard {
	private Student stu;
	private Grades grade;
	private Subject subject; 
	/**
	 * Default constructor for the report card
	 */
	ReportCard() {
		stu = new Student();
		grade = new Grades();
		subject = new Subject();
	}
	/**
	 * Argument constructor for the report card
	 * @param f_name
	 * @param l_name
	 * @param grad0
	 * @param grad1
	 * @param grad2
	 * @param grad3
	 * @param grad4
	 * @param c0
	 * @param c1
	 * @param c2
	 * @param c3
	 * @param c4
	 */
	ReportCard(String f_name, String l_name, char grad0, char grad1, char grad2, char grad3,
			   char grad4, String c0, String c1, String c2, String c3, String c4 ) 
	{
		stu = new Student(f_name, l_name);
		grade = new Grades(grad0, grad1, grad2, grad3, grad4);
		subject = new Subject(c0, c1, c2, c3, c4);
	}
	/**
	 * String formatting for the report card to be in columns
	 */
	public void disp() {
		System.out.println("STUDENT NAME: " + stu.getFirstName() + " " + stu.getLastName());
		System.out.println("GPA TOTAL: " + grade.GPA(grade.getGrade0(), grade.getGrade1(), grade.getGrade2(), grade.getGrade3(), grade.getGrade4()));
	    System.out.print("------------------------------------------------------------------------");
	    System.out.print("\n");
		System.out.print(String.format("%-15s %-15s %-7s\n", "CLASS NAME", "GPA VALUE", "FINAL GRADE"));
	    System.out.print("------------------------------------------------------------------------\n");
		System.out.print(String.format("%-15s %-15s %-7s\n", subject.getClass0(), grade.getValue(grade.getGrade0()), grade.getGrade0()));
		System.out.print(String.format("%-15s %-15s %-7s\n", subject.getClass1(), grade.getValue(grade.getGrade1()), grade.getGrade1()));
		System.out.print(String.format("%-15s %-15s %-7s\n", subject.getClass2(), grade.getValue(grade.getGrade2()), grade.getGrade2()));
		System.out.print(String.format("%-15s %-15s %-7s\n", subject.getClass3(), grade.getValue(grade.getGrade3()), grade.getGrade3()));
		System.out.print(String.format("%-15s %-15s %-7s\n", subject.getClass4(), grade.getValue(grade.getGrade4()), grade.getGrade4()));
		System.out.print("------------------------------------------------------------------------");
		System.out.println("\n");		 
	}

}

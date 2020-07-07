import java.util.*;

public class Tester 
{
	public static void main(String[] args) 
	{
		ReportCard [] rep = new ReportCard[3];
		rep[0] = new ReportCard("Charlie", "Day", 'A', 'B', 'B', 'C', 'A', "MATH", "ENGLISH", "HISTORY", "PHYSICS", "BIOLOGY");
		rep[1] = new ReportCard("Troy", "Barnes", 'A', 'B', 'A', 'D', 'B', "CALCULUS", "ENGLISH", "HISTORY", "CHEMISTRY", "C++");
		rep[2] = new ReportCard("Jesse", "Pinkman", 'C', 'F', 'B', 'A', 'B', "SPEECH", "MATH", "HISTORY", "CHEMISTRY", "PHYSICS");
		for(int i= 0; i < rep.length; i++) 
		{
			rep[i].disp();
		}
	}
}

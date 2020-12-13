import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCaseStudent {

	Student student;
	static int[] grades;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Start Test case");

		int noGrades = (int) 5E7;
		grades = new int[noGrades];
		for (int i = 0; i < noGrades; i++)
			grades[i] = noGrades - i;

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("End test case");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Start unit test");
		student = new Student();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Unit test finished");
	}

	@Test(expected = ExceptieStudent.class)
	public void testSetVarstaLimitaSuperioara() throws ExceptieStudent {
		int depasireLimitaSuperioara = Student.MAX_VARSTA + 1;
		student.setVarsta(depasireLimitaSuperioara);
	}

	@Test(expected = ExceptieMatematica.class)
	public void testGetNotaMinimaCardinalitateZero() throws ExceptieMatematica {
		int[] note = new int[] {};
		student.setNote(note);

		student.getNotaMinima();
	}

}
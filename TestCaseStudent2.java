import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCaseStudent2 {

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

	@Test
	public void testGetNotaMinimaCardinalitateUnu() throws ExceptieMatematica {
		int[] note = new int[] { 9 };
		student.setNote(note);

		int minimAsteptat = note[0];
		int minimCalculat = student.getNotaMinima();

		assertEquals(minimAsteptat, minimCalculat);
	}

	@Test
	public void testGetNotaMinimaPerformance() throws ExceptieMatematica {
		int nrNote = (int) 5E7;
		// 50000 = 5E4
		int[] note = new int[nrNote];
		for (int i = 0; i < nrNote; i++)
			note[i] = nrNote - i;
		student.setNote(note);

		long startTest = System.currentTimeMillis();
		student.getNotaMinima();
		long finalTest = System.currentTimeMillis();

		long diferenta = finalTest - startTest;

		if (diferenta < 50)
			assertTrue(true);
		else
			fail("Depasire limita performanta! " + diferenta);
	}

}

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


class GradeBookTest {
	private GradeBook grade;
	private GradeBook grade2;

	@BeforeEach
	public void setUp() throws Exception {
		GradeBook grade = new GradeBook(5);
		GradeBook grade2 = new GradeBook(5);
		
		grade.addScore(88.0);
		grade2.addScore(93.0);
		grade.addScore(72.0);
		grade2.addScore(80.0);
		grade.addScore(56.0);
		grade2.addScore(63.0);
	}

	@AfterEach
	public void tearDown() throws Exception {
		grade = null;
		grade2 = null;
	}

	@Test
	public void testAddScore() {
		assertTrue((grade.toString()).equals("88.0 72.0 56.0"));
		assertTrue((grade2.toString()).equals("93.0 80.0 63.0"));
		
		assertEquals(3, grade.getScoreSize(), .001);
		assertEquals(3, grade2.getScoreSize(), .001);
	}

	@Test
	public void testSum() {
		assertEquals(216.0, grade.sum(), .0001);
		assertEquals(236.0, grade2.sum(), .0001);
	}

	@Test
	public void testMinimum() {
		assertEquals(56.0, grade.minimum(), 0.001);
		assertEquals(63.0, grade2.minimum(), 0.001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(88.0, grade.finalScore(), 0.001);
		assertEquals(93.0, grade2.finalScore(), 0.001);
	}

	
	

}

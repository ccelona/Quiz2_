import static org.junit.Assert.*;

import org.junit.Test;

public class TuitionTest {
	
	@Test
	public void test0() {
		double initialCost = 12520;
		double CostPerYear = 25040;
		assertTrue((initialCost*2) == CostPerYear);
	}

	@Test
	public void test() {
		double APR = 6;
		double APRrate = 0.06;
		assertTrue((APR/100) == APRrate);
	}

	@Test
	public void test2() {
		double year2Percentage = 2;
		double CostPerYear = 25040;
		double year2 = 25540.8;
		assertTrue(((CostPerYear*(year2Percentage/100)) + CostPerYear) == year2);
	}
	
	@Test
	public void test3() {
		double year3Percentage = 2; 
		double year2 = 25541;
		double year3 = 26051.82;
		assertTrue(((year2*(year3Percentage/100))+year2) == year3);
	}
	
	@Test
	public void test4() {
		double year4Percentage = 2;
		double year3 = 13025;
		double year4 = 13285.5;
		assertTrue(((year3*(year4Percentage/100))+year3) == year4);
	}
	
	@Test
	public void test5() {
		double CostPerYear = 25040;
		double year2 =  25541;
		double year3 = 26052;
		double year4 = 26573;
		double P = 103206;
		assertTrue((CostPerYear+year2+year3+year4) == P);
	}
	
	@Test
	public void test6() {
		double APRrate = .06;
		double r = 0.005;
		assertTrue((APRrate/12) == r);
	}
	
	@Test
	public void test7() {
		double APRterm = 10;
		double n = 120;
		assertTrue((APRterm*12) == n);
	}
	
	@Test
	public void test8() {
		double P = 103205;
		double r = 0.005;
		double exp = 1.819396734032291;
		double EMI = 1145.787090288810392479;
		assertTrue((P*r*exp)/(exp-1) == EMI);
	}
	
	@Test
	public void test9() {
		double EMI = 1145.79;
		double n = 120;
		double TotalCost = 137494.8;
		assertTrue((EMI*n) == TotalCost);
		
	}
}


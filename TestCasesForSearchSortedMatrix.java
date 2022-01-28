
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
//White box testing
//code coverage of test cases via Jacoco = 100%
public class TestCasesForSearchSortedMatrix {
	SortedMatrixSearch sms; 
	@Before
	public void setUp() throws Exception {
		sms = new SortedMatrixSearch();
	}
	
	@Test
	public void SearchValueInMatrix() {
		int search = 6;
		int [][] matrix = {{1,2,3,4},
						   {5,6,7,8},
                           {9,10,11,12}};
		
		assertEquals(true,sms.search(search,matrix));
	}
	//testing extreme cases
	@Test
	public void SearchValueLowerThanFirstElementOfMatrix() {
		int search = 0;
		int [][] matrix = {{1,2,3,4},
						   {5,6,7,8},
                           {9,10,11,12}};
		
		assertEquals(false,sms.search(search,matrix));
	}
	@Test
	public void SearchValueGreaterThanLastElementOfMatrix() {
		int search = 13;
		int [][] matrix = {{1,2,3,4},
						   {5,6,7,8},
                           {9,10,11,12}};
		
		assertEquals(false,sms.search(search,matrix));
	}
	//testing left and right edges of the rows
	@Test
	public void SearchValueWithinRangeOfElementOfMatrix_butNotInMatrix() {
		int search = 9;
		int [][] matrix = {{1,2,3,4},
						   {5,6,7,8},
                           {10,11,12,13}};
		
		assertEquals(false,sms.search(search,matrix));
	}
	@Test
	public void SearchValueWithinRangeOfElementOfMatrix_butNotInMatrix2() {
		int search = 5;
		int [][] matrix = {{1,2,3,4},
						   {6,7,8,10},
                           {11,12,13,14}};
		
		assertEquals(false,sms.search(search,matrix));
	}
	@Test
	public void SearchValueWithinRangeOfElementOfMatrix_butNotInMatrix3() {
		int search = 9;
		int [][] matrix = {{1,2,3,4},
						   {5,6,7,8},
                           {11,12,13,14}};
		
		assertEquals(false,sms.search(search,matrix));
	}
	@Test
	public void SearchValueWithinRangeOfElementOfMatrix_butNotInMatrix4() {
		int search = 5;
		int [][] matrix = {{1,2,3,4},
						   {7,8,10,11},
                           {13,14,15,16}};
		
		assertEquals(false,sms.search(search,matrix));
	}

}

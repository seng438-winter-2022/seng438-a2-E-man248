package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

public class DataUtilitiesCalculatedRowTotal {

	// Initialize
	private Mockery mockingContext;
	private Values2D values;

	/* Setup Before Any Test Occurs
	 * 
	 */
	@Before
	public void setupTest() {
		mockingContext = new Mockery();
		values = mockingContext.mock(Values2D.class);
	}

	/* Test Case 1: Pass
	 * In test case 1, we tested for having Values2D values (table) being valid (not NULL) 
	 * as well as our row integer number above 0. 
	 * This should return a proper output, being the sum of the returned values.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void calculateRowTotal_NotNullTest() {
		values = mockingContext.mock(Values2D.class); // Valid Table
		
		// Mock
		mockingContext.checking(new Expectations() {
			{
				one(values).getColumnCount();
				will(returnValue(3)); // 3 columns in our row

				one(values).getValue(0, 0);
				will(returnValue(3)); // The value in that specific column

				one(values).getValue(0, 1);
				will(returnValue(4));

				one(values).getValue(0, 2);
				will(returnValue(3));
			}
		});

		double result = DataUtilities.calculateRowTotal(values, 3); // Valid Row Int
		assertEquals("Output should be 10", 10.0, result, .000000001d);
		// Output is 3 + 4 + 3 = 10
	}

	/* Test Case 2: Failure
	 * In test case 2, we tested for having Values2D values (table) being valid (not NULL) 
	 * as well as our row integer number BELOW 0. (invalid)
	 * 
	 * Since one our inputs are invalid, our output should be 0
	 * The test case fails because it outputs 1, from a non existent row number
	 */
	@Test(expected = IllegalArgumentException.class)
	public void calculateRowTotal_LessthanZeroTest() {
		mockingContext.checking(new Expectations() {
			{
				one(values).getColumnCount();
				will(returnValue(1));

				one(values).getValue(-1, 0);
				will(returnValue(1)); // Return value is 1 (From a non existent row)
			}
		});

		double result = DataUtilities.calculateRowTotal(values, -1); // -1 rows is an invalid row number
		assertEquals(0, result, .000000001d);
	}

	/* Test Case 3: Pass
	 * In test case 3, we tested for having Values2D values (table) being invalid (NULL) 
	 * as well as our row integer number above 0. (valid)
	 * 
	 * Since one our inputs are invalid, our output should be 0
	 */
	@Test(expected = IllegalArgumentException.class)
	public void calculateRowTotal_IsNullTest() {
		// instantiate null test
		values = null; // null tabl
		mockingContext.checking(new Expectations() {
			{
				one(values).getColumnCount();
				will(returnValue(3));

				one(values).getValue(0, 0);
				will(returnValue(3));

				one(values).getValue(0, 1);
				will(returnValue(4));

				one(values).getValue(0, 2);
				will(returnValue(3));
			}
		});

		double result = DataUtilities.calculateRowTotal(values, 3); // value is null
		assertEquals(0, result, .000000001d);
	}

	/* Test Case 3: Pass
	 * In test case 4, we tested for having Values2D values (table) being invalid (NULL) 
	 * as well as our row integer number below 0. (invalid)
	 * 
	 * Since one our inputs are invalid, our output should be 0
	 */
	@Test(expected = IllegalArgumentException.class)
	public void calculateRowTotal_IsNull_LessthanZeroTest() {
		// instantiate null to null test
		values = null;
		mockingContext.checking(new Expectations() {
			{
				one(values).getColumnCount();
				will(returnValue(1));

				one(values).getValue(-1, 0);
				will(returnValue(1));
			}
		});

		double result = DataUtilities.calculateRowTotal(values, -1); // values is null & row int is less than 0
		assertEquals(0, result, .000000001d);
	}

}
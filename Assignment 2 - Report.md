# Course Title: Software Testing, Reliability, and Quality
#### Course Code: SENG 438
#### Assignment #: 1

#### Group Number: 31
#### Submission Date: 28/01/2022

### Student Names:
#### Aashik Ilangovan (30085993)
#### Emmanuel Omari-Osei (30092729)
#### Gibran Akmal (30094918)
#### Priyanka Gautam (30091244)


## Introduction

Over the course of this lab, the main objective here is to get accustomed to the Eclipse software and Junit testing framework. Through this familiarization, we will be introduced to the fundamentals of automated unit testing by writing Junit test cases for five methods in both DataUtilities class and Range class. Moreover, we will be procuring knowledge it about mocking data objects, analyzing the black-box testing techniques and employing these techniques to write test suites.

Introduction

Over the course of this lab, the main objective here is to get
accustomed to the Eclipse software and Junit testing framework. Through
this familiarization, we will be introduced to the fundamentals of
automated unit testing by writing Junit test cases for five methods in
both DataUtilities class and Range class. Moreover, we will be procuring
knowledge it about mocking data objects, analyzing the black-box testing
techniques and employing these techniques to write test suites.

## Detailed description of unit test strategy
***Please refer to the diagram PDF (which could not have been converted into a .md file)***

### DataUtilities Class

#### Data Utilities Test Method: calculateRowTotal()

The collapse table shown contains the tests that were deemed "valid"
while the rest of the tests were deemed invalid. Some of these test
cases were deemed invalid as, for example, the Values2D data cannot both
be NULL and a valid table at the same time, as per the int row value
cannot both be above and below 0 at the same time. This resulted in
using only test cases 6,7,10, and 11 from the figure 1.0 where these
test cases have been renamed to 1,2,3,4 respectively in figure 2.0.

#### Data Utilities Test Method: createNumberArray()

The collapsed decision table shows the two test cases that were
conducted on CreateNumberArray method in DataUtilities class. Some of
the test cases that can be observed from Figure 1.2 do not make sense
because an array cannot be both empty and not empty. The input array can
only have one state (null or not null) at a time which is how we decided
to write the test suite for CreateNumberArray. We decided to employ the
Equivalence Class test technique by creating two test cases and varying
the input. In test case 1, the input array is empty and in test case 2
the input array is not empty.

#### Data Utilities Test Method - getCumulativePercentages(KeyedValues data)

The collapsed decision table in Figure 1.5 shows the tests conducted on
the method getCumulativePercentages(KeyedValues data) found in the
DataUtilities class. The tests featured in this collapsed table ignore
invalid tests from the full decision table in Figure 1.4. Tests 1
through 7 of Figure 1.4 were removed from the collapsed table because
when the parameter data takes on a value of null, all the other
conditions in the table cannot be applied. Tests 9 through 11 take place
when the data != null, but require the data to have no key-value items
in it, making the last two conditions invalid.

#### Data Utilities Test Method: createNumberArray2D(double\[\]\[\] data)

The collapsed version of the table shows the tests conducted on the
method createNumberArray2D(double\[\]\[\] data) found in the
DataUtilities class. The tests in the collapsed table ignore invalid
tests from the full decision table. Tests 1 through 7 of the full table
were not included in the collapsed table because when the data parameter
is null, then no other conditions can be true. Tests 9, 10, 11, and 13
take place when the data != null, but have conflicts between other
conditions that cannot exist at the same time. For example, in test 11
of the full table, the 2d data array cannot be empty and fully populated
at the same time.

#### Data Utilities Test Method: calculateColumnTotal(Values2D values, int column)

The collapsed decision table in Figure 1.9 shows the tests conducted on
the method calculateColumnTotal(Values2D values, int column) found in
the DataUtilities class. The tests featured in this collapsed table
ignore invalid tests from the full decision table in Figure 1.8. Tests 1
through 3 of Figure 1.8 were removed from the collapsed table because
when the parameter values takes on a value of null, all the other
conditions in the table cannot be applied. Tests 6 was removed because,
when the column parameter is less than zero, the column automatically
cannot exist as it is out of the index bounds.

### Range Class

#### Range Test Method: getLowerBound()

The collapsed decision table shows the three test cases that were
conducted on GetLowerBoundRange method in Range class. Some of the test
cases that can be observed from Figure 2.0 do not make sense because the
values for the Lower Bound cannot both be positive and negative at the
same time. Likewise, the values for the Upper Bound cannot both be
positive and negative at the same time. Furthermore, there was another
constraint on these bounds, it was that the lower bound must be smaller
than the upper bound. This meant that in some of the test cases where
the upper bound was negative and lower bound was negative, it would not
work. Given these constraints, we decided to employ the Equivalence
Class test technique by creating three test cases and varying the input.
In test case 1, both upper and lower bounds are positive, and in the
second test case, lower bound is negative and upper bound is positive.
Lastly, in test case 3, both bounds are negative.

#### Range Test Method: constrain(double value)

The collapsed version of the table displays the valid test conducted on
the method constrain(double value) found in the Range class. This is
because, for example, a value cannot be within and out of range at the
same time and so these test cases were eliminated and only the remaining
tests from figure 2.2 being test case 2 and test case 3 were used in the
figure 2.3. These test cases have now been renamed test case 1 and 2 and
will be referenced as such. Prior to any tests, we have set our range in
our setup that occurs before every test to be between -5.0 and 5.0.

#### Range Test Method: contains(double value)

The collapsed version of the table shows the tests conducted on the
method contain(double value) found in the Range class. Based on the
documentation the contains(double value) method returns 'true' if the
specified value is within the range and returns 'false' otherwise. The
tests in the collapsed table ignore invalid tests from the full decision
table. Tests 1 and 4 of the full table were obviously not included in
the collapsed table because the input value cannot be within range and
out of range at the same time. In my test, I will be using a Range
object privately initialized to have a range of 13.0 - 31.0. That is the
range that will be used for my test cases.

#### Range Test Method: intersects(double lower, double upper)

The collapsed decision table in Figure 2.7 shows the tests conducted on
the method intersects(double lower, double upper) found in the Ranged
class. The tests featured in this collapsed table ignore invalid tests
from the full decision table in Figure 2.6. Tests 1 and 5 of Figure 2.6
were removed from the collapsed table because when the parameter of
upper bound is less than lower bound, it cannot simultaneously be equal
to lower bound, deeming these tests invalid. In test case 1, data
intersects the given bounds, the upper limit is less than the lower
limit, and the upper limit is not equal to the lower limit. The expected
output is false since there is a documented condition that asks for the
upper bound to be greater than the lower bound, which is violated in
this test. During the test, the result returned false, which deemed the
test passed.

#### Range Test Method: getUpperBoundRange()

The collapsed decision table shows the three test cases that were
conducted on GetUpperBoundRange method in Range class. Some of the test
cases that can be observed from Figure 2.8 do not make sense because the
values for the Lower Bound cannot both be positive and negative at the
same time. Likewise, the values for the Upper Bound cannot both be
positive and negative at the same time. Furthermore, there was another
constraint on these bounds, it was that the lower bound must be smaller
than the upper bound. This meant that in some of the test cases where
the upper bound was negative and lower bound was negative, it would not
work. Given these constraints, we decided to employ the Equivalence
Class test technique by creating three test cases and varying the input.
In test case 1, both upper and lower bounds are positive, and in the
second test case, lower bound is negative and upper bound is positive.
Lastly, in test case 3, both bounds are negative.

## Test Cases Developed

### DataUtilities Class

#### Data Utilities Test Method: calculateRowTotal()

In test case 1, we tested for having Values2D data being valid (not
NULL) as well as our row integer number above 0. This should return a
proper output, being the sum of the returned values.

In test case 2, we tested for having Values2D data being valid (not
NULL) however we inputted an integer value for a row that is less than
or equal to zero. Since one of our inputs is invalid, our result instead
of outputting the returned sum (which is no longer possible) it should
return a total value of zero instead.

In test case 3, this time we tested Values2D data being invalid, a NULL,
but we still input a valid integer value for a row that is above zero.
Since one of our inputs is invalid, our result instead of outputting the
returned sum (which is no longer possible) it should return a total
value of zero instead.

In test case 4, this time we tested both Values2D data and int row being
invalid being that Values2D has a null input and int row has an input
that is less than or equal to zero. Since both of our inputs are
invalid, our result will output a return of total value of zero.

#### Data Utilities Test Method: createNumberArray()

In test case 1, since the input array is NULL, the theoretical expected
output is "Invalid Parameter Exception", however, in reality, the output
was "Illegal Argument Exception." This is likely due to a bug in the
code which is throwing an incorrect exception.

In test case 2, since the input array is NOT NULL, the theoretical
expected output matches the reality output. In the test, we use
assertEquals to see if the result was a Number \[\] or not. Then we
proceed to check the elements at index 0, and index 1 to make sure they
were equal to the input array. This test passed successfully.

#### Data Utilities Test Method - getCumulativePercentages(KeyedValues data)

In test case 1, since the input data is null, it is expected that the
InvalidParameterException is thrown as mentioned in the documentation.
In the test, this was not the case as the IllegalArgumentException was
thrown instead. This might be deemed acceptable, however it was not
documented to behave this way. This test failed.

In test case 2, since the input data is empty, meaning it has no
key-value items, it is expected that the InvalidParameterException is
thrown as mentioned in the documentation. In the test, this exception
was appropriately thrown and the program behaved as expected. This test
passed.

In test case 3, there is only a single data key-value item and its value
is set to zero. The expected output is zero since that is the calculated
cumulative percentage. In the test, the result was a value of NaN is
caught by the assertEquals test deeming the test failed.

In test case 4, there are multiple key-value items and all have their
values set to zero. For this, there will be 2 items. The expected output
is 1.0 for both keys since that is the calculated cumulative percentage.
In the test, the result was a value of NaN that was caught by the
assertEquals test, deeming the test failed.

In test case 5, there is only a single data key-value item and its value
cannot be zero. For this the value will be set to 5. The expected output
is 1.0 since that is the calculated cumulative percentage. In the test,
the result was a value of Infinity is caught by the assertEquals test,
deeming the test failed.

In test case 6, there are multiple key-value items and all their values
cannot be zero. For this, there will be 2 items and their values will be
5 and 9 respectively to the order of their keys. The expected output is
0.3571429 for key 0 and 1.0 for key 1 since these are the calculated
cumulative percentages. In the test, the result was a value of
0.5555555555555556 is caught by the assertEquals test for key 0, deeming
the test failed.

#### Data Utilities Test Method: createNumberArray2D(double\[\]\[\] data)

In test case 1, since the input data is null, it is expected that the
InvalidParameterException is thrown as mentioned in the documentation
for the DataUtilities class. In the test, this was not the case as the
IllegalArgumentException was thrown instead. In a sense this exception
is similar to the one that was documented to be thrown; however was not
exactly the same exception specified by the documentation. Therefore
this test case has failed.

In test case 2, since the input data 2d array is empty (all values are
default assigned to 0.0), it is expected that the function successfully
constructs the corresponding Number\[\]\[\] array full of 0's as well..
However, certain assertion checks were failing in that some of the
elements of the Number\[\]\[\] array were 'null' instead of 0.
Specifically, every other (going through in order) element in the
Number\[\]\[\] 2d array was 'null' instead of the actual value it should
have. This resulted in an IllegalArgumentException due to the null
values. Therefore this test case failed.

In test case 3, data is a populated 2d array, but with only one row,
essentially making it just a 1d array. Based on the documentation, the
function should construct an array of Number objects from the
corresponding structure passed in. The lengths of both the Number and
the double arrays should be the same as well as the values in each
element should match. However, in asserting whether each element
matches, the test failed the final assertion of checking the last
element which was a null in the Number structure but should have been
3.14 like the data 2d array passed in. Therefore this test has failed.

In test case 4, the data 2d array passed in, is fully populated. Based
on documentation, the resulting array of Number objects should also
reflect these same values and size. However, there was an assertion
failure where data\[0\]\[1\] != result\[0\]\[1\] due to the fact that
result\[0\]\[1\] is holding a 'null' value instead of the actual value
that should be stored there. This pattern continues for every other
element in the Number\[\]\[\] 2d array. Therefore this test has failed.

In test case 5, the 2d data array passed in, is not full and not empty
and not null. It is a partially filled 2d array of doubles. Based on the
documentation, the resulting Number\[\]\[\] structure should be the same
size and have all the corresponding elements and values that the
original data\[\]\[\] array had that was passed in. However, the pattern
of every alternate element in the Number\[\]\[\] array being 'null'
continues in this test case as well. Therefore this test case has also
failed.

#### Data Utilities Test Method: calculateColumnTotal(Values2D values, int column)

In test case 1, since the input values is null, it is expected that the
InvalidParameterException is thrown as mentioned in the documentation.
In the test, this was not the case as no exception was thrown at all.
This test failed.

In test case 2, the Values2D object pointer, values, is not null, the
column index is less than zero, and an invalid column index is chosen.
It is expected that the InvalidParameterException will be thrown since
the column index is invalid. In the test, the result had no exception
was thrown at all. This test failed.

In test case 3, the Values2D object pointer, values, is not null, the
column index is not less than zero, and an invalid column index is
chosen. It is expected that the InvalidParameterException will be thrown
since the column index is invalid. In the test, the result had no
exception was thrown at all. This test failed.

In test case 4, the Values2D object pointer, values, is not null, the
column index is not less than zero, and a valid column index is chosen.
The values object is prepared to return a row count of 2, a value of 5
at index (0, 0), a value of 7 at index (1,0). This should be expected to
result in a column total of 12.0, adding together the values 5 and 7. In
the test, the result was a value of 12.0, and thus, this test passed.

### Range Class

#### Range Test Method: getLowerBound()

In test case 1, since the input Range is (1.0, 5.0), the theoretical
expected output is 1.0 for the lower bound. In reality, the result
returned by getLowerBound() on range (1.0, 5.0) was 1.0 deeming the test
to successfully pass.

In test case 2, since the input Range is (-6.0, 3.0), the theoretical
expected output is -6.0 for the lower bound. In reality, the result
returned by getLowerBound() on range (-6.0,3.0) was -6.0 deeming the
test to successfully pass.

In test case 3, since the input Range is (-6.0, -3.0), the theoretical
expected output is -6.0 for the lower bound. Here the goal was to
determine that if both bounds are negative, does the method return the
lower negative number. In reality, the result returned by
getLowerBound() on range (-6.0, -3.0) was -6.0 deeming the test to
successfully pass.

#### Range Test Method: constrain(double value)

In test case 1, the input value given to the constraints() method is the
value: -3.0. This value is within the range that was specified, however
it has failed the test as it outputted a value of -3.0 instead of the
expected closest range value of -5.0 so the test has failed. This means
the method has a bug in it.

In test case 2, the input value given to the constraints() method is the
value:55.0. This value is not within the range that was specified, and
outputs a value of 5.0 instead of 55.0 (the input value) so the test has
failed. This means the method has a bug in it.

#### Range Test Method: contains(double value)

In test case 1 - the input value given to the contains() method is the
value: 13.31. This value is within the range that I had specified and as
expected, the assertion yields correct as the boolean value expected to
be output was: true therefore test case has passed.

In test case 2 - the input value given to the contains() method is the
value: 13.31. This value is not within the range that I had specified
and as expected, the assertion yields correct as the boolean value
expected to be output was: false therefore test case has passed.

#### Range Test Method: intersects(double lower, double upper)

In test case 2, data intersects the given bounds, the upper limit is not
less than the lower limit, and the upper limit is equal to the lower
limit. The expected output is true since the orientation of the
parameters is valid and the Range data intersects the bounds. During the
test, the result returned true, which deemed the test passed.

In test case 3, data intersects the given bounds, the upper limit is not
less than the lower limit, and the upper limit is not equal to the lower
limit. The expected output is true since the orientation of the
parameters is valid and the Range data intersects the bounds. During the
test, the result returned true, which deemed the test passed.

In test case 4, data does not intersect the given bounds, the upper
limit is less than the lower limit, and the upper limit is not equal to
the lower limit. The expected output is false since the Range data does
not intersect the bounds. During the test, the result returned true,
which deemed the test failed.

In test case 5, data does not intersect the given bounds, the upper
limit not is less than the lower limit, and the upper limit is equal to
the lower limit. The expected output is false since the Range data does
not intersect the bounds. During the test, the result returned true,
which deemed the test failed.

In test case 6, data does not intersect the given bounds, the upper
limit not is less than the lower limit, and the upper limit is not equal
to the lower limit. The expected output is false since the Range data
does not intersect the bounds. During the test, the result returned
true, which deemed the test failed.

#### Range Test Method: getUpperBoundRange()

In test case 1, since the input Range is (1.0,5.0), the theoretical
expected output is 5.0 for the upper bound. In reality, the result
returned by getUpperBound() on range (1.0, 5.0) was 5.0 deeming the test
to successfully pass.

In test case 2, since the input Range is (-6.0,3.0), the theoretical
expected output is 3.0 for the upper bound. In reality, the result
returned by getUpperBound() on range (-6.0,3.0) was -6.0 deeming the
test to successfully pass.

In test case 3, since the input Range is (-6.0,-3.0), the theoretical
expected output is -3.0 for the upper bound. Here the goal was to
determine that if both bounds are negative, does the method return the
higher (larger) negative number. In reality, the result returned by
getUpperBound() on range (-6.0, -3.0) was -3.0 deeming the test to
successfully pass.

## Discussion

### What are the benefits and drawbacks of Mocking?

Mocking is excellent for isolated tests because it removes any external
behavior that might influence SUT and discourages any error propagation
from different classes being used in the SUT. It truly isolates the
behavior of the function by making sure that only the functions called
within the @Test method are called. By isolating the behavior of the
tests using mocking, it removes any other external hidden sources of
error. For instance, in the mocking tests for calculateColumnTotal(), an
object of Values2D was mocked. This was especially helpful because we
were trying to test the functionality of the calculateColumnTotal() and
see if it was working as stated in the documentation. By mocking
Values2D, we were ensuring that if any of the tests failed, it was due
to the code written for calculateColumnTotal() and not an error from
Values2D. If we were not using mocking, then isolating the source of the
failure would become even tougher because we would not be able to
pinpoint the error to a specific method in a specific class. Without
mocking it would be hard to differentiate if the error was coming from
the class Values2D, or DataUtilities. Mocking allows for faster testing
especially in the event if interactions with the DB were required, by
mocking these interactions, we can focus on the actual functionality of
the code and making sure the functions are performing appropriately.
This helps us test methods even if there is something wrong with the
database or if it is offline. Furthermore, by employing Mocking, we are
able to write the higher-level code as we can mock the lower-level
methods that have not yet been developed.

While mocking testing can be highly beneficial to use in most
situations, it can also have its drawbacks. For instance, mocking
testing is highly dependent on the way the SUT performs. If a mock test
does not act specifically according to the way the method or class being
tested functions, tests can result in an inaccurate test, and often, an
error in the testing code. This was exemplified in our lab with the Data
Utilities class methods being tested. Since we were not provided any
direct code for the functionality of the methods, we could only assume
the functionality based on the documentation of the methods. This often
resulted in our code producing errors simply because we were not
providing the SUT the return values it asked for in the order it asked
for them. If we were testing without mocking, this issue could have been
avoided since the SUT would be working with a full version of the
dependent class and not a mock.

Another issue that stems from mocking is with methods that do not take
in any parameters, meaning that the variables used for the test come
from within the class itself. This would theoretically mean that the
mock would need to provide functionality within the same object that is
being tested. This would then mean that the mock object would also be
the SUT object. The logical fallacy present in such an operation is
precisely why this method of testing does not work in this case. A prime
example of this was present in our lab for the Range class. We were
given 15 methods from this class and asked to choose 5 test. However,
our decision had to narrow from those 15 methods because many of them
would not work with the mock testing framework without using an
alternative testing method. While the mock test has its benefits, it
cannot be used for every testing situation.

### How Teamwork and Efforts were Divided and Managed

Teamwork is a fundamental core part of software testing. In order to go
through the test we read and did the preliminary parts of the test as a
group (the setups in part 1) and proceeded to go through one testing
process in DataUtilities together as well. This was to ensure that
everyone was up to par in the standard, format and overall understanding
of JUnit & Jmock Testing. From there, we would proceed to have multiple
group sessions where we worked individually on our own tests but
configured with each other whenever needed.

A lesson learned throughout the entire process was that having more than
one pair of eyes on an issue can provide faster and better solutions.
For example, as we were first running through a test as a group, all of
us had input our knowledge and ideas on how to set up the tests and do
the test from previous courses. It provided an efficient process into
creating a test for the example method as well as filled any knowledge
gaps that we had going into the lab, allowing us to work on our own
split individual tests as well. Each person was responsible for writing
test cases for at least two methods and documenting their strategy.

Teamwork is incredibly important in software development as "teamwork
makes the dream work." Learning how to work in a team is imperative for
engineers across all disciplines because it introduces them to varying
new perspectives that only strengthen the final product. One of the key
lessons that we learned about teamwork is that open communication,
transparency and hard work are the foundations of any successful group.

### Difficulties, Challenges, and Lessons from the Lab

Over the course of this lab, there were some challenges that we had to
face together as a team.

Upon starting this lab, all team members had to install and run eclipse
which contained Junit and Jmock. However, due to operating system
differences, and various bugs due to corrupted files, we were facing
many difficulties in getting all group members up and running. But this
was a good team building exercise as we each got together and helped
everyone resolve issues with their IDE's on their systems and eventually
the whole team was ready to go. Furthermore, for the first few test
cases, we went through them together as a group so everyone could learn
the process and ask questions as they please. After all group members
were fairly well versed in using the testing software, we each split off
with a specific number of assigned test cases for each group member to
complete individually as well as the corresponding decision tables and
descriptions. This helped us be more efficient in working through them
and whenever a group member faced difficulties or if their chosen test
method was a little ambiguous, we would all come help and use the
documentation to its fullest degree to try and clear things up. Finally,
during the last stages of test case implementations, we checked and
reviewed each other's test code for bugs and documented everything using
an agreed on format. Overall a very educational lab and challenging
enough to improve our teamwork and technical skills in general.

## Comments and Feedback

Overall, the lab detailed a simple yet insightful experience in J-Unit
testing. The experience induced a healthy working environment that
explored not only our previous knowledge of the course material but more
importantly our ability to cooperate in group settings. We discovered in
our first run-through of using JUnit and JMock testing the application
produced minor difficulties across various operating systems which was
important to understand and resolve, as all team members took on a set
of test cases to complete. However, going through the lab we were able
to quickly overcome such difficulties, turning it into a smooth and
informative session. An improvement that could be implemented in the lab
document itself would be the adding of missing figures (e.g. figure 5)
and we found the previous document uploaded to D2L to be easier to
follow. The current figure has some ambiguity. An improvement here would
be that there should be more clearly labeled figures, which can aid
students in understanding whatever step of the setup process looks like
for a Junit or Jmock test. All in all, we found this lab easy to follow
and an excellent introduction to Junit and Jmock testing.

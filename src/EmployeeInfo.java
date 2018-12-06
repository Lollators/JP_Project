import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class EmployeeInfo allows the user to input their full name and then create a user
 * id of their first initial and surname.
 * This is because the program is required to create an audit trail on its tests of
 * the production line so that it records which employee ran the test.
 *
 * @author  Luca Missaglia
 * @since   2018-12-03
 */
public class EmployeeInfo {

  /**
   * First and last name of employee.
   */
  private StringBuilder name;

  /**
   * Employee code made out of first letter of first name + last name.
   */
  private String code;

  /**
   * Department ID. Must be composed of 4 characters and 2 numbers. The first character has
   * to be uppercase, while the other 3 lowercase. No spaces allowed.
   */
  private String deptId;

  /**
   * Object Scanner to read from keyboard.
   */
  private Scanner in;

  /**
   * Regex pattern variable. Can't use p as variable name otherwise checkStyle will flag it
   */
  private Pattern myPattern;

  /**
   * Constructor of the class. Sets regex pattern to match deptId constrains.
   * Calls methods setName() and setDeptId() to set name of employee and their department ID.
   */
  public EmployeeInfo() {

    //set Scanner object to obtain keyboard input
    in = new Scanner(System.in);

    //set regex pattern to deptId constrains (read above)
    myPattern = Pattern.compile("^[A-Z]{1}[a-z]{3}[0-9]{2}$");

    setName();
    setDeptId();

    //close scanner object when constructor ends.
    in.close();
  }

  /**
   * Function getName returns the first and last name of an employee.
   *
   * @return name - first and last name of employee
   */
  public StringBuilder getName() {
    return name;
  }

  /**
   * Function getCode returns employee code (first letter of first name + last name).
   *
   * @return code - Employee code
   */
  public String getCode() {
    return code;
  }

  /**
   * Function setName calls inputName to get first and last name of employee.
   * Creates a stringBuilder variable used to call function checkName, which checks if
   * input is ok. It is also used by the function createEmployeeCode().
   * If ok sets name to the input, and calls function createEmployeeCode() passing in as a
   * parameter the stringBuilder variable
   */
  private void setName() {
    //get first and last name from user
    String inputName = inputName();

    //create stringBuilder variable containing the inputName
    StringBuilder buildName = new StringBuilder(inputName);

    //call checkName to see if input is ok
    if (checkName(buildName)) {

      //if ok set name to the input
      name = buildName;

      //and call createEmployeeCode function
      createEmployeeCode(buildName);

      //if input is not ok
    } else {

      //set name to guest
      name = new StringBuilder("guest");

      //set employee code to guest
      code = "guest";
    }

  }

  /**
   * Function createEmployeeCode takes as a parameter the first and last name of an employee.
   * Takes the first letter of the first name + last name to create code.
   *
   * @param name - first and last name of employee
   */
  private void createEmployeeCode(StringBuilder name) {
    String firstName;
    String lastName;

    //get first letter of first name
    firstName = name.substring(0,1);

    //get last name by utilizing the space as a starting point
    lastName = name.substring(name.indexOf(" ") + 1, name.length());

    //connects first letter of first name to last name to create code
    code = firstName + lastName;
  }

  /**
   * Function inputName asks user to enter their first and last name.
   *
   * @return name - first and last name of employee
   */
  private String inputName() {
    System.out.print("Please enter your first and last name: ");

    //return the user input
    return in.nextLine();
  }

  /**
   * Function checkName checks if user input contains a space.
   * If so, returns true.
   * If not, returns false.
   *
   * @param name - employee's first and last name
   * @return flag - true if ok, false if not
   */
  private boolean checkName(StringBuilder name) {
    boolean flag = false;

    //if the user input contains a space, then set variable to true
    if (name.toString().contains(" ")) {
      flag = true;
    }

    //return true or false
    return flag;
  }

  /**
   * Function getDeptId asks employee to enter their department ID and then returns user input.
   *
   * @return deptId - department ID of employee
   */
  public String getDeptId() {
    System.out.print("Please enter the department ID: ");

    //returns user input
    return in.nextLine();
  }

  /**
   * Function setDeptId calls getDeptId() function to get deptId of an employee.
   * Then calls function validId() to ensure that the deptID is valid.
   * If it is, then calls reverseString() function to reverse the ID before assigning it to
   * variable deptId.
   * If not, sets deptId to None01.
   */
  private void setDeptId() {
    //get deptId from user input
    String thisDeptId = getDeptId();

    //checks if it's valid
    if (validId(thisDeptId)) {

      //if yes, reverse it and then assign it to variable
      deptId = reverseString(thisDeptId);
    } else {

      //if not sets variable to generic value
      deptId = "None01";
    }
  }

  /**
   * Function getId return the department ID of an employee.
   *
   * @return deptId - department ID of an employee
   */
  private String getId() {
    return deptId;
  }

  /**
   * Function validId utilizes regex pattern to verify that the department ID inserted by the user
   * matches its constraints. The deptId variable must be composed of 4 characters and 2 numbers.
   * The first character has to be uppercase, while the other 3 lowercase. No spaces allowed.
   *
   * @param id - department ID of an employee
   * @return flag - true if ok, false if not
   */
  private boolean validId(String id) {
    boolean flag = false;

    //creates matcher and checks for regex pattern in deptId
    Matcher m = myPattern.matcher(id.toString());

    //if a match is found, then it's good
    if (m.find()) {
      flag = true;
    }

    return flag;
  }

  /**
   * Function toString returns a string variable containing a formatted employee code and deptId.
   *
   * @return message - Employee code and department number
   */
  public String toString() {
    String message = "";

    message += "Employee Code : " + code + "\n";
    message += "Department Number : " + deptId;

    return message;

  }

  /**
   * Recursive function reverseString reverses deptId of an employee to ensure that sensitive
   * information is not leaked.
   *
   * @param id - Department ID of an employee
   * @return id - Reversed department ID
   */
  public String reverseString(String id) {
    //if string is not null, contains more than 1 characters then use recursion
    if (id != null && id.length() > 1) {

      //recursion that reverses string taking char by char
      return reverseString(id.substring(1)) + id.charAt(0);
    }

    //otherwise return the string
    return id;
  }

}

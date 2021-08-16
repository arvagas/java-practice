package employeeApp;

public class Main {
  public static void main(String[] args) {
    workWithData();
  }

  private static void workWithData() {

    // v---non-primitive type since not built into java
    Employee myEmp = new Employee("Arvin", "Agas", 1234567.89, true, 1, 1);

    myEmp.setFname("Super Arvin");
  
    //this will tell us the type of the object (employeeApp.Employee) appended with memory address of object (@1f32e575) ONLY IF the base toString method has not been overrode
    System.out.println(myEmp);

    System.out.println(myEmp.getFname());
    System.out.println(myEmp.getHas401k());
    System.out.println(myEmp.doubleSalary());

    //----------**********----------**********----------

    //Testing out if values are not of the same value and being calculated
    System.out.println(7 + 1.5); //answer will be a double
    System.out.println(7 / 2); //answer will be integer, decimals are chopped off
    System.out.println(7 / 2.0); //answer will be double

    //----------**********----------**********----------

    int a = 5;
    int b = 2;

    //You can typecast values by prepending another type with parenthesis
    System.out.println((double)a / b); //will output a double even though both values were originally integers
    
    //----------**********----------**********----------

    String myStr = "Hello World!";

    System.out.println(myStr);
    //The following takes the value of the string and update it accordingly, without modifying the original value
    System.out.println(myStr.toLowerCase());
    System.out.println(myStr.replaceAll("e", "3"));
    System.out.println(myStr.replaceAll("[aeiou]", "_"));

    //----------**********----------**********----------

    //Char can only be used with single quotes
    char myChar = 'a';
  }
}
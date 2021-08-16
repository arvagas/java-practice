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
  }
}
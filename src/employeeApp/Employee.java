package employeeApp;

public class Employee {
  private static int maxId = 1;
  private int id;

  private String fname;
  private String lname;
  private double salary;
  private boolean has401k;

  private int companyId;
  private int healthPlanId;

  public Employee(String fname, String lname, double salary, boolean has401k, int companyId, int healthPlanId) {
    id = maxId;
    maxId++;

    this.fname = fname;
    this.lname = lname;
    this.salary = salary;
    this.has401k = has401k;
    this.companyId = companyId;
    this.healthPlanId = healthPlanId;
  }
}

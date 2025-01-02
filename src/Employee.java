import java.util.Scanner;

public class Employee extends Person {
    private int employeeID;

    public Employee() {
        super();
        employeeID = 0;
    }

    public void setter() {
        Scanner input = new Scanner(System.in);
    while (true) {
      try {
        System.out.println("Enter Employee id: ");
        employeeID = input.nextInt();
        input.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Invalid input. Please enter a valid integer for customer id.");
        input.nextLine();
      }
    }

    System.out.println("Enter name:");
    name = input.nextLine();

    while (true) {
      try {
        System.out.println("Enter age: ");
        age = input.nextInt();
        input.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Invalid input. Please enter a valid integer for age.");
        input.nextLine();
      }
    }

    System.out.println("Enter address: ");
    address = input.nextLine();

    System.out.println("Enter phone number: ");
    phoneNo = input.nextLine();
    System.out.println("Enter the Email : ");
    email = input.nextLine();
    }

    public void update() {
        Scanner input = new Scanner(System.in);
    while (true) {
      try {
        System.out.println("Enter Employee id: ");
        employeeID = input.nextInt();
        input.nextLine();
        break;
      } catch (Exception e) 
      {
        System.out.println("Invalid input. Please enter a valid integer for customer id.");
        input.nextLine();
      }
    }

    System.out.println("Enter name:");
    name = input.nextLine();

    while (true) {
      try {
        System.out.println("Enter age: ");
        age = input.nextInt();
        input.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Invalid input. Please enter a valid integer for age.");
        input.nextLine();
      }
    }

    System.out.println("Enter address: ");
    address = input.nextLine();

    System.out.println("Enter phone number: ");
    phoneNo = input.nextLine();
    System.out.println("Enter the Email : ");
    email = input.nextLine();
    }

    public void display() {
        System.out.println("Name :  " + name);
        System.out.println("Age : " + age);
        System.out.println("Email : " + email);
        System.out.println("Address : " + address);
        System.out.println("Employee ID  : " + employeeID);

    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public int getAge() {
      return age;
  }

  public void setAge(int age) {
      this.age = age;
  }

  public String getAddress() {
      return address;
  }

  public void setAddress(String address) {
      this.address = address;
  }

  public String getPhoneNo() {
      return phoneNo;
  }

  public void setPhoneNo(String phoneNo) {
      this.phoneNo = phoneNo;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }
}

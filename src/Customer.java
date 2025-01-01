
import java.util.Scanner;

public class Customer extends Person {

  private int customerId;

  public Customer() {
    super();
    customerId = 0;
  }

  public void setter() {

    Scanner input = new Scanner(System.in);
    while (true) 
    {
      try {
        System.out.println("Enter customer id: ");
        customerId = input.nextInt();
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
    while (true) 
    {
      try {
        System.out.println("Enter customer id: ");
        customerId = input.nextInt();
        input.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Invalid input. Please enter a valid integer for customer id.");
        input.nextLine();
      }
    }

    System.out.println("Enter name:");
    name = input.nextLine();

    while (true) 
    {
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

  public void display()
  {
    System.out.println("Name is : " + name);
    System.out.println("Age is : " + age);
    System.out.println("Email is : " + email);
    System.out.println("Address is " + address);
    System.out.println("Customer ID is : " + customerId);

  }

  public int getCustomerId() 
  {
    return customerId;
  }

  public void setCustomerId(int customerId) 
  {
    this.customerId = customerId;
  }
  public String getName() 
  {
    return name;
}

public void setName(String name)
 {
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

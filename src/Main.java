import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] arg)
    {
       
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Station> stations = new ArrayList<>();
        ArrayList<Transaction> transactions = new ArrayList<>();

        Transaction transaction = new Transaction();
        Station station = new Station();
        Customer customer = new Customer();
        Employee employee = new Employee();

        Scanner sc = new Scanner(System.in);

        int choice;

        while (true)
         {
          
            System.out.println("\n----- Petrol Station Management -----");
            System.out.println("1. MANAGE PETROL STATIONS");
            System.out.println("2. MANAGE CUSTOMERS");
            System.out.println("3. MANAGE EMPLOYEES");
            System.out.println("4. MANAGE TRANSACTIONS");
            System.out.println("0. EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
             

            switch (choice) {
                case 1:
                    while (true) 
                    {
                       
                        System.out.println("\nMANAGE PETROL STATIONS:");
                        System.out.println("1. ADD STATION");
                        System.out.println("2. UPDATE STATION");
                        System.out.println("3. DISPLAY STATIONS");
                        System.out.println("4. DELETE STATION");
                        System.out.println("5. EXIT");
                        System.out.print("Enter your choice: ");
                        int stationChoice = sc.nextInt();
                       

                        switch (stationChoice)
                         {
                            case 1:
                                
                               
                                station.setter();  
                                stations.add(station);
                                System.out.println("Station Added Successfully.");
                                break;

                            case 2:
                              
                                System.out.print("Enter Station ID to Update: ");
                                int stationId = sc.nextInt();
                                  
                                boolean stationFound = false;
                                for (Station s : stations) 
                                {
                                    if (s.getStationID() == stationId) 
                                    {
                                        s.update();  
                                        System.out.println("Station Updated Successfully.");
                                        stationFound = true;
                                        break;
                                    }
                                }
                                if (stationFound==false) 
                                {
                                    System.out.println("Station Not Found.");
                                }
                                break;

                            case 3:
                               
                                if (stations.isEmpty()) 
                                {
                                    System.out.println("No Stations Available.");
                                } 
                                else 
                                {
                                    System.out.println("---- Station List ----");
                                    for (Station s : stations)
                                     {
                                        s.display();  
                                        System.out.println();
                                    }
                                }
                                break;

                            case 4:
                                
                                System.out.print("Enter Station ID to Delete: ");
                                int stationIdToDelete = sc.nextInt();
                                sc.nextLine(); 
                                boolean stationFoundToDelete = false;
                                for (Station s : stations) 
                                {
                                    if (s.getStationID() == stationIdToDelete) {
                                        stations.remove(s);
                                        System.out.println("Station Deleted Successfully.");
                                        stationFoundToDelete = true;
                                        break;
                                    }
                                }
                                if (stationFoundToDelete==false) 
                                {
                                    System.out.println("Station Not found.");
                                }
                                break;

                            case 5:
                                break; 

                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                        if (stationChoice == 5) break;
                    }
                    break;


                case 2:
                    while (true) 
                    {
                       
                        System.out.println("\nMANAGE CUSTOMERS:");
                        System.out.println("1. ADD CUSTOMER");
                        System.out.println("2. UPDATE CUSTOMER");
                        System.out.println("3. DISPLAY CUSTOMERS");
                        System.out.println("4. DELETE CUSTOMER");
                        System.out.println("5. EXIT");
                        System.out.print("Enter your choice: ");
                        int customerChoice = sc.nextInt();
                       

                        switch (customerChoice) 
                        {
                            case 1:
                               
                                
                                customer.setter();  
                                customers.add(customer);
                                System.out.println("Customer Added Successfully.");
                                break;

                            case 2:
                               
                                System.out.print("Enter Customer ID to Update: ");
                                int customerIdToUpdate = sc.nextInt();
                                sc.nextLine();  
                                boolean customerFoundToUpdate = false;
                                for (Customer c : customers) 
                                {
                                    if (c.getCustomerId() == customerIdToUpdate) 
                                    {
                                        c.update();  
                                        System.out.println("Customer Updated Successfully.");
                                        customerFoundToUpdate = true;
                                        break;
                                    }
                                }
                                if (customerFoundToUpdate==false) 
                                {
                                    System.out.println("Customer Not Found.");
                                }
                                break;

                            case 3:
                              
                                if (customers.isEmpty()) 
                                {
                                    System.out.println("No Customers Available.");
                                } 
                                else 
                                {
                                    System.out.println("---- Customer List ----");
                                    for (Customer c : customers)
                                     {
                                        c.display();  
                                        System.out.println();
                                    }
                                }
                                break;

                            case 4:
                             
                                System.out.print("Enter Customer ID to Delete: ");
                                int customerIdToDelete = sc.nextInt();
                                 
                                boolean customerFoundToDelete = false;
                                for (Customer c : customers) 
                                {
                                    if (c.getCustomerId() == customerIdToDelete) 
                                    {
                                        customers.remove(c);
                                        System.out.println("Customer Deleted Successfully.");
                                        customerFoundToDelete = true;
                                        break;
                                    }
                                }
                                if (customerFoundToDelete==false) {
                                    System.out.println("Customer Not Found.");
                                }
                                break;

                            case 5:
                                break;

                            default:
                                System.out.println("Invalid Choice. Please Try Again.");
                        }
                        if (customerChoice == 5) break;
                    }
                    break;

                    case 3:
                    while (true)
                     {
                       
                        System.out.println("\nMANAGE EMPLOYEES:");
                        System.out.println("1. ADD EMPLOYEES");
                        System.out.println("2. UPDATE EMPLOYEES");
                        System.out.println("3. DISPLAY EMPLOYEES");
                        System.out.println("4. DELETE EMPLOYEES");
                        System.out.println("5. EXIT");
                        System.out.print("Enter your choice: ");
                        int employeeChoice = sc.nextInt();
                       

                        switch (employeeChoice) 
                        {
                            case 1:
                                
                               
                                employee.setter();  
                                employees.add(employee);
                                System.out.println("Employee Added Successfully.");
                                break;

                            case 2:
                              
                                System.out.print("Enter Employee ID to Update: ");
                                int employeeId = sc.nextInt();
                                  
                                boolean employeeFound = false;
                                for (Employee e : employees) 
                                {
                                    if (e.getEmployeeID()==employeeId) 
                                    {
                                        e.update();  
                                        System.out.println("Employee Updated Successfully.");
                                        employeeFound = true;
                                        break;
                                    }
                                }
                                if (employeeFound==false) 
                                {
                                    System.out.println("Employee Not Found.");
                                }
                                break;

                            case 3:
                               
                                if (employees.isEmpty()) 
                                {
                                    System.out.println("No Employee Available.");
                                } 
                                else 
                                {
                                    System.out.println("---- Employee List ----");
                                    for (Employee e : employees) 
                                    {
                                        e.display();  
                                        System.out.println();
                                    }
                                }
                                break;

                            case 4:
                                
                                System.out.print("Enter Employee ID to Delete: ");
                                int employeeIdToDelete = sc.nextInt();
                                sc.nextLine(); 
                                boolean employeeFoundToDelete = false;
                                for (Employee e : employees) 
                                {
                                    if (e.getEmployeeID()==employeeIdToDelete)
                                     {
                                        employees.remove(e);
                                        System.out.println("Employee Deleted Successfully.");
                                        employeeFoundToDelete = true;
                                        break;
                                    }
                                }
                                if (employeeFoundToDelete==false) 
                                {
                                    System.out.println("Employee Not Found.");
                                }
                                break;

                            case 5:
                                break; 

                            default:
                                System.out.println("Invalid Choice. Please Try Again.");
                        }
                        if (employeeChoice == 5) break;
                    }
                    break;

                     case 4:
                    while (true)
                     {
                      
                        System.out.println("\nMANAGE TRANSACTIONS:");
                        System.out.println("1. ADD TRANSACTION");
                        System.out.println("2. UPDATE TRANSACTIONS");
                        System.out.println("3. DISPLAY TRANSACTIONS");
                        System.out.println("4. DELETE TRANSACTIONS");
                        System.out.println("5. EXIT");
                        System.out.print("Enter your choice: ");
                        int transactionChoice = sc.nextInt();
                        sc.nextLine();  

                        switch (transactionChoice) 
                        {
                            case 1:
                                
                                
                                transaction.setter(customers,stations,employees);  
                                transactions.add(transaction);
                                System.out.println("Transaction Added Successfully.");
                                break;

                                case 2 :
                                System.out.print("Enter Transaction ID to Update: ");
                                int transactionIdToUpdate = sc.nextInt();
                                sc.nextLine();  
                                boolean transactionFoundToUpdate = false;
                                for (Transaction t : transactions)
                                 {
                                    if (t.getTransactionId() == transactionIdToUpdate) 
                                    {
                                        t.update(customers,stations,employees);  
                                        System.out.println("Transaction Updated Successfully.");
                                        transactionFoundToUpdate = true;
                                        break;
                                    }
                                }
                                if (transactionFoundToUpdate==false) 
                                {
                                    System.out.println("Transaction Not Found.");
                                }
                                break;
                            case 3:
                              
                                if (transactions.isEmpty()) 
                                {

                                    System.out.println("No Transactions Available.");
                                } 
                                else
                                {
                                    System.out.println("---- Transaction List ----");
                                    for (Transaction t : transactions) {
                                        t.recepit();  
                                        System.out.println();
                                    }
                                }
                                break;

                            case 4:
                                System.out.print("Enter Transaction ID to Delete: ");
                                 int transactionIdToDelete = sc.nextInt();
                                 boolean transactionFoundToDelete = false;
                                 for(Transaction t :transactions)
                                 {
                                    if(t.getTransactionId()==transactionIdToDelete)
                                    {
                                        t.update(customers, stations, employees);
                                        transactionFoundToDelete = true;
                                        
                                        break;
                                    }
                                 }
                                 if(transactionFoundToDelete==false)
                                 {
                                    System.out.println("Transaction Not Found.");
                                 }
                                break; 
                            
                                case 5 : 
                                    break;

                            default:
                                System.out.println("Invalid Choice. Please Try Again.");
                        }
                        if (transactionChoice == 5)
                         break;
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice. Please Try Again.");
            }
        }
    }
}

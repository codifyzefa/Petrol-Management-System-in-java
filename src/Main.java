import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Station> stations = new ArrayList<>();
        ArrayList<Transaction> transactions = new ArrayList<>();
        Transaction transaction = new Transaction();
        Station station = new Station();
        Customer customer = new Customer();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
          
            System.out.println("\n----- Fuel Station Management -----");
            System.out.println("1. MANAGE PETROL STATIONS");
            System.out.println("2. MANAGE CUSTOMERS");
            System.out.println("3. MANAGE TRANSACTIONS");
            System.out.println("0. EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
             

            switch (choice) {
                case 1:
                    while (true) {
                       
                        System.out.println("\nMANAGE PETROL STATIONS:");
                        System.out.println("1. ADD STATION");
                        System.out.println("2. UPDATE STATION");
                        System.out.println("3. DISPLAY STATIONS");
                        System.out.println("4. DELETE STATION");
                        System.out.println("5. EXIT");
                        System.out.print("Enter your choice: ");
                        int stationChoice = sc.nextInt();
                       

                        switch (stationChoice) {
                            case 1:
                                
                               
                                station.setter();  
                                stations.add(station);
                                System.out.println("Station added successfully.");
                                break;

                            case 2:
                              
                                System.out.print("Enter station ID to update: ");
                                int stationId = sc.nextInt();
                                  
                                boolean stationFound = false;
                                for (Station s : stations) {
                                    if (s.getStationID() == stationId) {
                                        s.update();  
                                        System.out.println("Station updated successfully.");
                                        stationFound = true;
                                        break;
                                    }
                                }
                                if (stationFound==false) {
                                    System.out.println("Station not found.");
                                }
                                break;

                            case 3:
                               
                                if (stations.isEmpty()) {
                                    System.out.println("No stations available.");
                                } else {
                                    System.out.println("---- Station List ----");
                                    for (Station s : stations) {
                                        s.display();  
                                        System.out.println();
                                    }
                                }
                                break;

                            case 4:
                                
                                System.out.print("Enter station ID to delete: ");
                                int stationIdToDelete = sc.nextInt();
                                sc.nextLine(); 
                                boolean stationFoundToDelete = false;
                                for (Station s : stations) {
                                    if (s.getStationID() == stationIdToDelete) {
                                        stations.remove(s);
                                        System.out.println("Station deleted successfully.");
                                        stationFoundToDelete = true;
                                        break;
                                    }
                                }
                                if (stationFoundToDelete==false) {
                                    System.out.println("Station not found.");
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
                    while (true) {
                       
                        System.out.println("\nMANAGE CUSTOMERS:");
                        System.out.println("1. ADD CUSTOMER");
                        System.out.println("2. UPDATE CUSTOMER");
                        System.out.println("3. DISPLAY CUSTOMERS");
                        System.out.println("4. DELETE CUSTOMER");
                        System.out.println("5. EXIT");
                        System.out.print("Enter your choice: ");
                        int customerChoice = sc.nextInt();
                       

                        switch (customerChoice) {
                            case 1:
                               
                                
                                customer.setter();  
                                customers.add(customer);
                                System.out.println("Customer added successfully.");
                                break;

                            case 2:
                               
                                System.out.print("Enter customer ID to update: ");
                                int customerIdToUpdate = sc.nextInt();
                                sc.nextLine();  
                                boolean customerFoundToUpdate = false;
                                for (Customer c : customers) {
                                    if (c.getCustomerId() == customerIdToUpdate) {
                                        c.update();  
                                        System.out.println("Customer updated successfully.");
                                        customerFoundToUpdate = true;
                                        break;
                                    }
                                }
                                if (customerFoundToUpdate==false) {
                                    System.out.println("Customer not found.");
                                }
                                break;

                            case 3:
                              
                                if (customers.isEmpty()) {
                                    System.out.println("No customers available.");
                                } else {
                                    System.out.println("---- Customer List ----");
                                    for (Customer c : customers) {
                                        c.display();  
                                        System.out.println();
                                    }
                                }
                                break;

                            case 4:
                             
                                System.out.print("Enter customer ID to delete: ");
                                int customerIdToDelete = sc.nextInt();
                                 
                                boolean customerFoundToDelete = false;
                                for (Customer c : customers) {
                                    if (c.getCustomerId() == customerIdToDelete) {
                                        customers.remove(c);
                                        System.out.println("Customer deleted successfully.");
                                        customerFoundToDelete = true;
                                        break;
                                    }
                                }
                                if (customerFoundToDelete==false) {
                                    System.out.println("Customer not found.");
                                }
                                break;

                            case 5:
                                break;

                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                        if (customerChoice == 5) break;
                    }
                    break;

                case 3:
                    while (true) {
                      
                        System.out.println("\nMANAGE TRANSACTIONS:");
                        System.out.println("1. ADD TRANSACTION");
                        System.out.println("2. UPDATE TRANSACTIONS");
                        System.out.println("3. DISPLAY TRANSACTIONS");
                        System.out.println("4. DELETE TRANSACTIONS");
                        System.out.println("5. EXIT");
                        System.out.print("Enter your choice: ");
                        int transactionChoice = sc.nextInt();
                        sc.nextLine();  

                        switch (transactionChoice) {
                            case 1:
                                
                                
                                transaction.setter(customers,stations,employees);  
                                transactions.add(transaction);
                                System.out.println("Transaction added successfully.");
                                break;

                                case 2 :
                                System.out.print("Enter Transaction ID to update: ");
                                int transactionIdToUpdate = sc.nextInt();
                                sc.nextLine();  
                                boolean transactionFoundToUpdate = false;
                                for (Transaction t : transactions) {
                                    if (t.getTransactionId() == transactionIdToUpdate) {
                                        t.update(customers,stations,employees);  
                                        System.out.println("Customer updated successfully.");
                                        transactionFoundToUpdate = true;
                                        break;
                                    }
                                }
                                if (transactionFoundToUpdate==false) {
                                    System.out.println("Customer not found.");
                                }
                                break;
                            case 3:
                              
                                if (transactions.isEmpty()) {
                                    System.out.println("No transactions available.");
                                } else {
                                    System.out.println("---- Transaction List ----");
                                    for (Transaction t : transactions) {
                                        t.recepit();  
                                        System.out.println();
                                    }
                                }
                                break;

                            case 4:
                                System.out.print("Enter Transaction ID to delete: ");
                                 int transactionIdToDelete = sc.nextInt();
                                 boolean transactionFoundToDelete = false;
                                 for(Transaction t :transactions)
                                 {
                                    if(t.getTransactionId()==transactionIdToDelete)
                                    {
                                        t.recepit();
                                        transactionFoundToDelete = true;
                                        break;
                                    }
                                 }
                                 if(transactionFoundToDelete==false)
                                 {
                                    System.out.println("Transaction not found.");
                                 }
                                break; 
                            
                                case 5 : 
                                    break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                        if (transactionChoice == 3) break;
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

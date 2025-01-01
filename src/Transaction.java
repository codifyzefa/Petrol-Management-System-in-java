import java.util.ArrayList;
import java.util.Scanner;

public class Transaction implements TransactionInfo{
    private int referenceCounter;
    private int transactionId;
    private Customer customer;
    private Station station;
    private fuelType fuel;
    private double quantity;
    private double total;
    private Employee employee;
    public Transaction() {
        customer = new Customer();
        station = new Station();
        fuel = new fuelType();
        quantity = 0.0;
        total = 0.0;
        referenceCounter++;
    }

    public void setter(ArrayList<Customer> availableCustomer, ArrayList<Station> availableStation,ArrayList<Employee> availableEmployee) {
        transactionId = referenceCounter;
        Scanner input = new Scanner(System.in);
        int customerId;
        while (true) {
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

        for (Customer c : availableCustomer) {
            if (customerId == c.getCustomerId()) {
                customer = c;
                break;
            } else {
                System.out.println("Customer not found!!");
                return;
            }
        }
        int employeeId;
        while (true) {
            try {
                System.out.println("Enter employee id: ");
                employeeId = input.nextInt();
                input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for customer id.");
                input.nextLine();
            }
        }
        for (Employee e : availableEmployee) {
            if (employeeId == e.getEmployeeID()) {
                employee = e;
                break;
            } else {
                System.out.println("Customer not found!!");
                return;
            }
        }
        int stationId;
        while (true) {
            try {
                System.out.println("Enter station id: ");
                stationId = input.nextInt();
                input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for station id.");
                input.nextLine();
            }
        }

        for (Station s : availableStation) {
            if (s.getStationID() == stationId) {
                station = s;
                break;
            } else {
                System.out.println("Station not found.");
                return;
            }
        }

        station.displayFuel();
        int fuelId;
        while (true) {
            try {
                System.out.println("Enter fuel id: ");
                fuelId = input.nextInt();
                input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for fuel id.");
                input.nextLine();
            }
        }

        for (fuelType f : station.getFuel()) {
            if (f.getFuelID() == fuelId) {
                fuel = f;
                break;
            } else {
                System.out.println("Fuel not found.");
                return;
            }
        }

        while (true) {
            try {
                System.out.println("Enter fuel quantity: ");
                quantity = input.nextDouble();
                input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for quantity.");
                input.nextLine();
            }
        }

        try {
            fuel.reduceQuantity(quantity);
            System.out.println("Transaction successful");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        total = fuel.getPricePerlitre() * quantity;
    }

    public void update(ArrayList<Customer> availableCustomer, ArrayList<Station> availableStation,ArrayList<Employee> availableEmployee) {
        double amount = fuel.getQuantity() + quantity;
        fuel.setQuantity(amount);
        Scanner input = new Scanner(System.in);
        int customerId;
        while (true) {
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

        for (Customer c : availableCustomer) {
            if (customerId == c.getCustomerId()) {
                customer = c;
                break;
            } else {
                System.out.println("Customer not found!!");
                return;
            }
        }
        int employeeId;
        while (true) {
            try {
                System.out.println("Enter employee id: ");
                employeeId = input.nextInt();
                input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for customer id.");
                input.nextLine();
            }
        }
        for (Employee e : availableEmployee) {
            if (employeeId == e.getEmployeeID()) {
                employee = e;
                break;
            } else {
                System.out.println("Customer not found!!");
                return;
            }
        }
        int stationId;
        while (true) {
            try {
                System.out.println("Enter station id: ");
                stationId = input.nextInt();
                input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for station id.");
                input.nextLine();
            }
        }

        for (Station s : availableStation) {
            if (station.getStationID() == stationId) {
                station = s;
                break;
            } else {
                System.out.println("Station not found.");
                return;
            }
        }

        station.displayFuel();
        int fuelId;
        while (true) {
            try {
                System.out.println("Enter fuel id: ");
                fuelId = input.nextInt();
                input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for fuel id.");
                input.nextLine();
            }
        }

        for (fuelType f : station.getFuel()) {
            if (f.getFuelID() == fuelId) {
                fuel = f;
                break;
            } else {
                System.out.println("Fuel not found.");
                return;
            }
        }

        while (true) {
            try {
                System.out.println("Enter fuel quantity: ");
                quantity = input.nextDouble();
                input.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for quantity.");
                input.nextLine();
            }
        }

        try {
            fuel.reduceQuantity(quantity);
            System.out.println("Transaction successful");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        total = fuel.getPricePerlitre() * quantity;
    }

    public void recepit() {
        System.out.println("Transaction id: " + transactionId);
        System.out.println("Customer Id: " + customer.getCustomerId());
        System.out.println("Customer name : "+customer.getName());
        System.out.println("Station Id :"+station.getStationID());
        System.out.println("Station name: " + station.getStationName());
        System.out.println("Fuel name: " + fuel.getFuelName());
        System.out.println("Total Bill: " + total);
    }

    public int getReferenceCounter() {
        return referenceCounter;
    }

    public void setReferenceCounter(int referenceCounter) {
        this.referenceCounter = referenceCounter;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public fuelType getFuel() {
        return fuel;
    }

    public void setFuel(fuelType fuel) {
        this.fuel = fuel;
    }

    
}

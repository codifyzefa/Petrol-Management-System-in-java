import java.util.Scanner;

public class fuelType {
    private int fuelID;
    private String fuelName;
    private double pricePerlitre;
    private double quantity;

    public fuelType() {
        fuelID = 0;
        fuelName = null;
        pricePerlitre = 0.0;

    }

    public void reduceQuantity(double amount) 
    {
        if (amount <= quantity) 
        {
            quantity -= amount;
        } else 
        {
            throw new IllegalArgumentException("Not enough fuel available.");
        }
    }
    public void setter() 
    {
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            try {
                System.out.println("Enter Fuel - Id: ");
                fuelID = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) 
            {
                System.out.println("Invalid input. Please enter a valid integer for fuel id.");
                sc.nextLine();
            }
        }
        System.out.println("Enter Fuel - Name : ");
        fuelName = sc.nextLine();
        while (true)
         {
            try {
                System.out.println("Enter Price - per - Liter: ");
                pricePerlitre = sc.nextDouble();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for price.");
                sc.nextLine();
            }
        }
        while (true) 
        {
            try {
                System.out.println("Enter fuel quantity: ");
                quantity = sc.nextDouble();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for quantity.");
                sc.nextLine();
            }
        }
    }

    public void update() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter Fuel - Id: ");
                fuelID = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for fuel id.");
                sc.nextLine();
            }
        }
        System.out.println("Enter Fuel - Name : ");
        fuelName = sc.nextLine();
        while (true) {
            try {
                System.out.println("Enter Price - per - Liter: ");
                pricePerlitre = sc.nextDouble();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for price.");
                sc.nextLine();
            }
        }
        while (true) {
            try {
                System.out.println("Enter fuel quantity: ");
                quantity = sc.nextDouble();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for quantity.");
                sc.nextLine();
            }
        }
    }

    public void display() {
        System.out.println("FuelID is : " + fuelID);
        System.out.println("FuelName is : " + fuelName);
        System.out.println("Fuel PricePerLitre : "+"$"+ pricePerlitre);
        System.out.println("Fuel quantity: " + quantity + "Liters");
    }

    public int getFuelID() {
        return fuelID;
    }

    public void setFuelID(int fuelID) {
        this.fuelID = fuelID;
    }

    public String getFuelName() {
        return fuelName;
    }

    public void setFuelName(String fuelName) {
        this.fuelName = fuelName;
    }

    public double getPricePerlitre() {
        return pricePerlitre;
    }

    public void setPricePerlitre(double pricePerlitre) {
        this.pricePerlitre = pricePerlitre;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    

}

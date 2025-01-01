import java.util.ArrayList;
import java.util.Scanner;

public class Station
 {
    private int stationID;
    private String stationName;
    private String stationLocation;
    private ArrayList<fuelType> fuel;

    public Station() 
    {
        stationID = 0;
        stationName = null;
        stationLocation = null;
        fuel = new ArrayList<>();
    }

    public void setter() 
    {
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            try {
                System.out.println("Enter station Id: ");
                stationID = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) 
            {
                System.out.println("Invalid input. Please enter a valid integer for station id.");
                sc.nextLine();
            }
        }
        System.out.println("Enter Station Name : ");
        stationName = sc.nextLine();

        System.out.println("Enter Station Location : ");
        stationLocation = sc.nextLine();

        while (true) {
            System.out.println("1.Add fuel in station");
            System.out.println("0.Exit");
            int choice;
            while (true) 
            {
                try 
                {
                    choice = sc.nextInt();
                    sc.nextLine();
                    break;
                } catch (Exception e) 
                {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    sc.nextLine();
                }
            }
            if (choice == 0) 
            {
                break;
            } 
            else
            {
                fuelType f = new fuelType();
                f.setter();
                fuel.add(f);
            }

        }

    }

    public void update()
     {
        Scanner sc = new Scanner(System.in);
        while (true)
         {
            try {
                System.out.println("Enter station Id: ");
                stationID = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for station id.");
                sc.nextLine();
            }
        }
        System.out.println("Enter Station Name : ");
        stationName = sc.nextLine();

        System.out.println("Enter Station Location : ");
        stationLocation = sc.nextLine();

        while (true) {
            System.out.println("1.Add fuel in station");
            System.out.println("0.Exit");
            int choice;
            while (true) 
            {
                try {
                    choice = sc.nextInt();
                    sc.nextLine();
                    break;
                } catch (Exception e) 
                {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    sc.nextLine();
                }
            }
            if (choice == 0) 
            {
                break;
            } else
            {
                fuelType f = new fuelType();
                f.setter();
                fuel.add(f);
            }

        }

    }

    public void displayFuel()
    {
        System.out.println("****Fuel****");
        for (fuelType f : fuel)
         {
            f.display();
            System.out.println();
        }
    }

    public void display() 
    {
        System.out.println("Station ID : " + stationID);
        System.out.println("Station Name : " + stationName);
        System.out.println("Station Location : " + stationLocation);
        for(fuelType f : fuel)
        {
            f.display();
        }
        //displayFuel();
    }

    public int getStationID() 
    {
        return stationID;
    }

    public void setStationID(int stationID)
     {
        this.stationID = stationID;
    }

    public String getStationName()
     {
        return stationName;
    }

    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationLocation() 
    {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) 
    {
        this.stationLocation = stationLocation;
    }

    public ArrayList<fuelType> getFuel() 
    {
        return fuel;
    }

    public void setFuel(ArrayList<fuelType> fuel)
 {
        this.fuel = fuel;
    }

}

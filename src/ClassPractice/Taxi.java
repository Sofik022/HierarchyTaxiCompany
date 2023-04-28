class Taxi {

    public static void main(String[] arg) {






        Person person = new Person("Petro", "Sokol", 25);
        System.out.println(person.getName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());

        Client client = new Client("Vasyl", "Sokolov", 23, true, 2);
        System.out.println(client.getName());
        System.out.println(client.getLastName());
        System.out.println(client.getAge());
        System.out.println(client.getInstalledApp());
        System.out.println(client.getOrders());

        Employee employee = new Employee( "Roma","Voloshyn","driver");
        System.out.println(employee.getName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getPosition());

        Cars cars = new Cars( "NF2353",  "BMW",  "passenger car");
        System.out.println(cars.getNumber());
        System.out.println(cars.getName());
        System.out.println(cars.getCategory());

        ElectricVehicle electricVehicle = new ElectricVehicle ( "Tesla", "NR4587", 180);
        System.out.println(electricVehicle.getName());
        System.out.println(electricVehicle.getLicence());
        System.out.println(electricVehicle.getSpeed());

        FuelVehicle fuelVehicle = new FuelVehicle("Nisan",  "Solar", 200);
        System.out.println(fuelVehicle.getName());
        System.out.println(fuelVehicle.getFlue());
        System.out.println(fuelVehicle.getSpeed());

        TruckCars truckCars = new TruckCars( "Pickup",  "TN3435",  190);
        System.out.println(truckCars.getName());
        System.out.println(truckCars.getLicenseNum());
        System.out.println(truckCars.getCarSpeed());

        PassengerCar passengerCar = new PassengerCar( "Skoda",  "GH5498", 150);
        System.out.println(passengerCar.getCarName());
        System.out.println(passengerCar.getLicenseNum());
        System.out.println(passengerCar.getCarSpeed());

        TaxiDrivers taxiDrivers = new TaxiDrivers( "Lev",  "Komarovych",  "Mazda");
        System.out.println(taxiDrivers.getName());
        System.out.println(taxiDrivers.getLastName());
        System.out.println(taxiDrivers.getCarType());

        HeadDepartment headDepartment = new HeadDepartment( "Nazar",  "Filatov",  "Director");
        System.out.println(headDepartment.getName());
        System.out.println(headDepartment.getLastName());
        System.out.println(headDepartment.getPosition());

        FinanceDepartment financeDepartment = new FinanceDepartment( "Lola",  "Vasylkiv",  "Head accountant");
        System.out.println(financeDepartment.getName());
        System.out.println(financeDepartment.getLastName());
        System.out.println(financeDepartment.getPosition());
        financeDepartment.DoSalary(3000,0.06);

        NewOrders newOrders = new NewOrders( 2, 34270803);
        System.out.println(newOrders.getGettaxi());
        System.out.println(newOrders.getNewOrder());

        TaxiServices taxiServices = new TaxiServices( "Food delivery taxi service department", "Taxi service department",  "Freight delivery service department");
        System.out.println(taxiServices.getfooddelivery());
        System.out.println(taxiServices.gettaxiservice());
        System.out.println(taxiServices.getfreightdelivery());

        Languages languages = new Languages();
        languages.getClienLanguage("English");








        System.out.println("Taxi");
    }

}

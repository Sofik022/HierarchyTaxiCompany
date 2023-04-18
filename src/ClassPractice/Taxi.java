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
        System.out.println(cars.getNumber());
        System.out.println(cars.getCategory());



        System.out.println("Taxi");
    }
}

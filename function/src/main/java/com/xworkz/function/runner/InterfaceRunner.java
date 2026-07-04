package com.xworkz.function.runner;

import com.xworkz.function.interfaces.*;

import java.time.LocalDate;
import java.util.Arrays;

public class InterfaceRunner {
    public static void main(String[] args) {
        Camera camera = (int nos, boolean store) -> {
            System.out.println("Running click in lambda implementation");
            System.out.println("Photos : " + nos);
            System.out.println("Store : " + store);
        };

        Photographer photographer = new Photographer();
        photographer.capture(camera);

        Addition addition = (int a, int b) -> {
            return a + b;
        };
        System.out.println("1. " +addition.add(10, 20));

        Even even = (int number) -> {
            return number % 2 == 0;
        };
        System.out.println( "2. "+even.check(18));

        Greeting greeting = (String name) -> {
            return "Welcome " + name;
        };
        System.out.println("3. " + greeting.message("Amruta"));

        PrintName printName = (String name) -> {
            System.out.println("4. " + name);
        };
        printName.print("Rosa");

        Today today = () -> {
            return LocalDate.now();
        };
        System.out.println("5. " + today.date());


        ArraySum arraySum = (int[] numbers) -> {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum;
        };
        System.out.println("6. " + arraySum.sum(new int[]{10,20,30}));

        Reverse reverse = (String text) -> {
            return new StringBuilder(text).reverse().toString();
        };
        System.out.println("7. " + reverse.reverse("Java"));


        StringArray stringArray = (String[] names) -> {
            System.out.println(Arrays.toString(names));
        };
        stringArray.display(new String[]{"Java","Python","SQL"});


        Laptop laptop = (String brand, int ram) -> {
            System.out.println("Running process in lambda implementation");
            System.out.println("Brand : " + brand);
            System.out.println("RAM : " + ram);
        };

        Engineer engineer = new Engineer();
        engineer.work(laptop);


        Printer printer = (String document, int copies) -> {
            System.out.println("Running print in lambda implementation");
            System.out.println(document);
            System.out.println(copies);
        };

        Office office = new Office();
        office.printDocument(printer);

        Mobile mobile = (String contact, long number) -> {
            System.out.println("Running call in lambda implementation");
            System.out.println(contact);
            System.out.println(number);
        };

        User user = new User();
        user.contact(mobile);

        Bottle bottle=(double litres,String liquid)->{
            System.out.println("Running fill in lambda implementation");
            System.out.println("Litres : "+litres);
            System.out.println("Liquid : "+liquid);
        };

        bottle.fill(2.5,"Water");

        Pen pen=(char color,float tipSize)-> {
            System.out.println("Running write in lambda implementation");
        };

        Student student=(String name,long usn)->{
            System.out.println("Running details in lambda implementation");
            System.out.println("Name : "+name);
            System.out.println("USN : "+usn);
        };

        student.details("Amruta",23456969L);

        Employee employee=(String name,double salary)-> {
            System.out.println("Running salary in lambda implementation");
        };

        Numbers numbers=(int[] values)->{
            for(int value:values){
                System.out.println(value);
            }
        };
        numbers.display(new int[]{10,20,30,40});

        Names names=(String[] values)->{
            for(String value:values){
                System.out.println(value);
            }
        };
        names.show(new String[]{"Java","Python","SQL"});

        Hospital hospital=(String patientName,int roomNo)->{
            System.out.println("Running admit in lambda implementation");
            System.out.println("Patient Name : "+patientName);
            System.out.println("Room No : "+roomNo);
        };
        hospital.admit("Amruta",105);


        Bank bank=(long accountNumber,double amount)->{
            System.out.println("Running deposit in lambda implementation");
            System.out.println("Account Number : "+accountNumber);
            System.out.println("Amount : "+amount);
        };
        bank.deposit(9876543210L,25000.50);


        Flight flight=(String flightName,boolean confirmed)->{
            System.out.println("Running book in lambda implementation");
            System.out.println("Flight : "+flightName);
            System.out.println("Confirmed : "+confirmed);
        };
        flight.book("IndiGo",true);

        Movie movie=(String movieName,float rating)->{
            System.out.println("Running watch in lambda implementation");
            System.out.println("Movie : "+movieName);
            System.out.println("Rating : "+rating);
        };
        movie.watch("Kantara",4.8f);

        College college=(String studentName,char section)->{
            System.out.println("Running admission in lambda implementation");
            System.out.println("Student : "+studentName);
            System.out.println("Section : "+section);
        };
        college.admission("Rahul",'A');

        Cricket cricket=(String player,int runs)->{
            System.out.println("Running score in lambda implementation");
            System.out.println("Player : "+player);
            System.out.println("Runs : "+runs);
        };
        cricket.score("Virat",85);

        Car car=(String brand,byte gears)-> {
            System.out.println("Running drive in lambda implementation");
        };

        Country country=(String countryName,String capital)->{
            System.out.println("Running details in lambda implementation");
            System.out.println("Country : "+countryName);
            System.out.println("Capital : "+capital);
        };
        country.details("India","New Delhi");


        Library library=(String bookName,int days)->{
            System.out.println("Running issue in lambda implementation");
            System.out.println("Book Name : "+bookName);
            System.out.println("Days : "+days);
        };
        library.issue("Java Programming",15);


        Shopping shopping=(String item,double price)->{
            System.out.println("Running purchase in lambda implementation");
            System.out.println("Item : "+item);
            System.out.println("Price : "+price);
        };
        shopping.purchase("Laptop",65000.75);

        Bus bus=(String destination,boolean ticketBooked)->{
            System.out.println("Running travel in lambda implementation");
            System.out.println("Destination : "+destination);
            System.out.println("Ticket Booked : "+ticketBooked);
        };
        bus.travel("Mysore",true);

        Exam exam=(String student1,float percentage)-> {
            System.out.println("Running result in lambda implementation");
        };

        Hotel hotel=(String customer,short roomNo)-> {
            System.out.println("Running reserve in lambda implementation");
        };

        Train train=(String trainName,int platform)-> {
            System.out.println("Running journey in lambda implementation");
        };

        Passport passport=(String applicant,char category)-> {
            System.out.println("Running verify in lambda implementation");

        };

        Company company=(String employee1,Long employeeId)->{
            System.out.println("Running recruit in lambda implementation");
            System.out.println("Employee : "+employee1);
            System.out.println("Employee Id : "+employeeId);
        };
        company.recruit("Kiran",1001L);

        Fruits fruits=(String[] names1)->{
            System.out.println("Running display in lambda implementation");
            for(String fruit:names1){
                System.out.println(fruit);
            }
        };
        fruits.display(new String[]{"Apple","Mango","Orange"});

        Marks marks=(int[] values)->{
            System.out.println("Running calculate in lambda implementation");
            int total=0;
            for(int value:values){
                total+=value;
            }
            System.out.println("Total Marks : "+total);
        };
        marks.calculate(new int[]{85,90,95});


        Product product=(String name,double price,int quantity)->{
            System.out.println("Running purchase in lambda implementation");
            System.out.println("Product : "+name);
            System.out.println("Price : "+price);
            System.out.println("Quantity : "+quantity);
        };
        product.purchase("Laptop",65000.0,2);

        Temperature temperature=(float degree)->{
            System.out.println("Running check in lambda implementation");
            System.out.println("Degree : "+degree);
        };

        temperature.check(36.5f);

        Fan fan=(byte level)->{
            System.out.println("Running speed in lambda implementation");
            System.out.println("Speed Level : "+level);
        };
        fan.speed((byte)5);

        Drone drone=(int height)->{
            System.out.println("Running fly in lambda implementation");
            System.out.println("Height : "+height);
        };

        drone.fly(500);

        PassportOffice passportOffice=(String applicant,int age,char category)->{
            System.out.println("Running verify in lambda implementation");
            System.out.println("Applicant : "+applicant);
            System.out.println("Age : "+age);
            System.out.println("Category : "+category);
        };
        passportOffice.verify("Anjali",25,'A');

        Metro metro=(String station)->{
            System.out.println("Running travel in lambda implementation");
            System.out.println("Station : "+station);
        };

        metro.travel("Majestic");

        Gym gym=(String exercise,int duration,boolean completed)->{
            System.out.println("Running workout in lambda implementation");
            System.out.println("Exercise : "+exercise);
            System.out.println("Duration : "+duration);
            System.out.println("Completed : "+completed);
        };

        gym.workout("Pushups",30,true);

        Pharmacy pharmacy=(String medicineName)->{
            System.out.println("Running medicine in lambda implementation");
            System.out.println("Medicine : "+medicineName);
        };

        pharmacy.medicine("Paracetamol");

        Weather weather=(double temperature1,String city,boolean rain)->{
            System.out.println("Running forecast in lambda implementation");
            System.out.println("Temperature : "+temperature1);
            System.out.println("City : "+city);
            System.out.println("Rain : "+rain);
        };

        weather.forecast(28.5,"Hubli",false);

        Museum museum=(String museumName)->{
            System.out.println("Running visit in lambda implementation");
            System.out.println("Museum : "+museumName);
        };

        museum.visit("National Museum");


        Bakery bakery=(String item,int quantity,double amount)->{
            System.out.println("Running order in lambda implementation");};


        Garden garden=(boolean available)->{
            System.out.println("Running water in lambda implementation");
            System.out.println("Water Available : "+available);
        };

        garden.water(true);

        Aquarium aquarium=(String fishName,float foodQuantity,int times)->{
            System.out.println("Running feed in lambda implementation");
            System.out.println("Fish : "+fishName);
            System.out.println("Food Quantity : "+foodQuantity);
            System.out.println("Times : "+times);
        };

        aquarium.feed("Gold Fish",1.5f,3);

        Calculator calculator = (int num1, int num2, char operation) -> {
            System.out.println("Running calculate in lambda implementation");
            System.out.println("Number 1 : " + num1);
            System.out.println("Number 2 : " + num2);
            System.out.println("Operation : " + operation);
            System.out.println("Result : " + (num1 + num2));
        };

        Operation operation = new Operation();
        operation.execute(calculator);

        Restaurant restaurant = (String foodName, int quantity, double price) -> {
            System.out.println("Running order in lambda implementation");};

        Planet planet = (String planetName) -> {
            System.out.println("Running explore in lambda implementation");
            System.out.println("Planet : " + planetName);
        };
        planet.explore("Mars");

        HospitalWard hospitalWard = (String patientName, int wardNumber, boolean emergency) -> {
            System.out.println("Running assign in lambda implementation");};

        Festival festival = (String festivalName, char grade) -> {
            System.out.println("Running celebrate in lambda implementation");
            System.out.println("Festival : " + festivalName);
            System.out.println("Grade : " + grade);
        };

        festival.celebrate("Diwali", 'A');

        Electricity electricity = (float units) -> {
            System.out.println("Running consume in lambda implementation");
            System.out.println("Units : " + units);
        };

        electricity.consume(145.75f);

        Modulus modulus = (int a, int b) -> {
            return a % b;
        };
        System.out.println("Modulus: " + modulus.modulus(20, 3));

        Square square = (int a) -> {
            return a * a;
        };
        System.out.println("Square: " + square.square(8));

        VoteEligibility voteEligibility = (int age) -> {
            return age >= 18;
        };
        System.out.println("Eligible: " + voteEligibility.canVote(20));
        }
}

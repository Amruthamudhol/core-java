package com.xworkz.function.runner;

import java.time.LocalDate;
import java.util.function.*;

public class LambdaRunner {

    public static void main(String[] args) {


        Function<String,Integer> function = (String name) -> {
            return name.length();
        };
        System.out.println(" Function : " + function.apply("Amruta"));


        BiFunction<Integer, Double, Double> biFunction = (Integer quantity, Double price) -> {
            return quantity * price;};
        System.out.println(" BiFunction : " + biFunction.apply(5, 250.75));


        UnaryOperator<String> unaryOperator = (String city) -> {
            return city.toUpperCase();
        };
        System.out.println("UnaryOperator : " + unaryOperator.apply("Bengaluru"));


        BinaryOperator<String> binaryOperator = (String firstName, String lastName) -> {
            return firstName + " " + lastName;};
        System.out.println(" BinaryOperator : " + binaryOperator.apply("Amruta", "Mudhol"));


        Predicate<Double> predicate = (Double percentage) -> {
            return percentage >= 35;
        };
        System.out.println(" Predicate : " + predicate.test(82.5));


        BiPredicate<Character, Character> biPredicate = (Character ch1, Character ch2) -> {
            return ch1.equals(ch2);
        };
        System.out.println(" BiPredicate : " + biPredicate.test('A', 'A'));


        Consumer<String> consumer = (String course) -> {
            System.out.println(" Consumer : " + course);
        };
        consumer.accept("Java");


        BiConsumer<String, Integer> biConsumer = (String employee, Integer age) -> {
            System.out.println(" BiConsumer : " + employee + " " + age);
        };
        biConsumer.accept("Rahul", 24);


        Supplier<LocalDate> supplier = () -> {
            return LocalDate.now();
        };
        System.out.println(" Supplier : " + supplier.get());

        BooleanSupplier booleanSupplier = () -> {
            return 100 > 50;
        };
        System.out.println(" BooleanSupplier : " + booleanSupplier.getAsBoolean());


        IntSupplier intSupplier = () -> {
            return 999;
        };
        System.out.println(" IntSupplier : " + intSupplier.getAsInt());


        LongSupplier longSupplier = () -> {
            return 9876543210L;
        };
        System.out.println(" LongSupplier : " + longSupplier.getAsLong());


        DoubleSupplier doubleSupplier = () -> {
            return 45678.90;
        };
        System.out.println(" DoubleSupplier : " + doubleSupplier.getAsDouble());


        IntConsumer intConsumer = (int marks) -> {
            System.out.println(" IntConsumer : " + marks);
        };
        intConsumer.accept(95);


        LongConsumer longConsumer = (long mobile) -> {
            System.out.println(" LongConsumer : " + mobile);
        };
        longConsumer.accept(9876543210L);


        DoubleConsumer doubleConsumer = (double salary) -> {
            System.out.println(" DoubleConsumer : " + salary);
        };
        doubleConsumer.accept(45678.50);

        ObjIntConsumer<String> objIntConsumer = (String studentName, int marks) -> {
            System.out.println(" ObjIntConsumer : " + studentName + " " + marks);
        };
        objIntConsumer.accept("Rohit", 95);


        ObjLongConsumer<String> objLongConsumer = (String bankName, long accountNumber) -> {
            System.out.println(" ObjLongConsumer : " + bankName + " " + accountNumber);
        };
        objLongConsumer.accept("SBI", 9876543210L);


        ObjDoubleConsumer<String> objDoubleConsumer = (String productName, double price) -> {
            System.out.println(" ObjDoubleConsumer : " + productName + " " + price);
        };
        objDoubleConsumer.accept("Laptop", 65000.75);


        IntPredicate intPredicate = (int age) -> {
            return age >= 18;
        };
        System.out.println(" IntPredicate : " + intPredicate.test(22));


        LongPredicate longPredicate = (long population) -> {
            return population > 1000000L;
        };
        System.out.println(" LongPredicate : " + longPredicate.test(2500000L));

        //22. DoublePredicate
        DoublePredicate doublePredicate = (double percentage) -> {
            return percentage >= 60.0;
        };
        System.out.println(" DoublePredicate : " + doublePredicate.test(78.50));


        IntFunction<String> intFunction = (int employeeId) -> {
            return "EMP" + employeeId;
        };
        System.out.println(" IntFunction : " + intFunction.apply(101));


        LongFunction<String> longFunction = (long mobileNumber) -> {
            return "Mobile : " + mobileNumber;
        };
        System.out.println(" LongFunction : " + longFunction.apply(9876543210L));


        DoubleFunction<String> doubleFunction = (double cgpa) -> {
            return "CGPA : " + cgpa;
        };
        System.out.println(" DoubleFunction : " + doubleFunction.apply(8.75));


        ToIntFunction<String> toIntFunction = (String courseName) -> {
            return courseName.length();
        };
        System.out.println(" ToIntFunction : " + toIntFunction.applyAsInt("Java"));


        ToLongFunction<String> toLongFunction = (String companyName) -> {
            return companyName.length() ;
        };
        System.out.println(" ToLongFunction : " + toLongFunction.applyAsLong("Infosys"));

        ToDoubleFunction<Integer> toDoubleFunction = (Integer marks) -> {
            return marks ;
        };
        System.out.println("ToDoubleFunction : " + toDoubleFunction.applyAsDouble(850));


        IntToLongFunction intToLongFunction = (int amount) -> {
            return amount ;
        };
        System.out.println(" IntToLongFunction : " + intToLongFunction.applyAsLong(50));


        IntToDoubleFunction intToDoubleFunction = (int number) -> {
            return number ;
        };
        System.out.println(" IntToDoubleFunction : " + intToDoubleFunction.applyAsDouble(15));


        LongToIntFunction longToIntFunction = (long salary) -> {
            return (int) salary;
        };
        System.out.println(" LongToIntFunction : " + longToIntFunction.applyAsInt(50000L));


        LongToDoubleFunction longToDoubleFunction = (long amount) -> {
              return amount ;
        };
        System.out.println(" LongToDoubleFunction : " + longToDoubleFunction.applyAsDouble(8000L));


        DoubleToIntFunction doubleToIntFunction = (double temperature) -> {
            return (int) temperature;
        };
        System.out.println(" DoubleToIntFunction : " + doubleToIntFunction.applyAsInt(36.8));



        DoubleToLongFunction doubleToLongFunction = (double distance) -> {
            return (long) distance;
        };
        System.out.println(" DoubleToLongFunction : " + doubleToLongFunction.applyAsLong(250.75));


        IntUnaryOperator intUnaryOperator = (int number) -> {
            return number ;
        };
        System.out.println(". IntUnaryOperator : " + intUnaryOperator.applyAsInt(12));


        LongUnaryOperator longUnaryOperator = (long number) -> {
            return number;
        };
        System.out.println(" LongUnaryOperator : " + longUnaryOperator.applyAsLong(5000L));



        DoubleUnaryOperator doubleUnaryOperator = (double value) -> {
            return value * value;
        };
        System.out.println(" DoubleUnaryOperator : " + doubleUnaryOperator.applyAsDouble(12.5));


        IntBinaryOperator intBinaryOperator = (int num1, int num2) -> {
            return num1 + num2;
        };
        System.out.println(" IntBinaryOperator : " + intBinaryOperator.applyAsInt(25, 15));


        LongBinaryOperator longBinaryOperator = (long num1, long num2) -> {
            return num1 - num2;
        };
        System.out.println(" LongBinaryOperator : " + longBinaryOperator.applyAsLong(10000L, 3500L));



        DoubleBinaryOperator doubleBinaryOperator = (double num1, double num2) -> {
            return num1+num2;
        };
        System.out.println(" DoubleBinaryOperator : " + doubleBinaryOperator.applyAsDouble(15.5, 2.5));


        ToIntBiFunction<String, String> toIntBiFunction = (String firstName, String lastName) -> {
            return firstName.length() + lastName.length();
        };
        System.out.println(" ToIntBiFunction : " + toIntBiFunction.applyAsInt("Amruta", "Mudhol"));



        ToLongBiFunction<Integer, Integer> toLongBiFunction = (Integer quantity, Integer price) -> {
            return quantity;
        };
        System.out.println(" ToLongBiFunction : " + toLongBiFunction.applyAsLong(10, 250));




        ToDoubleBiFunction<Double, Integer> toDoubleBiFunction = (Double salary, Integer bonus) -> {
            return salary + bonus;
        };
        System.out.println(" ToDoubleBiFunction : " + toDoubleBiFunction.applyAsDouble(45000.50, 5000));
    }
}
package com.javaprojektnizadatak;

import com.javaprojektnizadatak.classes.*;

import java.util.ArrayList;


public class Solid {

    public static void main(String[] args) throws Exception {

        SmallTrain smallTrain = new SmallTrain();
        BigTrain bigTrain = new BigTrain();

        Employee oldEmployee = new Employee(0.10, "Ivan");
        Employee newEmployee = new Employee(0.11, "Zoran");

        CashRegister cashRegister = new CashRegister();
        CashRegisterPrinter cashRegisterPrinter = new CashRegisterPrinter();

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(oldEmployee);
        employees.add(newEmployee);

        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        Bus bus3 = new Bus();
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Truck truck3 = new Truck();
        Van van1 = new Van();
        Van van2 = new Van();
        Van van3 = new Van();

        smallTrain.LoadTrain(car1);
        oldEmployee.employeeChargeFuel(car1);
        oldEmployee.employeeChargeTickets(car1.chargeFee);

        smallTrain.LoadTrain(car2);
        oldEmployee.employeeChargeFuel(car2);
        oldEmployee.employeeChargeTickets(car2.chargeFee);

        bigTrain.LoadTrain(truck1);
        newEmployee.employeeChargeFuel(truck1);
        newEmployee.employeeChargeTickets(truck1.chargeFee);

        bigTrain.LoadTrain(bus1);
        newEmployee.employeeChargeFuel(bus1);
        newEmployee.employeeChargeTickets(bus1.chargeFee);

        cashRegister.getCashFromEmployees(oldEmployee);
        cashRegister.getCashFromEmployees(newEmployee);
        cashRegisterPrinter.printEmployeePay(employees);

        cashRegisterPrinter.printTotalTicketSales(cashRegister.TotalTicketSalesEarnings);
    }
}

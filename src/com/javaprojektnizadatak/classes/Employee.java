package com.javaprojektnizadatak.classes;

import com.javaprojektnizadatak.interfaces.CalculatePay;
import com.javaprojektnizadatak.interfaces.ChargeFuel;
import com.javaprojektnizadatak.interfaces.ChargeTickets;
import com.javaprojektnizadatak.utils.NumberGenerator;

public class Employee implements ChargeFuel, ChargeTickets, CalculatePay {
    public double PayCheckRange;
    public double TotalPay;
    public double PayCheck;
    public String Name;

    CashRegister cashRegister = new CashRegister();
    NumberGenerator numberGenerator = new NumberGenerator();

    public Employee(double payCheckRange, String name) {
        Name = name;
        PayCheckRange = payCheckRange;
        TotalPay = 0;
    }

    @Override
    public void employeeChargeFuel(Vehicle vehicle) {
        checkFuel(vehicle);
        if (vehicle.Fuel < 0.10) {
            vehicle.Fuel = 1;
            System.out.println("Napunjeno gorivo do " + numberGenerator.toPercentage(vehicle.Fuel));
        } else {
            System.out.println("Gorivo/bateriju nije potrebno puniti");
        }
    }

    @Override
    public void checkFuel(Vehicle vehicle) {
        System.out.println("Trenutno stanje goriva: " + numberGenerator.toPercentage(vehicle.Fuel));
    }

    @Override
    public void employeeChargeTickets(double fee) {
        TotalPay = fee += TotalPay;
        calculatePayFromTickets(fee);
        cashRegister.TotalTicketSales = fee;
    }

    @Override
    public void calculatePayFromTickets(double fee) {
        PayCheck = fee * PayCheckRange;
    }


}

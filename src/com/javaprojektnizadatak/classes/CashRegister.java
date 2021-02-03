package com.javaprojektnizadatak.classes;

import com.javaprojektnizadatak.interfaces.CashRegisterCalculator;

public class CashRegister implements CashRegisterCalculator {
    public double TotalTicketSalesEarnings;
    public static double TotalTicketSales;

    public CashRegister() {
        TotalTicketSalesEarnings = 0;
        TotalTicketSales = 0;
    }

    @Override
    public void getCashFromEmployees(Employee employee) {
        TotalTicketSalesEarnings += employee.TotalPay;
    }
}

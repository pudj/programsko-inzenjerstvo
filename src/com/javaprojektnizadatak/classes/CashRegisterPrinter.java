package com.javaprojektnizadatak.classes;

import com.javaprojektnizadatak.interfaces.Printer;
import com.javaprojektnizadatak.utils.NumberGenerator;

import java.util.ArrayList;

public class CashRegisterPrinter implements Printer {

    NumberGenerator numberGenerator = new NumberGenerator();


    @Override
    public void print(String text) {
        System.out.println(text);
    }

    public void printTotalTicketSales(double totalEarnings) {
        String ticketSalesToString = numberGenerator.toString(CashRegister.TotalTicketSales);
        print("Ukupan iznos prodaje karata iznosi " + ticketSalesToString + " kn.");
    }

    public void printEmployeePay(ArrayList<Employee> employees){
        double employeePayTotal = 0;
        String employeePayTotalStringified;
        String employeePay;
        for (Employee employee:employees
             ) {
            employeePayTotal += employee.PayCheck;
            employeePay = numberGenerator.toString(employee.PayCheck);
            print("Plaća zaposlenika " + employee.Name + " iznosi " + employeePay + " kn.");
        }
        employeePayTotalStringified = numberGenerator.toString(employeePayTotal);
        print("Plaća svih zaposlenika iznosi " + employeePayTotalStringified + " kn.");
    }
}

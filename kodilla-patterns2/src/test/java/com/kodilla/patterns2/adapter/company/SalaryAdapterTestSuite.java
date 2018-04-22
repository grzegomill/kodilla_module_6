package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SalaryAdapterTestSuite {


    @Test
    public void testTotalSalary() {
        //Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();

        //When
        double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(), workers.getSalaries());


        //Then
        System.out.println("Total salary:" + totalSalary);
        assertEquals(totalSalary, 27750, 0);

    }
}

package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        johnSmith.getCompanies().add(softwareMachine);

        dataMaesters.getEmployees().add(stephanieClarckson);
        stephanieClarckson.getCompanies().add(dataMaesters);

        dataMaesters.getEmployees().add(lindaKovalsky);
        lindaKovalsky.getCompanies().add(dataMaesters);

        greyMatter.getEmployees().add(johnSmith);
        johnSmith.getCompanies().add(greyMatter);

        greyMatter.getEmployees().add(lindaKovalsky);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();

        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();

        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        List<Employee> employees = employeeDao.findEmployesByLastName("SMITH");

        List<Company> companies = companyDao.findCompaniesByThreeFristChars("SOF");

        //Then
        assertEquals(1, employees.size());
        assertEquals("John Smith", employees.get(0).getFirstname() + " " + employees.get(0).getLastname());

        assertEquals(1, companies.size());
        assertEquals("Software Machine", companies.get(0).getName());

        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
//
//            employeeDao.delete(johnSmith);
//            employeeDao.delete(stephanieClarckson);
//            employeeDao.delete(lindaKovalsky);

        } catch (Exception e) {
            //do nothing
        }
    }
}
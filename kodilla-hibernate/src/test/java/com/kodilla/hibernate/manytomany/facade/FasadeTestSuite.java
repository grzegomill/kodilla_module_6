package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static junit.framework.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FasadeTestSuite {

    @Autowired
    Facade facade;

    @Autowired
    CompanyDao companyDao;


    @Test
    public void facadeTest() {

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaGtapth = new Employee("Linda", "Gtapth");

        Company softwareMachine = new Company("Software Machine");
        Company datawareMaesters = new Company("Dataware Maesters");
        Company greywarMatter = new Company("Greywar Matter");

        softwareMachine.getEmployees().add(johnSmith);
        johnSmith.getCompanies().add(softwareMachine);

        datawareMaesters.getEmployees().add(stephanieClarckson);
        stephanieClarckson.getCompanies().add(datawareMaesters);

        datawareMaesters.getEmployees().add(lindaGtapth);
        lindaGtapth.getCompanies().add(datawareMaesters);

        greywarMatter.getEmployees().add(johnSmith);
        johnSmith.getCompanies().add(greywarMatter);

        greywarMatter.getEmployees().add(lindaGtapth);
        lindaGtapth.getCompanies().add(greywarMatter);

        companyDao.save(softwareMachine);
        companyDao.save(datawareMaesters);
        companyDao.save(greywarMatter);

        //When

        List<Employee> employeesWithTH = facade.getEmployes("th");

        List<Employee> employeesWithLAR = facade.getEmployes("lar");

        List<Company> companiesWithWARE = facade.getCompanies("ware");

        List<Company> companiesWithMA = facade.getCompanies("Ma");


        //Then

        assertEquals(1, employeesWithLAR.size());

        assertEquals(2, employeesWithTH.size());

        assertEquals(2, companiesWithWARE.size());

        assertEquals(3, companiesWithMA.size());

        //CleanUp
        try {
            companyDao.delete(softwareMachine);
            companyDao.delete(datawareMaesters);
            companyDao.delete(greywarMatter);


        } catch (Exception e) {
            //do nothing
        }
    }


}

package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;


    public List<Employee> getEmployes(String partLastName) {
        return employeeDao.findEmployesLikeByLastName("%" + partLastName + "%");
    }

    public List<Company> getCompanies(String partName) {
        return companyDao.findCompaniesLikeByName("%" + partName + "%");
    }

}


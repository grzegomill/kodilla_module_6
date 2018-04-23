package com.kodilla.hibernate.manytomany;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.findCompaniesByThreeFristChars",
        query = "SELECT * FROM companies " +
                "WHERE upper(substr(company_name,1, 3))=:FIRST3CHARS",
        resultClass = Company.class
)

@NamedQueries(
        {
                @NamedQuery(name = "Company.findCompaniesLikeByName",
                        query = "FROM Company WHERE Upper(company_name) like :PART_NAME")
        }
)


@Entity
@Table(name = "COMPANIES")

public class Company {

    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

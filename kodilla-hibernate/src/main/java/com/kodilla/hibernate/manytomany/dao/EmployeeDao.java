package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    List<Employee> findEmployesByLastName(@Param("LAST_NAME") String last_name);

    List<Employee> findEmployesLikeByLastName(@Param("PART_LAST_NAME") String part_last_name);
}

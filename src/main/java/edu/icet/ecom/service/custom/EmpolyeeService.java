package edu.icet.ecom.service.custom;

import edu.icet.ecom.DTO.Employee;
import edu.icet.ecom.service.SuperService;

import java.sql.SQLException;

public interface EmpolyeeService extends SuperService {
    Boolean addEmployee(Employee employee) throws SQLException;
}

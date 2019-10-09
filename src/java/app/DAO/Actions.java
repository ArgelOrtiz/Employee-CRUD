package app.DAO;

import app.Models.Employee;
import java.sql.SQLException;
import java.util.ArrayList;

public interface Actions {
    public boolean createEmploye(Employee e) throws SQLException;
    public boolean updateEmploye(String id, Employee e) throws SQLException;
    public boolean deleteEmploye(String id) throws SQLException;
    public Employee getEmploye(String id) throws SQLException;
    public ArrayList<Employee> getEmplloyees() throws SQLException;
}
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Load the Driver...");

		try {
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/sapientdemodb",
							"root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection Created...");
		return con;
	}

	public boolean addEmployee(Employee emp) {
		
		Connection con = getConnection();
		ResultSet rs =null;
		int result = 0;
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("insert into employee values(?,?,?)");
			stmt.setInt(1, emp.getId());
			stmt.setString(2, emp.getName());
			stmt.setDouble(3, emp.getSalary());
			result = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		System.out.println("Inserted to DB...");
		if(result>0)
			return true;
		return false;

	}

	public List<Employee> fetchEmployeesBySalary(double salary) {
		Connection con = getConnection();
		ResultSet rs = null;
		List<Employee> employees = new ArrayList<>();
		int result = 0;
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("select * from Employee where salary>?");
			stmt.setDouble(1, salary);
			
			rs = stmt.executeQuery();
			
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double sal = rs.getDouble("salary");
				
				Employee emp = new Employee(id,name,sal);
				employees.add(emp);
				
			}
			
			
		}
		catch(Exception e){
			
		}
		finally{
			try {
				stmt.close();
				rs.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return employees;
	}

}


public class Department {

	public static void main(String[] args) {
		
		String deptNo = args[0];
		
		switch(deptNo){
		case "1" : System.out.println("Networking department");
					break;
		case "2" : System.out.println("Accounts department");
					break;
		case "3" : System.out.println("Admin department");
					break;
			default: System.out.println("No department like this");
		
		}

	}

}

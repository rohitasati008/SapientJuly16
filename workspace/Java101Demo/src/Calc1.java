
public class Calc1 {

	public static void main(String[] args) {

        int op1 = Integer.parseInt(args[0]);
        int op2 = Integer.parseInt(args[1]);
        String operationName = args[2];

        if(operationName.equals("+")){
        	add(op1, op2);
        }
        
        if(operationName.equals("-")){
       	 int result = op1 - op2;
       	 System.out.println("Subtraction Result is " + result);
       }
       
       

	}
	
	public static void add(int op1, int op2){
		 int result = op1 + op2;
    	 System.out.println("Addition Result is " + result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

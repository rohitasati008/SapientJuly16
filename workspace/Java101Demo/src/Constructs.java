public class Constructs {
	public static void main(String[] args) {
		
		String names[] = {"Amit", "Ravi", "Priya"};
		
		for(int i=0;i<names.length;i++){
	
			if(names[i].equals("Ravi")){
				continue;
			}
			System.out.println(names[i]);
		}
		

	}
}

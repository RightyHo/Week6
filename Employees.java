public class Employees {
	private String[] name;
	private int[] id;
	public Employees(){
		name = new String[10];
		id = new int[10];
	}
	public void setName(String s,int index){
		name[index] = s;
		return;
	}
	public void setID(int idNumber,int index){
		id[index] = idNumber;
		return;
	}
	public String getName(int index){
		return name[index];
	}
	public int getID(int index){
		return id[index];
	}

	public static void main(String[] args){
		Employees emp = new Employees();
		for(int i=0;i<10;i++){
			System.out.println("Please key in employee name: ");
			String str = System.console().readLine();
			System.out.println("Please key in employee ID: ");
			String sID = System.console().readLine();	
			int idNum = Integer.parseInt(sID); 		
			emp.setName(str,i);
			emp.setID(idNum,i);
		}
		System.out.println("Employees with ID numbers smaller than 1,000: ");
		for(int i=0;i<10;i++){
			if(emp.getID(i) < 1000){
				System.out.println("Name: " + emp.getName(i) + " ID: " + emp.getID(i));
			}
		}
		System.out.println("Employees with names that start with J or S: ");
		for(int i=0;i<10;i++){
			String empName = emp.getName(i);
			if(empName.charAt(0) == 'J' || empName.charAt(0) == 'S') {
				System.out.println("Name: " + emp.getName(i) + " ID: " + emp.getID(i));
			}
		}
		
	}
}
class employee{
	String name;
	int salary;
	int id;
	void person(){
	System.out.println("name is:"+ name +" salary is:" + salary+" Id is :"+ id);
	}
}

class demo{
	public static void main(String[]args){
		employee s1 = new employee();
		employee s2 = new employee();
		

		s1.name = "A";
		s1.salary = 500000;
		s1.id = 100;
		s1.person();

		s2.name = "B";
		s2.salary = 1000000;
		s2.id = 200;
		s2.person();

}
	}
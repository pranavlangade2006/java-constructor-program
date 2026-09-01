class student{
	int age;
	String name;
	
	void fun(){
		System.out.println("age is:"+ age + "name is :"+name);
	}
}

class demo{
	public static void main(String[]args){
		student s1 = new student();
		student s2 = new student();
		
		s1.age = 20;
		s1.name = "A";
		s1.fun();
	
		s2.age = 30;
		s2.name = "B";
		s2.fun();
	}
}
class Student{
	int age;
	Student(int a){
		age= a;
	}
}

class demo{
	public static void main(String[]args){
	Student s1 = new Student(10);
	System.out.println(s1.age);
	Student s2 = new Student(20);
	System.out.println(s2.age);
	}
}

class student{
	int age;
	String name;
	student(int a){
		age = a;
	}
	student(){
	}
	student(int a , String b){
		age = a;
		name = b;
	}
}

class demo{
	public static void main(String[]args){
		student s1 = new student(20);
		student s2 = new student(200);
		student s3 = new student();
		student s4 = new student(20 , "abc");

	}
}

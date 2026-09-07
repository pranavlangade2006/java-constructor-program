class student{
	int a;
	void fun(){
		System.out.println("in fun"+a);
	}
}

class demo{
	public static void main(String[]args){
		student s1 = new student(10);
		student s2 = new student(20);
		student s3 = new student(30);
		

		s1.fun();
		s2.fun();
		s3.fun();
	}
}


//constructor student in class student cannot be applied to given types;
                student s1 = new student(10);
                             ^
  required: no arguments
  found:    int
  reason: actual and formal argument lists differ in length
exp12.java:11: error: constructor student in class student cannot be applied to given types;
                student s2 = new student(20);
                             ^
  required: no arguments
  found:    int
  reason: actual and formal argument lists differ in length
exp12.java:12: error: constructor student in class student cannot be applied to given types;
                student s3 = new student(30);
                             ^
  required: no arguments
  found:    int
  reason: actual and formal argument lists differ in length
3 errors


//because we do not give constructor

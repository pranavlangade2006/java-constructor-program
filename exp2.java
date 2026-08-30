class student{
	student(){
		System.out.println("in constructor");
	}
}

class demo{
	public static void main(String[]args){
		student s1 = new student();
		student s2 = new student();
	}
}
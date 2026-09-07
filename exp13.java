class student{
	int a ;
	String name;
	student(int b){
		this.a=b;
	}
	student(int c , String name){
		a=c;
	}
	student(){

	}

	void fun(){
	System.out.println("in fun address"+this.a);

}
	}

class demo{
	public static void main(String[]args){
		student s1 = new student(10);
		student s2 = new student(20,"pranav");
		student s3 = new student();

		s1.fun();
		s2.fun();
		s3.fun();
}
	}


\\Compiled from "exp13.java"
class demo {
  demo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: new           #7                  // class student
       3: dup
       4: bipush        10
       6: invokespecial #9                  // Method student."<init>":(I)V
       9: astore_1
      10: new           #7                  // class student
      13: dup
      14: bipush        20
      16: ldc           #12                 // String pranav
      18: invokespecial #14                 // Method student."<init>":(ILjava/lang/String;)V
      21: astore_2
      22: new           #7                  // class student
      25: dup
      26: invokespecial #17                 // Method student."<init>":()V
      29: astore_3
      30: aload_1
      31: invokevirtual #18                 // Method student.fun:()V
      34: aload_2
      35: invokevirtual #18                 // Method student.fun:()V
      38: aload_3
      39: invokevirtual #18                 // Method student.fun:()V
      42: return
}

		
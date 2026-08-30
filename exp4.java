class codex{
	int a;
	void fun(){
		System.out.println(a);
	}
}

class demo{
	public static void main(String[]args){
		codex c = new codex();
		c.fun();
 		 
		codex c1 = new codex();
		c1.fun();
	}
}

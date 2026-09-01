class codex{
	int a;
	int b;
	void fun(){
	System.out.println(b);
	}
}

class demo{
	public static void main(String[]args){
		codex c= new codex();
			c.b = 56;
			c.fun();
			
		codex c1 = new codex();
			c1.a=50;
			c1.fun();
	}
}

package exception;

public class ThrowDemo {

	void m1(int a)
	{
		
		throw new Test("Int value is 5");
		
		/*
		 * if(a<=5) {
		 * 
		 * try { throw new Test("Int value is 5"); }catch(Test e) { e.printStackTrace();
		 * } }
		 */
		 
		//System.out.println(a);
	}
	public static void main(String[] args) {
		 ThrowDemo t=new ThrowDemo();
		 t.m1(2);
		 System.out.println("Hello");
	}
}
class Test extends RuntimeException{
	
	public Test(String mssg) {
		super(mssg);
	}
}

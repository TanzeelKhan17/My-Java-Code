package immutable;

public final class Immutable {

	private final int a;
	private final String name;
	private final String id;
	
	void m1() {
	System.out.println(id+" "+name+" "+a);
	}
	Immutable(int a,String name,String id){
		this.a=a;
		this.id=id;
		this.name=name;
		
		
	}
	public static void main(String[] args) {
		//Immutable i=new Immutable(110, "Tanzeel", "Khan");
		//Immutable i2=new Immutable(110, "Tanzeel", "Khan");
		//i.m1();
		String s1="Tanzeel";
		String s2=new String("Tanzeel");
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode());
	}
}

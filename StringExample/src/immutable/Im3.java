package immutable;

public class Im3 {
private final int id;
private final String name;
private final String address;

Im3(int id,String name,String address){
	this.id=id;
	this.name=name;
	this.address=address;
	System.out.println(id+" "+name+" "+address);
	
	
}
public static void main(String[]args) {
	Im3 i = new Im3(101,"kashif","Bandra west");
	String h = new String("tanzeel");
	System.out.println(i.hashCode());
	System.out.println(h);
}
}

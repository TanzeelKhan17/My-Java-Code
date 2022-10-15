package immutable;

import java.util.Objects;

final class Immutable2 {
	private final int id;
	private final String name;
	private final String state;

	Immutable2(int id, String name, String state) {
		this.id = id;
		this.name = name;
		this.state =state;
	}

	public static void main(String[] args) {
		
		
		
		Immutable2 u = new Immutable2(11, "c2", "pune");
		Immutable2 v = new Immutable2(11, "c2", "pune");
		//System.out.println(u.hashCode());
		//System.out.println(v.hashCode());
		//System.out.println(u.equals(u));
		String s1 = "hhf";
		String s2 = new String("hh");
		System.out.println(u.equals(v));
	}


	@Override
	public boolean equals(Object obj) {
		Immutable2 x=(Immutable2) obj;
		
		if(x.getId()==id && x.getName()==name && x.getState()==state) {
			return true;  }
		else return false;
		}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getState() {
		return state;
	}
	}



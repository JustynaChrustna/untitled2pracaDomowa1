
public class Airplane {
	private int passangers;
	private int wings;
	String name;
	public Airplane(String n) {
		this.name=n;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + passangers;
		result = prime * result + wings;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airplane other = (Airplane) obj;
		if (passangers != other.passangers)
			return false;
		if (wings != other.wings)
			return false;
		return true;
	}
	
	protected String protectedMethod() {
		return"protected method"+name;
	}

}

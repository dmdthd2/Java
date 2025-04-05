import java.util.Objects;

public class 학생 {
	
	String name ;
	String num ;
	int b;
	
	

	@Override
	public String toString() {
		return "학생 [name=" + name + ", num=" + num + ", b=" + b + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(b, name, num);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		학생 other = (학생) obj;
		return b == other.b && Objects.equals(name, other.name) && Objects.equals(num, other.num);
	}



	public static void main(String[] args) {
		
		학생 h =new 학생();
		
		h.b=0324;
		h.name="김은송";
		h.num="0324";
		
		학생 h1 = new 학생();
		
		h1.b=0324;
		h1.name="김은송";
		h1.num="0324";
		
		if(h.equals(h1)) {
			System.out.println("같아용");
		}else
			System.out.println("달라용");
		
		System.out.println(h.hashCode());
		System.out.println(h1.hashCode());
		System.out.println(h.toString());
		System.out.println(h1.toString());
	}

	

}

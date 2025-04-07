package Practice;
import java.util.Objects;

public class 학생 {
	
	String name;
	String num;
	int b;
	
	@Override
	public String toString() {
		return "학생 [name=" + name + ", num=" + num + ", b=" + b + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, num, b);
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
		
		학생 h1 = new 학생();
		
		h1.b=2001;
		h1.name="song";
		h1.num="6915";
		
		학생 h2 =new 학생();
		
		h2.b=2001;
		h2.name="song";
		h2.num="6915";
		
		if (h1.equals(h2) ) {
			System.out.println("같아요");
			
		}else {
		     System.out.println("달라요");
		}
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		
		System.out.println(h1);
		System.out.println(h2.toString());
		
		
	}
	

}

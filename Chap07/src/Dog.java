
public class Dog {
 public String breed;
 public String color;
 protected int age;
 private String name="강영준";
 
 
 public void bowwow() {
	 System.out.println(name+" 멍멍 짖다");
	 sleep();// 옮겨도 됨 같은 클래스 안이기 때문
 }protected void run() {
	 System.out.println("달리다");
 }private void sleep() {
	 System.out.println("코오오");
 }
 
}

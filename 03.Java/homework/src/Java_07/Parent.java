package Java_07;

public class Parent {
	
	
	private String nation;

	public Parent() {
		this("대한민국");
		System.out.println("Parent() Call");
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}

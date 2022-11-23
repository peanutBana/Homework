package java_10;

public class FileWriterExample {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("text.txt")){
			fw.write("Java");
		} catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}

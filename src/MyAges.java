import javax.swing.JOptionPane;

public class MyAges {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Type how old you'll be after your next birthday.");
	int age = Integer.parseInt(answer);
	for (int i = 0; i < age; i++) {
		System.out.println(i);
		
	}
}
}

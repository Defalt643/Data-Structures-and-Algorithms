package Week1_02;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
public class testStudent {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ArrayList<Student> s= new ArrayList<>();
		int count=0;
		
		for(;;) {
			count+=1;
			String id=kb.next();
			if(id.equals("-1")) {
				break;
			}String name=kb.next();
			double gpa=kb.nextDouble();
			if(count==1) {
				s.add(new Student(id,name,gpa));
			}else {
				int c=0;
				for(int i =0;i<s.size();i++) {
					if(id.equals(s.get(i).getId())) {
						c=-1;
					}
				}
				if(c==0) {
					s.add(new Student(id,name,gpa));
				}
			}
		}for(int i =0;i<s.size();i++) {
			DecimalFormat df = new DecimalFormat("#.##");
			df.setMinimumFractionDigits(2);
			String formatted = df.format(s.get(i).gpa); 
			System.out.println(s.get(i).toString()+formatted);
		}
	}
}

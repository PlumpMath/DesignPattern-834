package dp.actional.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class VisitorMain {

	public static void main(String[] args) {
		CollegeVisitor collegeVisitor = new CollegeVisitor();
		CompanyVisitor companyVisitor = new CompanyVisitor();
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Undergraduate("zhang san", 75, 90, 85));
		list.add(new Undergraduate("li si", 90, 90, 90));
		list.add(new Graduate("wang wu", 76, 90));
		list.add(new Graduate("zhao liu", 90, 90));
		
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			student.accept(collegeVisitor);
			student.accept(companyVisitor);
		}
	}

}

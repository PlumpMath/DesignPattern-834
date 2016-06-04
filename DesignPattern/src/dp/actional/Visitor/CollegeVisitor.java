package dp.actional.Visitor;

public class CollegeVisitor implements Visitor{

	@Override
	public void visit(Graduate student) {
		double math = student.getMath();
		double english = student.getEnglish();
		if(math > 80 && english > 80)
			System.out.println("研究生：" + student.getName() + "被高校录用 ...");
		else 
			System.out.println("研究生：" + student.getName() + "未被高校录用 ...");
	}

	@Override
	public void visit(Undergraduate student) {
		double math = student.getMath();
		double english = student.getEnglish();
		double physics = student.getPhysics();
		if(math > 80 && english > 80 && physics > 80)
			System.out.println("本科生：" + student.getName() + "被高校录用 ...");
		else 
			System.out.println("本科生：" + student.getName() + "未被高校录用 ...");
	}

}

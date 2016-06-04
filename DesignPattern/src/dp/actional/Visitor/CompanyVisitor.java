package dp.actional.Visitor;

public class CompanyVisitor implements Visitor{

	@Override
	public void visit(Graduate student) {
		double math = student.getMath();
		double english = student.getEnglish();
		if(math > 80 && english > 80)
			System.out.println("�о�����" + student.getName() + "����˾¼�� ...");
	}

	@Override
	public void visit(Undergraduate student) {
		double math = student.getMath();
		double english = student.getEnglish();
		double physics = student.getPhysics();
		if(math > 80 && english > 80 && physics > 80)
			System.out.println("��������" + student.getName() + "����˾¼�� ...");
	}

}

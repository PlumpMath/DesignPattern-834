package dp.structural.Prototype;

/**
 * ԭ��ģʽ��Prototype Pattern�������ڴ����ظ��Ķ���ͬʱ���ܱ�֤���ܡ�
 * �������͵����ģʽ���ڴ�����ģʽ�����ṩ��һ�ִ����������ѷ�ʽ��
 * ����ģʽ��ʵ����һ��ԭ�ͽӿڣ��ýӿ����ڴ�����ǰ����Ŀ�¡��
 * ��ֱ�Ӵ�������Ĵ��۱Ƚϴ�ʱ�����������ģʽ��
 * 
 * ���磬һ��������Ҫ��һ���ߴ��۵����ݿ����֮�󱻴�����
 * ���ǿ��Ի���ö�������һ������ʱ�������Ŀ�¡������Ҫ��ʱ��������ݿ⣬
 * �Դ����������ݿ���á�
 * 
 * ���ǽ�����һ�������� Shape ����չ�� Shape ���ʵ���ࡣ
 * ��һ���Ƕ����� ShapeCache������� shape ����洢��һ�� Hashtable �У�
 * ���������ʱ�򷵻����ǵĿ�¡��
 * @author Administrator
 *
 */

public class PrototypeMain {
	public static void main(String[] args) {
		ShapeCache.loadCache();
		Shape shape = ShapeCache.getShape("circle");
		shape.info();
		
		shape = ShapeCache.getShape("rectangle");
		shape.info();
		
		shape = ShapeCache.getShape("square");
		shape.info();
		
		shape = (Shape) shape.clone();
		shape.info();
	}
}

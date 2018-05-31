package yangmtou.module.singleton;

/**
 * ����ģʽ��---����ģʽ---�������Ϊ��������ʵ��֮ǰ
 * 1���̲߳���ȫ��
 * 2����������ٶȿ죬��ȡ������ٶ���
 * @author yangmtou
 *
 */
public class Singleton2 {

	private Singleton2(){
		
	}
	
	private static Singleton2 instance;
	public static Singleton2 getInstance(){
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}

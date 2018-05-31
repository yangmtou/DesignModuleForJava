package yangmtou.module.singleton;

/**
 * ����ģʽ---����ģʽ----�������Ϊ��ʵ�����ڵ���֮ǰ 
 * 1������ģʽ���̰߳�ȫ
 * 2������ģʽ������ʱ�Ƚ�������ȡ�����ʱ��ȽϿ�
 * @author yangmtou
 *
 */
public class Singleton {
	private Singleton(){
		
	}
	
	private static Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}
}

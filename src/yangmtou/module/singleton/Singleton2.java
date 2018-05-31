package yangmtou.module.singleton;

/**
 * 单例模式的---懒汉模式---可以理解为调用早于实例之前
 * 1、线程不安全的
 * 2、加载类的速度快，获取对象的速度慢
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

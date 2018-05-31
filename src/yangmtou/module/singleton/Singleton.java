package yangmtou.module.singleton;

/**
 * 单例模式---饿汉模式----可以理解为：实例早于调用之前 
 * 1、饿汉模式是线程安全
 * 2、饿汉模式加载类时比较慢，获取对象的时候比较快
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

package yangmtou.module.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		if (singleton1 == singleton2) {
			System.out.println("singleton1��singleton2��һ��ʵ��");
		}else{
			System.out.println("singleton1��singleton2����һ��ʵ��");
		}
		
		Singleton2 singleton21 = Singleton2.getInstance();
		Singleton2 singleton22 = Singleton2.getInstance();
		if (singleton21 == singleton22) {
			System.out.println("singleton21��singleton22��һ��ʵ��");
		}else{
			System.out.println("singleton21��singleton22����һ��ʵ��");
		}
		
	}
}

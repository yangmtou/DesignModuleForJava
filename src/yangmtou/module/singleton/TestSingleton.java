package yangmtou.module.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		if (singleton1 == singleton2) {
			System.out.println("singleton1和singleton2是一个实例");
		}else{
			System.out.println("singleton1和singleton2不是一个实例");
		}
		
		Singleton2 singleton21 = Singleton2.getInstance();
		Singleton2 singleton22 = Singleton2.getInstance();
		if (singleton21 == singleton22) {
			System.out.println("singleton21和singleton22是一个实例");
		}else{
			System.out.println("singleton21和singleton22不是一个实例");
		}
		
	}
}

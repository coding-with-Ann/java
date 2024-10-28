package TechM;

public class Botq {
	public static void main(String[] args) {
		TestClass [] t = new TestClass[5];
		for(Integer i=0; i<5; i++) {
			t[i] = new TestClass();
		}
		System.out.println(TestClass.getNumOfInstances());
	}

}


import java.io.FileWriter;
import java.io.IOException;

// method와 variable을 모아 class로 그루핑, 정리정돈
// '클래스.함수or변수' 의 형태로 사용한다


public class OthersOOP {

	public static void main(String[] args) throws IOException {

		// class : System, Math, FileWriter
		// instance : f1, f2
		
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		// Math.PI 와 같이 내부적으로 어떤 상태를 유지할 필요가 없는 애들,
		// 즉, 일회용으로 쓰이는 애들은 클래스를 그대로, 직접 사용해도 괜찮다.
		
		
		// 하지만 아래와 같이 긴 맥락으로 쓰이고, 
		// 내부적으로 값이 저장될 필요가 있는 애들은 
		// 복제본을 만들어서 제어한다.
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write(" JAVA");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write(" JAVA2");
		f2.close();
 
	}

}

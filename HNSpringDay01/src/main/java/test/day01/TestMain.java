/**
 * 
 * <pre>
 * 1. 프로젝트명	: HNSpringDay01
 * 2. 패키지명		: test.day01
 * 3. 파일명		: TestMain.java
 * 4. 작성일		: 2016. 9. 29.
 * 5. 작성자		: sjc0502
 * 6. 설명			: 
 * </pre>
 */
package test.day01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.day01.controller.MyController;
import test.day01.dao.impl.OracleDao;

public class TestMain {

	/**
	 * 
	 * @메소드명	main
	 * @작성자		sjc0502
	 * @작성일		2016. 9. 29.
	 * @param   	
	 * @return		
	 * @설명 		
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "/test/day01/DITest_dao.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(res);
		
		//	spring 은 기본적으로 싱글턴으로 객체를 생성
		MyController controller = (MyController)context.getBean("controller");

		controller.select("HUNET");
		controller.delete("HUNET");
		controller.update("HUNET");
		controller.insert("HUNET");
		
		
		/*MyController controller1 = (MyController)context.getBean("controller");

		//	아래 두객체는 같은 객체 임 기본 싱글턴 이기때문..
		System.out.println("controller  : "+controller);
		System.out.println("controller1 : "+controller1);*/		

		//	Bean 설정파일에서 scope="prototype" 옵션을 주었으므로 객체를
		//	사용할떄마다 객체를 계속 생성한다. 아래 두객체는 다른 객체
		/*OracleDao oracle = (OracleDao)context.getBean("oracleDao");
		System.out.println("oracle : "+oracle);
		OracleDao oracle1 = (OracleDao)context.getBean("oracleDao");
		System.out.println("oracle : "+oracle1);*/
	}

}

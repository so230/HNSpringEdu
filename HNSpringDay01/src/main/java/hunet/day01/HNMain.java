/**
 * 
 * <pre>
 * 1. 프로젝트명	: HNSpringDay01
 * 2. 패키지명		: hunet.day01
 * 3. 파일명		: HNMain.java
 * 4. 작성일		: 2016. 9. 29.
 * 5. 작성자		: sjc0502
 * 6. 설명			: 
 * </pre>
 */
package hunet.day01;


import hunet.day01.controller.IPhoneController;
import hunet.day01.controller.PhoneController;
import hunet.day01.dao.CommonBattery;
import hunet.day01.dao.impl.NomalBattery;
import hunet.day01.dao.impl.RapidBattery;
import hunet.day01.service.CommonPhone;
import hunet.day01.service.impl.Galaxy3;
import hunet.day01.service.impl.GalaxyNote7;
import hunet.day01.service.impl.IPhone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HNMain {

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
		CommonBattery battery;
		
		String res = "/hunet/day01/DITest_battery.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(res);		
		
		PhoneController controller = (PhoneController)context.getBean("controller");
		Galaxy3 gal3 = (Galaxy3)context.getBean("gal3");
		//controller.call();
		//controller.charge();
		
		
		//세월이 흘러 갤3를 급속 충전하고 싶어짐.		
		//battery = new NomalBattery();
		battery = new RapidBattery();		
		
		gal3.setBattery(battery);
		controller.call();
		controller.charge();
		
		//갤7는 주기적으로 폭탄
		GalaxyNote7 galNote7 = (GalaxyNote7)context.getBean("galNote7");
		battery = new NomalBattery();
		galNote7.setBattery(battery);
		controller.setPhone(galNote7);
		controller.call();
		controller.charge();
		
		//IPhoneController를 따로 두는 방법
		IPhoneController controller1 = (IPhoneController)context.getBean("iphoneController");
		//System.out.println("controller  : " + controller);
		//System.out.println("controller1 : " + controller1);
		//System.out.println();
		
		IPhone iphone = (IPhone)context.getBean("IPhone");
		controller1.setPhone(iphone);
		
		//controller.call();
		controller1.call();		
		controller1.loadAppStore();
		
		
	}

}

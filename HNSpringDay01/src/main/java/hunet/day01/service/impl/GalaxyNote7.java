/**
 * 
 * <pre>
 * 1. 프로젝트명	: HNSpringDay01
 * 2. 패키지명		: hunet.day01.service.impl
 * 3. 파일명		: GalaxyNote7.java
 * 4. 작성일		: 2016. 9. 29.
 * 5. 작성자		: sjc0502
 * 6. 설명			: 
 * </pre>
 */
package hunet.day01.service.impl;

import hunet.day01.dao.CommonBattery;
import hunet.day01.service.CommonPhone;

public class GalaxyNote7 implements CommonPhone{
	private CommonBattery battery;
	
	public GalaxyNote7() {}

	
	public GalaxyNote7(CommonBattery battery) {		
		this.battery = battery;
	}

	public void setBattery(CommonBattery battery) {
		this.battery = battery;
	}

	/**
	 * 
	 * @메소드명	call
	 * @작성자		sjc0502
	 * @작성일		2016. 9. 29.
	 * @param   	
	 * @return		
	 * @설명 		
	 */
	@Override
	public void call(String data) {
		// TODO Auto-generated method stub
		System.out.println(data + "를 이용하여 전화");
	}


	/**
	 * 
	 * @메소드명	charge
	 * @작성자		sjc0502
	 * @작성일		2016. 9. 29.
	 * @param   	
	 * @return		
	 * @설명 		
	 */
	@Override
	public void charge(String data) {
		// TODO Auto-generated method stub
		battery.charge(data);
	}


	/**
	 * 
	 * @메소드명	getName
	 * @작성자		sjc0502
	 * @작성일		2016. 9. 29.
	 * @param   	
	 * @return		
	 * @설명 		
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Galaxy Note 7";
	}

}

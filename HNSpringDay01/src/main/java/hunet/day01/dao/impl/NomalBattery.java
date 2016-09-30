/**
 * 
 * <pre>
 * 1. 프로젝트명	: HNSpringDay01
 * 2. 패키지명		: hunet.day01.dao.impl
 * 3. 파일명		: NomalBattery.java
 * 4. 작성일		: 2016. 9. 29.
 * 5. 작성자		: sjc0502
 * 6. 설명			: 
 * </pre>
 */
package hunet.day01.dao.impl;

import hunet.day01.dao.CommonBattery;

public class NomalBattery implements CommonBattery{

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
		System.out.println("NomalBattery을 이용하여 " + data + " 를 충전");
	}

}

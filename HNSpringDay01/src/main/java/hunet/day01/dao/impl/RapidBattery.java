/**
 * 
 * <pre>
 * 1. 프로젝트명	: HNSpringDay01
 * 2. 패키지명		: hunet.day01.dao.impl
 * 3. 파일명		: BombBattery.java
 * 4. 작성일		: 2016. 9. 29.
 * 5. 작성자		: sjc0502
 * 6. 설명			: 
 * </pre>
 */
package hunet.day01.dao.impl;

import java.util.Random;

import hunet.day01.dao.CommonBattery;

public class RapidBattery implements CommonBattery{

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
		Random r = new Random();	
		
		System.out.println("RapidBattery을 이용하여 " + data + " 를 급속!! 충전");
		if(data.equals("Galaxy Note 7")) {
			
			if(r.nextInt(2)==1) {
				System.out.println("RapidBattery을 이용하여 충전 중 " + data + " Bomb!!!");
			}	
		}
	}
	

}

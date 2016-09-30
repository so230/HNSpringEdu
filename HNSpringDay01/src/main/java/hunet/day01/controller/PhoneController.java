/**
 * 
 * <pre>
 * 1. 프로젝트명	: HNSpringDay01
 * 2. 패키지명		: hunet.day01.controller
 * 3. 파일명		: PhoneController.java
 * 4. 작성일		: 2016. 9. 29.
 * 5. 작성자		: sjc0502
 * 6. 설명			: 
 * </pre>
 */
package hunet.day01.controller;

import hunet.day01.service.CommonPhone;

public class PhoneController {
	private CommonPhone phone;
	
	public PhoneController(){}
	
	public PhoneController(CommonPhone phone){
		this.phone = phone;
	}

	public void setPhone(CommonPhone phone) {
		System.out.println("[sjc]>>>>>>[" + "PhoneController]");
		this.phone = phone;
	}
	
	public void call(){
		phone.call(phone.getName());
	}
	
	public void charge(){
		phone.charge(phone.getName());
	}

}

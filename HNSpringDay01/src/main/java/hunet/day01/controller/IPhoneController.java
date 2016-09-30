/**
 * 
 * <pre>
 * 1. 프로젝트명	: HNSpringDay01
 * 2. 패키지명		: hunet.day01.controller
 * 3. 파일명		: IphoneController.java
 * 4. 작성일		: 2016. 9. 29.
 * 5. 작성자		: sjc0502
 * 6. 설명			: 
 * </pre>
 */
package hunet.day01.controller;


import hunet.day01.service.CommonPhone;
import hunet.day01.service.impl.IPhone;

public class IPhoneController extends PhoneController{
	private IPhone iphone;
	
	public IPhoneController(){
		System.out.println("[sjc]>>>>IPhoneController>>[" + "]");
	}

	public IPhoneController(IPhone iphone) {
		this.iphone = iphone;
	}

	public void setIphone(IPhone iphone) {
		this.iphone = iphone;
	}
	
	public void setPhone(IPhone iphone) {
		System.out.println("[sjc]>>>>>>[" + "setPhone]");
		this.iphone = iphone;
	}

	public void loadAppStore(){
		iphone.loadAppStore();
	}
	
	public void call(){
		System.out.println("[sjc]>>>여기서 재정의>>>[" + "]");
	}
	
	
}

/**
 * 
 * <pre>
 * 1. 프로젝트명	: HNSpringDay01
 * 2. 패키지명		: hunet.day01.service
 * 3. 파일명		: CommonPhone.java
 * 4. 작성일		: 2016. 9. 29.
 * 5. 작성자		: sjc0502
 * 6. 설명			: 
 * </pre>
 */
package hunet.day01.service;

public interface CommonPhone {
	public String getName();
	
	public void call(String data);
	
	public void charge(String data);
}

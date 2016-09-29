/**
 * 
 * <pre>
 * 1. 프로젝트명	: HNSpringDay01
 * 2. 패키지명		: test.day01.controller
 * 3. 파일명		: MyController.java
 * 4. 작성일		: 2016. 9. 29.
 * 5. 작성자		: sjc0502
 * 6. 설명			: 
 * </pre>
 */
package test.day01.controller;

import test.day01.dao.CommonDao;

public class MyController {
	//	다형성을 이용
	private CommonDao dao;// = new OracleDao();
	
	public MyController(){}
	
	//	스프링이 생성한 객체를 주입받아야 함. 생성자 방식
	public MyController(CommonDao dao) {
		this.dao = dao;
	}

	//	스프링이 생성한 객체를 주입받아야 함. setter 방식
	public void setDao(CommonDao dao) {
		this.dao = dao;
	}	

	public void insert(String data) {
		dao.insert(data);
	}

	public void delete(String data) {
		dao.delete(data);
	}

	public void update(String data) {
		dao.update(data);
	}

	public void select(String data) {
		dao.select(data);
	}
}

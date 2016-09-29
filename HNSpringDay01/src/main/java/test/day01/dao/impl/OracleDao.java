/**
 * 
 * <pre>
 * 1. 프로젝트명	: HNSpringDay01
 * 2. 패키지명		: test.day01.dao.impl
 * 3. 파일명		: OracleDao.java
 * 4. 작성일		: 2016. 9. 29.
 * 5. 작성자		: sjc0502
 * 6. 설명			: 
 * </pre>
 */
package test.day01.dao.impl;

import test.day01.dao.CommonDao;

public class OracleDao implements CommonDao{

	/**
	 * 
	 * @메소드명	insert
	 * @작성자		sjc0502
	 * @작성일		2016. 9. 29.
	 * @param   	
	 * @return		
	 * @설명 		
	 */
	@Override
	public void insert(String data) {
		// TODO Auto-generated method stub
		System.out.println("oracle을 이용하여 "+data+" 를 추가");
	}

	/**
	 * 
	 * @메소드명	update
	 * @작성자		sjc0502
	 * @작성일		2016. 9. 29.
	 * @param   	
	 * @return		
	 * @설명 		
	 */
	@Override
	public void update(String data) {
		// TODO Auto-generated method stub
		System.out.println("oracle을 이용하여 "+data+" 를 수정");
	}

	/**
	 * 
	 * @메소드명	delete
	 * @작성자		sjc0502
	 * @작성일		2016. 9. 29.
	 * @param   	
	 * @return		
	 * @설명 		
	 */
	@Override
	public void delete(String data) {
		// TODO Auto-generated method stub
		System.out.println("oracle을 이용하여 "+data+" 를 삭제");
	}

	/**
	 * 
	 * @메소드명	select
	 * @작성자		sjc0502
	 * @작성일		2016. 9. 29.
	 * @param   	
	 * @return		
	 * @설명 		
	 */
	@Override
	public void select(String data) {
		// TODO Auto-generated method stub
		System.out.println("oracle을 이용하여 "+data+" 를 조회");
	}

}

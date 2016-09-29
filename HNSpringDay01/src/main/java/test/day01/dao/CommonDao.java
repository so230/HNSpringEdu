/**
 * 
 * <pre>
 * 1. 프로젝트명	: HNSpringDay01
 * 2. 패키지명		: test.day01.dao
 * 3. 파일명		: CommonDao.java
 * 4. 작성일		: 2016. 9. 29.
 * 5. 작성자		: sjc0502
 * 6. 설명			: 
 * </pre>
 */
package test.day01.dao;

public interface CommonDao { 

	public void insert(String data);

	public void update(String data);

	public void delete(String data);

	public void select(String data);
}

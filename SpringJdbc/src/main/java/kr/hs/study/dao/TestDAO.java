package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

// 실제 쿼리 작성
@Component
public class TestDAO {
	
	// jdbcTemplate 자동 주입
	@Autowired
	private JdbcTemplate db;
	
	// 1. insert
	public void insert_data(TestBean bean) {
		// container에 있는 TestBean의 객체가 bean에 자동주입됨
		String sql = "insert into testJdbc values(?, ?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}
	
	// 2. update
	public void update_data(TestBean bean) {
		String sql = "update testJdbc set data2=? where data1=?";
		db.update(sql, bean.getData2(), bean.getData1());
	}
	
	// 3. delete
	public void delete_data(int data1) {
		String sql = "delete from testJdbc where data1=?";
		db.update(sql, data1);
	}
	
}

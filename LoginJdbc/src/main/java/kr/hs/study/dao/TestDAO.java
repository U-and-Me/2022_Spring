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
	
	// insert
	public void insert_data(TestBean bean) {
		String sql = "insert into login values(?, ?, ?)";
		db.update(sql, bean.getUserid(), bean.getUserpass(), bean.getUsername());
	}

}

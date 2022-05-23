package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

// ���� ���� �ۼ�
@Component
public class TestDAO {
	
	// jdbcTemplate �ڵ� ����
	@Autowired
	private JdbcTemplate db;
	
	@Autowired
	MapperClass mapper;
	// => �����̳ʿ� �ִ� MapperClass bean�� ã�Ƽ� mapper�� �ڵ����� ���Խ��Ѷ�
	
	// 1. insert
	public void insert_data(TestBean bean) {
		// container�� �ִ� TestBean�� ��ü�� bean�� �ڵ����Ե�
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
	
	// 4. select
	public List<TestBean> select_data() {
		String sql = "select * from testJdbc";
		List<TestBean> list = db.query(sql, mapper);
		
		return list;
	}
}

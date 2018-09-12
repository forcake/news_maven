package test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import bean.Authority;
import dao.AuthorityDao;

public class AuthorityService_Test {

	@Test
	public void getAll(){
		try {
			assertNotNull((List<Authority>)(new AuthorityDao()).getAll());
			//return (List<Authority>)(new AuthorityDao()).getAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return null;
	}

}

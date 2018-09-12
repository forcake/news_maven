package test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import bean.Authority;
import dao.AuthorityDao;
import dao.DatabaseDao;

public class AuthorityDao_Test {

	@Test
	public void getAll()throws SQLException,Exception{
		List<Authority> authorities=new ArrayList<Authority>();
		DatabaseDao databaseDao=new DatabaseDao();
		databaseDao.query("select * from authority");
		while (databaseDao.next()) {
			Authority authority=new Authority();
			authority.setAuthorityId(databaseDao.getInt("authorityId"));
			authority.setUserType(databaseDao.getString("userType"));
			authority.setUrl(databaseDao.getString("url"));
			authority.setRedirectUrl(databaseDao.getString("redirectUrl"));
			authority.setParam(databaseDao.getString("param"));
			authorities.add(authority);
		}
		
		 /*AuthorityDao ad=new  AuthorityDao();
		 List<Authority> authorities=new ArrayList<Authority>();
		 authorities=ad.getAll();*/
		assertNotNull(authorities);
		//return authorities;
	}

}

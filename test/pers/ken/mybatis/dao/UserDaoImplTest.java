package pers.ken.mybatis.dao;

import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import pers.ken.mybatis.po.User;

public class UserDaoImplTest {
	
	private SqlSessionFactory sqlSessionFacotry;
	
	@Before
	public void setUp() throws Exception {
		//引入SqlMapperConfig配置文件
		String resource = "SqlMapConfig.xml";
		//读取配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//通过SqlSessionFactoryBuilder 创建  SqlSessionFactory 对象
		sqlSessionFacotry = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	@Test
	public void findUserById() throws Exception {
		UserDao userDao = new UserDaoImpl(sqlSessionFacotry);
		
		User user = userDao.findUserById(36);
		
		System.out.println(user);

	}
	
	@Test
	public void insertUser() throws Exception {
		UserDao userDao = new UserDaoImpl(sqlSessionFacotry);
		
		//构造user对象
		User user = new User();
		user.setUsername("郭富城1");
		user.setBirthday(new Date());
		user.setSex("1");
		user.setAddress("香港九龙");
		
		//插入操作
		userDao.insertUser(user);
	}
	
	@Test
	public void deleteUser() throws Exception
	{
		UserDao userDao = new UserDaoImpl(sqlSessionFacotry);
		
		userDao.deleteUser(39);
	}
			
}

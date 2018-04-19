package pers.ken.mybatis.mapper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import pers.ken.mybatis.po.User;
import pers.ken.mybatis.po.UserCustom;
import pers.ken.mybatis.po.UserQueryVo;

public class UserMapperTest {
	
	private SqlSessionFactory sqlSessionFacotry;
	
	// 此方法是在执行testFindUserById之前执行
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
	public void testFindUserById() throws Exception{
		SqlSession sqlSession = sqlSessionFacotry.openSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		User user = userMapper.findUserById(37);
		
		System.out.println(user);
	}
	
	@Test
	public void testFindUserList() throws Exception{
		SqlSession sqlSession = sqlSessionFacotry.openSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setSex("1");
		userCustom.setUsername("小明");
		userQueryVo.setUserCustom(userCustom);
		
		List<UserCustom> list = userMapper.findUserList(userQueryVo);
		
		System.out.println(list);
	}
	
	@Test
	public void testFindUserCount() throws Exception{
		SqlSession sqlSession = sqlSessionFacotry.openSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setSex("1");
		userCustom.setUsername("小明");
		userQueryVo.setUserCustom(userCustom);
		
		int count = userMapper.findUserCount(userQueryVo);
		
		System.out.println(count);
	}
	
	@Test
	public void testFindUserByIdResultMap() throws Exception{
		SqlSession sqlSession = sqlSessionFacotry.openSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		User user = userMapper.findUserByIdResultMap(37);
		
		System.out.println(user);
	}
	
}

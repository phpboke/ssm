package pers.ken.mybatis.first;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import pers.ken.mybatis.po.User;

public class MybatisFirst {
	
	@Test
	public void findUserByIdTest() throws IOException{
		//引入SqlMapperConfig配置文件
		String resource = "SqlMapConfig.xml";
		//读取配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//通过SqlSessionFactoryBuilder 创建  SqlSessionFactory 对象
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//通过SelSessionFactory 创建 SqlSession 对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//通过sqlmap 类型的映射文件  User.xml 中定义的statement的id去查询数据
		User user = sqlSession.selectOne("test.findUserById", 1);
		
		System.out.println(user);
		
		//释放资源
		sqlSession.close();
	}

}

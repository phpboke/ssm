package pers.ken.mybatis.mapper;

import java.util.List;

import pers.ken.mybatis.po.User;
import pers.ken.mybatis.po.UserCustom;
import pers.ken.mybatis.po.UserQueryVo;

public interface UserMapper {

	//根据用户id查询单条用户信息
	public User findUserById(int id) throws Exception;
	
	//根据用户复杂查询条件查询多条用户信息
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception; 
	
	//查询用户总数，用于分页
	public int findUserCount(UserQueryVo userQueryVo) throws Exception;
	
	//根据用户id通过resultMap方式查询
	public User findUserByIdResultMap(int id) throws Exception;
	
}

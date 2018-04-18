package pers.ken.mybatis.mapper;

import java.util.List;

import pers.ken.mybatis.po.User;
import pers.ken.mybatis.po.UserCustom;
import pers.ken.mybatis.po.UserQueryVo;

public interface UserMapper {

	public User findUserById(int id) throws Exception;
	
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception; 
	
}

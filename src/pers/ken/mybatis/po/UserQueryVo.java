package pers.ken.mybatis.po;

/**
 * @desc 用户复杂查询包装类
 * @author Administrator
 *
 */
public class UserQueryVo {
	
	private UserCustom userCustom;
	
	public UserCustom getUserCustom(){
		return userCustom;
	}
	
	public void setUserCustom(UserCustom userCustom){
		this.userCustom = userCustom;
	}
}

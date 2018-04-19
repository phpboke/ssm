package pers.ken.mybatis.po;

/**
 * @desc 用户复杂查询包装类
 * @author Administrator
 *
 */
public class UserQueryVo {
	
	//定义一个  "用户" 对象
	private UserCustom userCustom;
	
	//封装用户信息
	public UserCustom getUserCustom(){
		return userCustom;
	}
	
	public void setUserCustom(UserCustom userCustom){
		this.userCustom = userCustom;
	}
	
	//这里还可以封装其他信息。。。
}

package pers.ken.mybatis.po;
import java.util.Date;

public class User {
	
	private int id;
	private String username;//用户姓名
	private Date birthday;//生日
	private String sex;//性别
	private String address;//地址

	/**
	 * @desc 用户id
	 * @return
	 */
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	/**
	 * @desc 用户名称
	 * @return
	 */
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	/**
	 * @desc 生日
	 * @return
	 */
	public Date getBirthday(){
		return birthday;
	}
	
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	
	/**
	 * @desc 性别
	 * @return
	 */
	public String getSex(){
		return sex;
	}
	
	public void setSex(String sex){
		this.sex = sex;
	}
	
	/**
	 * @desc 地址
	 * @return
	 */
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
}

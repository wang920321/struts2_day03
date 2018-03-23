/**  

* Title: User.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月23日  

* @version 1.0  

*/
package cn.itheima.bean;

/**  

* Title: User  

* Description:   

* @author 172219902  

* @date 2018年3月23日  

*/
public class User {
    private String name;
    private Integer age;
    
	/**  
	
	* Title:   
	
	* Description:  
	  
	
	*/
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**  
	
	* Title:   
	
	* Description:  
	
	* @param name
	* @param age  
	
	*/
	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/* (non-Javadoc)  
	
	 * Title: toString 
	
	 * Description:   
	
	 * @return  
	
	 * @see java.lang.Object#toString()  
	
	 */
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
    
}

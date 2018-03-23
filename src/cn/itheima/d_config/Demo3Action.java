/**  

* Title: Demo3Action.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月24日  

* @version 1.0  

*/
package cn.itheima.d_config;

import com.opensymphony.xwork2.ActionSupport;

/**  

* Title: Demo3Action  

* Description:   

* @author 172219902  

* @date 2018年3月24日  

*/
public class Demo3Action extends ActionSupport{

	private String name;
	
	@Override
	public String execute() throws Exception {
		name="jerry";//从数据库中查询
		return SUCCESS;
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
}

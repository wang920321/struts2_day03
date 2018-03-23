/**  

* Title: Demo1Action.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月24日  

* @version 1.0  

*/
package cn.itheima.c_param;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.ValueStack;

import cn.itheima.bean.User;

/**  

* Title: Demo1Action  

* Description:   

* @author 172219902  

* @date 2018年3月24日  

*/
public class Demo2Action extends ActionSupport implements ModelDriven<User>{

	private User user=new User();
	@Override
	public String execute() throws Exception {
		
		System.out.println(user);
		return SUCCESS;
	}
	/* (non-Javadoc)  
	
	 * Title: prepare 
	
	 * Description:   
	
	 * @throws Exception  
	
	 * @see com.opensymphony.xwork2.Preparable#prepare()  
	
	 */
	/*@Override
	public void prepare() throws Exception {
		     //压入栈顶
				//1获得值栈
				ValueStack vs = ActionContext.getContext().getValueStack();
				//2压入栈顶
				vs.push(user);
		
	}*/
	/* (non-Javadoc)  
	
	 * Title: getModel 
	
	 * Description:   
	
	 * @return  
	
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()  
	
	 */
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
    
}

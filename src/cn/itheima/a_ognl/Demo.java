/**  

* Title: Demo.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月23日  

* @version 1.0  

*/
package cn.itheima.a_ognl;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import cn.itheima.bean.User;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

//展示OGNL语法
public class Demo {
	@Test
	//准备工作
    public void fun1() throws OgnlException{
    	//准备OGNLContext
		  //准备Root
		User rootUser=new User("tom",18);
		
		  //准备Context
		Map<String, User> context=new HashMap<String, User>();
		context.put("user1", new User("jack",17));
		context.put("user2", new User("rose",22));
		OgnlContext oc=new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);
		//书写OGNL
		Ognl.getValue("", oc, oc.getRoot());
    }
	@Test
	//基本语法演示
	//取出root中的属性值
	public void fun2() throws OgnlException{
		//准备OGNLContext
		//准备Root
		User rootUser=new User("tom",18);
		
		//准备Context
		Map<String, User> context=new HashMap<String, User>();
		context.put("user1", new User("jack",17));
		context.put("user2", new User("rose",22));
		OgnlContext oc=new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);
		//书写OGNL
		//取出root中的user对象的name属性
		String name = (String) Ognl.getValue("name", oc, oc.getRoot());
		Integer age = (Integer) Ognl.getValue("age", oc, oc.getRoot());
		System.out.println(name+age);
		
		
	}
	@Test
	//基本语法演示
	//取出context中的属性值
	public void fun3() throws OgnlException{
		//准备OGNLContext
		//准备Root
		User rootUser=new User("tom",18);
		
		//准备Context
		Map<String, User> context1=new HashMap<String, User>();
		context1.put("user1", new User("jack",17));
		context1.put("user2", new User("rose",22));
		OgnlContext oc=new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context1);
		//书写OGNL
		//取出context中的user对象的name属性
		String name = (String) Ognl.getValue("#user2.name", oc, oc.getRoot());
		Integer age = (Integer) Ognl.getValue("#user1.age", oc, oc.getRoot());
		
		System.out.println(name+age);
		
		
	}
	@Test
	//基本语法演示
	//为属性赋值
	public void fun4() throws OgnlException{
		//准备OGNLContext
		//准备Root
		User rootUser=new User("tom",18);
		
		//准备Context
		Map<String, User> context1=new HashMap<String, User>();
		context1.put("user1", new User("jack",17));
		context1.put("user2", new User("rose",22));
		OgnlContext oc=new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context1);
		//书写OGNL
		//赋值
		Ognl.getValue("name='jerry'", oc, oc.getRoot());
		String name = (String) Ognl.getValue("name", oc, oc.getRoot());
		Ognl.getValue("#user1.name='hao'", oc, oc.getRoot());
		String name1 = (String) Ognl.getValue("#user1.name", oc, oc.getRoot());
		
		
		System.out.println(name1);
		
		
	}
	@Test
	//基本语法演示
	//调用方法
	public void fun5() throws OgnlException{
		//准备OGNLContext
		//准备Root
		User rootUser=new User("tom",18);
		
		//准备Context
		Map<String, User> context1=new HashMap<String, User>();
		context1.put("user1", new User("jack",17));
		context1.put("user2", new User("rose",22));
		OgnlContext oc=new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context1);
		//书写OGNL
		//调用对象里面的方法
		Ognl.getValue("setName('lilei')", oc, oc.getRoot());
		String name = (String) Ognl.getValue("getName()", oc, oc.getRoot());
		Ognl.getValue("#user1.setName('lucy')", oc, oc.getRoot());
		String name2 = (String) Ognl.getValue("#user1.getName()", oc, oc.getRoot());
	
		
		
		System.out.println(name+name2);
		
		
	}
	@Test
	//基本语法演示
	//调用静态方法和静态属性
	public void fun6() throws OgnlException{
		//准备OGNLContext
		//准备Root
		User rootUser=new User("tom",18);
		
		//准备Context
		Map<String, User> context1=new HashMap<String, User>();
		context1.put("user1", new User("jack",17));
		context1.put("user2", new User("rose",22));
		OgnlContext oc=new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context1);
		//书写OGNL
		//调用对象静态里面的方法
		
		String name = (String) Ognl.getValue("@cn.itheima.a_ognl.Hahautils@echo('hello')", oc, oc.getRoot());
		Double PI = (Double) Ognl.getValue("@Math@PI", oc, oc.getRoot());
		System.out.println(name+PI);
	}
	@Test
	//基本语法演示
	//OGNL创建对象-list  map
	public void fun7() throws OgnlException{
		//准备OGNLContext
		//准备Root
		User rootUser=new User("tom",18);
		
		//准备Context
		Map<String, User> context1=new HashMap<String, User>();
		context1.put("user1", new User("jack",17));
		context1.put("user2", new User("rose",22));
		OgnlContext oc=new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context1);
		//书写OGNL
		//调用对象静态里面的方法
		
		Integer size=(Integer) Ognl.getValue("{'tom','jerry','jack','rose'}.size()", oc, oc.getRoot());
		String name=(String) Ognl.getValue("{'tom','jerry','jack','rose'}[0]", oc, oc.getRoot());
		String name2=(String) Ognl.getValue("{'tom','jerry','jack','rose'}.get(1)", oc, oc.getRoot());
		System.out.println(size+name+name2);
		
		Integer size1=(Integer) Ognl.getValue("#{'name':'tom','age':17}.size()", oc, oc.getRoot());
		String name1=(String) Ognl.getValue("#{'name':'tom','age':17}.get('name')", oc, oc.getRoot());
		Integer age=(Integer) Ognl.getValue("#{'name':'tom','age':17}['age']", oc, oc.getRoot());
		System.out.println(size1+name1+age);
	}
}

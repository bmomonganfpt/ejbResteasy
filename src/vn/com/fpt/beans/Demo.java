package vn.com.fpt.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Demo implements DemoLocal {

	public Demo() {
	}

	@Override
	public String add() {
		return "hello world!";
	}

}

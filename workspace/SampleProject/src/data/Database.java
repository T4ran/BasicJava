package data;

import java.util.ArrayList;

import vo.UserVO;

public class Database {
	private static Database instance;
		
	private Database(){
			
	}
		
	public static Database getInstance(){
		if(instance == null)
		{
			instance = new Database();
		}
		return instance;
	}
	
	public ArrayList<UserVO> tb_user = new ArrayList<UserVO>();
	
	{		//초기화블럭
		UserVO user = new UserVO();
		user.setId("admin");
		user.setPassword("admin");
		user.setName("관리자");
		
		tb_user.add(user);

		user.setId("admin1");
		user.setPassword("admin1");
		user.setName("관리자1");
		
		tb_user.add(user);
	}
}

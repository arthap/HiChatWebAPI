package kvn.service;

import com.kvn.entity.User;

public interface UserService {

	User findById(int id);
	
	User findBySso(String sso);
	
}
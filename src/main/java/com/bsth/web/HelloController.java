package com.bsth.web;

import com.bsth.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BSTH on 2017/3/24.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
	@GetMapping(value = "/data")
	public List<User> data(){
		List<User> list = new ArrayList<User>();
		for (int i = 0; i < 10; i++){
			User user = new User();
			user.setId(i+1);
			user.setName("springTh"+1);
			user.setAge("age"+i);
			user.setSex("sex"+i);
			user.setRole("role"+i);

			list.add(user);
		}
		return list;
	}
}

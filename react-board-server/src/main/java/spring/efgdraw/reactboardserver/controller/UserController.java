package spring.efgdraw.reactboardserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.efgdraw.reactboardserver.mapper.UserMapper;
import spring.efgdraw.reactboardserver.vo.UserVO;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	UserMapper userMapper;
	
	@GetMapping
	public List<UserVO> userList(){
		System.out.println(userMapper.userList());
		return userMapper.userList();
	}
	
	@GetMapping("/{id}")
	public UserVO fetchUserByID(@PathVariable Long id) {
		System.out.println(userMapper.fetchUserByID(id));
		return userMapper.fetchUserByID(id);
	}
	
	@PutMapping("/{id}")
	public void updateUser(@RequestBody UserVO user, @PathVariable Long id) {
		UserVO updateUser = user;
		System.out.println("수정 유저 => " + updateUser);
		
		userMapper.updateUser(updateUser);
	}
	
//	@DeleteMapping("/{id}")
//	public void deleteUser(@PathVariable Long id) {
//		System.out.println("삭제 유저 아이디 => " + id);
//		userMapper.deleteUser(id);
//		System.out.println("유저 삭제!");
//	}
	
	@DeleteMapping("/{id}")
	public void deleteUserByUpdate(@PathVariable Long id) {
		System.out.println("삭제 유저 아이디 => " + id);
		userMapper.deleteUserByUpdate(id);
		System.out.println("유저 삭제(사실 숨김)");
	}
	
	@PostMapping
	public void insertUser(@RequestBody UserVO user) {
		userMapper.insertUser(user);
		System.out.println("유저 데이터 저장");
	}
	
}

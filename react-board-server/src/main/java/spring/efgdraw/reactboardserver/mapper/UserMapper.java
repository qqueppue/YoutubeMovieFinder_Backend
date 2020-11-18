package spring.efgdraw.reactboardserver.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import spring.efgdraw.reactboardserver.vo.UserVO;

@Mapper
public interface UserMapper {
	List<UserVO> userList(); //UserMapper.xml 속에 생성해둔 userList method 사용(SQL문)
	UserVO fetchUserByID(Long id);
	void insertUser(UserVO user);
	void updateUser(UserVO user);
	void deleteUser(Long id);
	void deleteUserByUpdate(Long id);
}

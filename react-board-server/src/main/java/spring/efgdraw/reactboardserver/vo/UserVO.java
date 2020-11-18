/***
 * 2020.11.09 사용자 VO 추가
 * 2020.11.11 삭제여부 컬럼 추가 처리
 * */
package spring.efgdraw.reactboardserver.vo;

import lombok.Data;

@Data
public class UserVO {
	Long id;
	String userName;
	String password;
	String firstName;
	String lastName;
	String gender;
	String salary;
	String delYn;	// 20.11.11 PM15:09 삭제여부 추가
}

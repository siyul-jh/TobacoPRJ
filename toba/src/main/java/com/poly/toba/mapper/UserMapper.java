package com.poly.toba.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.poly.toba.model.EmailDTO;
import com.poly.toba.model.NoticeDTO;
import com.poly.toba.model.UserDTO;

@Mapper
public interface UserMapper {
	// 회원등록
	public int regUser(UserDTO uDTO) throws Exception;

	// 중복확인
	public int getUserEmailCheck(String userEmail) throws Exception;

	public int getUserNickCheck(String userNick) throws Exception;

	// Email 인증키 발급
	public int regKey(EmailDTO eDTO) throws Exception;
	public int getEmailKey(String emailKey) throws Exception;
	public int changeStatus(EmailDTO eDTO) throws Exception;

	// 로그인
	public UserDTO getUserLogin(UserDTO uDTO) throws Exception;

	// 비밀번호 변경
	public int updatePassword(UserDTO uDTO) throws Exception;
	public int changeNick(UserDTO uDTO) throws Exception;

	public int profileUpd(UserDTO uDTO) throws Exception;
	// 전체 회원 수
	public int userTotalCount(HashMap<String, String> sMap) throws Exception;
	// 회원 리스트
	public List<NoticeDTO> getUserList(HashMap<String, Object> hMap) throws Exception;
	// 회원 활성화/비활성화
	public int userEnDisable(String enabled, String userNo) throws Exception;

}

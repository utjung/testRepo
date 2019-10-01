package com.simplify.sample.security;

import java.util.List;

import com.simplify.sample.security.domain.Member;

public interface UserMapper {

	public Member readUser(String username);
	 
    public List<String> readAuthority(String username);
}

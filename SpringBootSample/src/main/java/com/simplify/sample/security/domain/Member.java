package com.simplify.sample.security.domain;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

@Data
public class Member {
	
	private String username;
    
    private String password;
    
    private String name;
    
    private boolean isAccountNonExpired;
    
    private boolean isAccountNonLocked;
    
    private boolean isCredentialsNonExpired;
    
    private boolean isEnabled;

    private Collection<? extends GrantedAuthority> authorities;
    
}
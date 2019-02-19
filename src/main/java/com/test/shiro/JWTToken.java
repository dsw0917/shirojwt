package com.test.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * Created by admin on 2019/2/19.
 */
public class JWTToken implements AuthenticationToken {
    private String token;

    public JWTToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}

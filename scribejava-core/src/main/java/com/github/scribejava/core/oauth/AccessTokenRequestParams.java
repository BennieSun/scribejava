package com.github.scribejava.core.oauth;

import com.github.scribejava.core.builder.ScopeBuilder;

public class AccessTokenRequestParams {

    private final String code;
    private String pkceCodeVerifier;
    private String scope;

    public AccessTokenRequestParams(String code) {
        this.code = code;
    }

    public static AccessTokenRequestParams create(String code) {
        return new AccessTokenRequestParams(code);
    }

    public AccessTokenRequestParams pkceCodeVerifier(String pkceCodeVerifier) {
        this.pkceCodeVerifier = pkceCodeVerifier;
        return this;
    }

    public AccessTokenRequestParams scope(String scope) {
        this.scope = scope;
        return this;
    }

    public AccessTokenRequestParams scope(ScopeBuilder scope) {
        this.scope = scope.build();
        return this;
    }

    public String getCode() {
        return code;
    }

    public String getPkceCodeVerifier() {
        return pkceCodeVerifier;
    }

    public String getScope() {
        return scope;
    }
}

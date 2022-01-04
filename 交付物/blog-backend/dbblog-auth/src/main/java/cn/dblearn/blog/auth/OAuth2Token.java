package cn.dblearn.blog.auth;


import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author fubibo
 * @create 2021/11/10 13:36
 *
 */
public class OAuth2Token implements AuthenticationToken {

    private String token;

    public OAuth2Token(String token){
        this.token = token;
    }

    @Override
    public String getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}



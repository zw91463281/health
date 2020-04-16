package com.tyust.health.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * 为当前登录用户做认证和赋权
 * @Author 郭志武
 * @Date 2020/4/13 23:04
 * @Version 1.0
 */
public class CustomRealm extends AuthorizingRealm {

    /**
     *为当前用户提供权限
     * 获取身份信息，我们可以在这个方法中，从数据库获取该用户的权限和角色信息
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取登录用户名
        String username = (String)principalCollection.getPrimaryPrincipal();
        //TODO 根据用户名去数据库查询用户信息

        //TODO 获取权限和角色

        return null;
    }

    /**
     * 登录认证，验证用户身份
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //TODO 登录认证

        return null;
    }
}

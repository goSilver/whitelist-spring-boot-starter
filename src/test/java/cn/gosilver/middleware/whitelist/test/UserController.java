package cn.gosilver.middleware.whitelist.test;

import cn.gosilver.middleware.whitelist.DoJoinPoint;
import cn.gosilver.middleware.whitelist.annotation.DoWhiteList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Author: chensh
 * Date: 2024/9/14 2:39 PM
 */
public class UserController {
    private Logger logger = LoggerFactory.getLogger(DoJoinPoint.class);

    @DoWhiteList(key = "userId", returnJson = "{\"code\":\"1111\",\"info\":\"非白名单可访问用户拦截！\"}")
    public UserInfo queryUserInfo(String userId) {
        logger.info("查询用户信息，userId：{}", userId);
        return new UserInfo("虫虫:" + userId, 19, "天津市东丽区万科赏溪苑14-0000");
    }
}

package cn.gosilver.middleware.whitelist.test;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Author: chensh
 * Date: 2024/9/14 2:42 PM
 */
@SpringBootTest
public class ApiTest {

    @Test
    public void test() {
        UserController userController = new UserController();
        UserInfo aaa = userController.queryUserInfo("aaaa");
        System.out.println(JSON.toJSONString(aaa));
    }
}

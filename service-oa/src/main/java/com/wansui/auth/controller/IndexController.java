package com.wansui.auth.controller;

import com.wansui.common.result.Result;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * 分度控制器
 *
 * @author wansui
 * @date 2023/11/24
 */
@Tag(name = "后台登录管理", description = "首页")
@RestController
@RequestMapping("/admin/system/index")
public class IndexController {


    /**
     * 登录
     *
     * @return @return {@link Result }
     * @author wansui
     * @date 2023/11/24
     */
    @PostMapping("login")
    public Result login() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("token", "admin");
        return Result.ok(map);
    }

    /**
     * 获取信息
     *
     * @param token 令牌
     * @return @return {@link Result }
     * @author wansui
     * @date 2023/11/24
     */
    @GetMapping(value = "getInfo")
    public Result getInfo(String token) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("roles", "[admin]");
        map.put("name","admin");
        map.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return Result.ok(map);
    }

    /**
     * 登出
     *
     * @return @return {@link Result }
     * @author wansui
     * @date 2023/11/24
     */
    @PostMapping(value = "logout")
    public Result logout(){
        return Result.ok("退出成功");
    }
}

package com.wansui.auth.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wansui.auth.service.SysUserService;
import com.wansui.common.result.Result;
import com.wansui.model.system.SysUser;
import com.wansui.vo.system.SysUserQueryVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 系统用户控制器
 *
 * @author wansui
 * @date 2023/12/07
 */
@Tag(name = "系统用户管理", description = "系统用户管理")
@RestController
@RequestMapping("/admin/system/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @Operation(tags = "用户条件分页查询")
    @GetMapping("{page}/{limit}")
    public Result index(@PathVariable Long page,
                        @PathVariable Long limit,
                        SysUserQueryVo sysUserQueryVo){

        Page<SysUser> pageParam = new Page<>(page,limit);

    }
}

package com.wansui.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wansui.model.system.SysUser;
import com.wansui.auth.service.SysUserService;
import com.wansui.auth.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【sys_user(用户表)】的数据库操作Service实现
* @createDate 2023-12-06 15:34:39
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}





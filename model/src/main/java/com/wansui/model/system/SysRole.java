package com.wansui.model.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wansui.model.base.BaseEntity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * 系统角色
 *
 * @author wansui
 * @date 2023/11/16
 * @see BaseEntity
 */

@Data
@Schema(title = "角色")
@TableName("sys_role")
public class SysRole extends BaseEntity {
	
	@Serial
	private static final long serialVersionUID = 1L;

	//@NotBlank(message = "角色名称不能为空")
	@Schema(title = "角色名称")
	@TableField("role_name")
	private String roleName;

	@Schema(title = "角色编码")
	@TableField("role_code")
	private String roleCode;

	@Schema(title = "描述")
	@TableField("description")
	private String description;

}


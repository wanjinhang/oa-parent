package com.wansui.model.process;

import com.wansui.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "ProcessType")
@TableName("oa_process_type")
public class ProcessType extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Schema(title= "类型名称")
	@TableField("name")
	private String name;

	@Schema(title= "描述")
	@TableField("description")
	private String description;

	@TableField(exist = false)
	private List<ProcessTemplate> processTemplateList;
}
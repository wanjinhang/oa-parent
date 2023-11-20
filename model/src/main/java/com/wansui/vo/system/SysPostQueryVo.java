package com.wansui.vo.system;

import lombok.Data;

@Data
public class SysPostQueryVo {
	
	//@Schema(title = "岗位编码")
	private String postCode;

	//@Schema(title = "岗位名称")
	private String name;

	//@Schema(title = "状态（1正常 0停用）")
	private Boolean status;


}


package com.wansui.model.wechat;

import com.wansui.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "菜单")
@TableName("wechat_menu")
public class Menu extends BaseEntity {

    @Schema(title= "id")
    @TableField("parent_id")
    private Long parentId;

    @Schema(title= "名称")
    private String name;

    @Schema(title= "类型")
    private String type;

    @Schema(title= "网页 链接，用户点击菜单可打开链接")
    private String url;

    @Schema(title= "菜单KEY值，用于消息接口推送")
    @TableField("meun_key")
    private String meunKey;

    @Schema(title= "排序")
    private Integer sort;
}
package com.example.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 挂号表
 * </p>
 *
 * @author author
 * @since 2023-11-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("register")
@ApiModel(value="Register对象", description="挂号表")
public class Register implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "register_id", type = IdType.AUTO)
    private Integer registerId;

    @ApiModelProperty(value = "患者id")
    @TableField("client_id")
    private Integer clientId;

    @ApiModelProperty(value = "性别")
    @TableField("sex")
    private String sex;

    @ApiModelProperty(value = "年龄")
    @TableField("age")
    private Integer age;

    @ApiModelProperty(value = "挂号时间")
    @TableField("register_time")
    private LocalDateTime registerTime;


}

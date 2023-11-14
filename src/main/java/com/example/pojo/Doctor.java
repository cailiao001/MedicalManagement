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
 * 医生表
 * </p>
 *
 * @author author
 * @since 2023-11-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("doctor")
@ApiModel(value="Doctor对象", description="医生表")
public class Doctor implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "doctor_id", type = IdType.AUTO)
    private Integer doctorId;

    @ApiModelProperty(value = "医生名")
    @TableField("doctor_name")
    private String doctorName;

    @ApiModelProperty(value = "性别")
    @TableField("sex")
    private String sex;

    @ApiModelProperty(value = "上班时间")
    @TableField("time")
    private LocalDateTime time;

    @ApiModelProperty(value = "科室")
    @TableField("type")
    private String type;


}

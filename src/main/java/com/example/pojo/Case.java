package com.example.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 病例表
 * </p>
 *
 * @author author
 * @since 2023-11-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("case")
@ApiModel(value="Case对象", description="病例表")
public class Case implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "case_id", type = IdType.AUTO)
    private Integer caseId;

    @ApiModelProperty(value = "医嘱")
    @TableField("advice")
    private String advice;

    @ApiModelProperty(value = "患者id")
    @TableField("client_id")
    private Integer clientId;

    @ApiModelProperty(value = "医生id")
    @TableField("doctor_id")
    private Integer doctorId;

    @ApiModelProperty(value = "药品id")
    @TableField("medicine_id")
    private Integer medicineId;


}

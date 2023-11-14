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
 * 药品表
 * </p>
 *
 * @author author
 * @since 2023-11-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("medicine")
@ApiModel(value="Medicine对象", description="药品表")
public class Medicine implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "medicine_id", type = IdType.AUTO)
    private Integer medicineId;

    @ApiModelProperty(value = "药品名")
    @TableField("medicine_name")
    private String medicineName;

    @ApiModelProperty(value = "功效")
    @TableField("effect")
    private String effect;


}

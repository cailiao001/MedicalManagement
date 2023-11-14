package com.example.service.impl;

import com.example.pojo.Medicine;
import com.example.mapper.MedicineMapper;
import com.example.service.IMedicineService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 药品表 服务实现类
 * </p>
 *
 * @author author
 * @since 2023-11-08
 */
@Service
public class MedicineServiceImpl extends ServiceImpl<MedicineMapper, Medicine> implements IMedicineService {

}

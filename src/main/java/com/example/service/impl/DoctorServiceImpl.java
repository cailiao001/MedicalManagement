package com.example.service.impl;

import com.example.pojo.Doctor;
import com.example.mapper.DoctorMapper;
import com.example.service.IDoctorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 医生表 服务实现类
 * </p>
 *
 * @author author
 * @since 2023-11-08
 */
@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor> implements IDoctorService {

}

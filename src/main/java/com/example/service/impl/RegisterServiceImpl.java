package com.example.service.impl;

import com.example.pojo.Register;
import com.example.mapper.RegisterMapper;
import com.example.service.IRegisterService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 挂号表 服务实现类
 * </p>
 *
 * @author author
 * @since 2023-11-08
 */
@Service
public class RegisterServiceImpl extends ServiceImpl<RegisterMapper, Register> implements IRegisterService {

}

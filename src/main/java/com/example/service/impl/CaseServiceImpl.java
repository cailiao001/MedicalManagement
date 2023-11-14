package com.example.service.impl;

import com.example.pojo.Case;
import com.example.mapper.CaseMapper;
import com.example.service.ICaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 病例表 服务实现类
 * </p>
 *
 * @author author
 * @since 2023-11-08
 */
@Service
public class CaseServiceImpl extends ServiceImpl<CaseMapper, Case> implements ICaseService {

}

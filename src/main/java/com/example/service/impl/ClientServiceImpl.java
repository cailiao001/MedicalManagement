package com.example.service.impl;

import com.example.pojo.Client;
import com.example.mapper.ClientMapper;
import com.example.service.IClientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 患者表 服务实现类
 * </p>
 *
 * @author author
 * @since 2023-11-08
 */
@Service
public class ClientServiceImpl extends ServiceImpl<ClientMapper, Client> implements IClientService {

}

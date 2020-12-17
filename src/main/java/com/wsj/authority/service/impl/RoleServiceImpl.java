package com.wsj.authority.service.impl;

import com.wsj.authority.entity.Role;
import com.wsj.authority.mapper.RoleMapper;
import com.wsj.authority.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangshijian
 * @since 2020-12-08
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}

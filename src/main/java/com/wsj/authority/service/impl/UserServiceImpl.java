package com.wsj.authority.service.impl;

import com.wsj.authority.entity.User;
import com.wsj.authority.mapper.UserMapper;
import com.wsj.authority.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

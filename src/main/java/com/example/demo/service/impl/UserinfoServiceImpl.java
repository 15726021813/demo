package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.UserinfoMapper;
import com.example.demo.domain.Userinfo;
import com.example.demo.service.UserinfoService;
@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements UserinfoService{
    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public List<Userinfo> loadAll() {
        return userinfoMapper.selectList(null);
    }

    @Override
    @Cacheable(cacheNames = "com.excample.demo.service.impl.UserinfoServiceImpl",key = "#id")
    public Userinfo getById(Serializable id) {
        return super.getById(id);
    }
}

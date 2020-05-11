package com.example.demo.service;

import com.example.demo.domain.Userinfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface UserinfoService extends IService<Userinfo>{


    List<Userinfo> loadAll();
}

package com.star.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: 音乐盒页面显示控制器
 * @Date: Created in 20:59 2020/6/27
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 */
@Controller
public class MusicShowController {

    @GetMapping("/music")
    public String about() {
        return "music";
    }

}
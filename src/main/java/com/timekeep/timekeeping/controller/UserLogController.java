package com.timekeep.timekeeping.controller;

import com.timekeep.timekeeping.dto.UserLogDto;
import com.timekeep.timekeeping.entity.UserLog;
import com.timekeep.timekeeping.service.UserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class UserLogController {

    @Autowired
    UserLogService userLogService;


    @PostMapping("userlog")
    public UserLog getUserLog(@RequestBody UserLogDto userLogDto) {

        return userLogService.createUserLog(userLogDto);
    }


}

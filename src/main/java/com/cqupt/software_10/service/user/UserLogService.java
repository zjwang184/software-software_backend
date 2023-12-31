package com.cqupt.software_10.service.user;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cqupt.software_10.entity.user.UserLog;


/**
* @author hp
* @description 针对表【user_log】的数据库操作Service
* @createDate 2023-09-07 14:34:13
*/
public interface UserLogService extends IService<UserLog> {

    int insertUserLog(UserLog userLog);
}

package com.timekeep.timekeeping.converter;

import com.timekeep.timekeeping.dto.UserLogDto;
import com.timekeep.timekeeping.entity.UserLog;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserLogMapperImp implements UserLogMapper {
    @Override
    public UserLog toEntity(UserLogDto dto) {
        UserLog userLog = new UserLog();
        userLog.setDate(dto.getDate());


        return userLog;
    }

    @Override
    public UserLogDto toDTO(UserLog entity) {
        UserLogDto userLogDto = new UserLogDto();
        userLogDto.setDate(entity.getDate());
        userLogDto.setId(entity.getId());
        userLogDto.setUserCode(entity.getUser().getCode());

        return userLogDto;
    }

    @Override
    public List<UserLog> toEntity(List<UserLogDto> dtoList) {
        return null;
    }

    @Override
    public List<UserLogDto> toDto(List<UserLog> entityList) {
        return null;
    }
}

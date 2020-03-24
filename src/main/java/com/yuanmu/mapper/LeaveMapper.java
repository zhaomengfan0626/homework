package com.yuanmu.mapper;

import com.yuanmu.model.Leave;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaveMapper {
   List<Leave>findAll();
}
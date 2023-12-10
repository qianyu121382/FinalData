package test.dao;

import test.entity.JavaBean.Device;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository()
@Mapper
public interface UseDao
{
     ArrayList<Device> query();
}

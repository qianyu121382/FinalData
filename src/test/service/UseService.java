package test.service;

import test.dao.UseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.entity.JavaBean.Device;
import test.util.Result;

import java.util.ArrayList;

@Service()
public class UseService
{
    @Autowired()
    UseDao useDao;

    public Result<ArrayList<Device>> query()
    {
        return new Result<>(true,useDao.query());

    }

}

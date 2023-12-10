package test.service;

import test.dao.UseDao;
import test.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.entity.Liuyan;

import java.util.Date;

@Service()
public class UseService
{
    @Autowired()
    UseDao useDao;

    public Account isExistAccount(Account account)
    {
        return useDao.selectAccount(account) ;
    }
    public Account selectAccount(String userName)
    {
        return useDao.selectAccountByUserName(userName) ;
    }
    public Boolean insert(String userName, Liuyan liuyan)
    {
        liuyan.setTime(new Date());
        liuyan.setUserName(userName);
        useDao.insertLiuYan(liuyan);
        return true;
    }


}

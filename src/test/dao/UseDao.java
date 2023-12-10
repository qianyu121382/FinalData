package test.dao;

import test.entity.Account;
import test.entity.Liuyan;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository()
@Mapper
public interface UseDao
{
     Account selectAccount(Account account);
     Account selectAccountByUserName(String userName);
     Account selectLiuyanByUserName(String userName);
     int insertLiuYan(Liuyan liuyan);
}

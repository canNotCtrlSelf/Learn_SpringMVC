package com.cncs.test;

import com.cncs.dao.AccountDao;
import com.cncs.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void run1() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        //使用查询方法
        List<Account> list = accountDao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        //释放资源
        sqlSession.close();
        in.close();
    }

    @Test
    public void run2() throws Exception {
        Account account = new Account();
        account.setName("小贝");
        account.setMoney(699d);
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        //使用查询方法
        accountDao.saveAccount(account);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
        in.close();
    }

}

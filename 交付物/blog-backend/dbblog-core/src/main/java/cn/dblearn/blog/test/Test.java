package cn.dblearn.blog.test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author fubibo
 * @create 2022-01-02 下午10:47
 */
public class Test {
    public static void main(String[] args) {
        Connection con = null;

        //即连接mysql的驱动 下载导入包后 通过Class.forName(driver)装载该驱动
        String driver = "com.mysql.cj.jdbc.Driver";

        //jdbc是必须的 mysql是数据库名 接着是<目标网络地址>:<端口号>/数据库名称(在mysql界面下create database [name]创建的的数据库名)
        String url = "jdbc:mysql://119.29.56.71:3306/dbblog";

        //用户名
        String user = "root";
        //密码
        String password = "123456";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
            if(!con.isClosed()) {
                System.out.println("Connected!");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}

package JDBC;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MyDataSourceFactory {
    public static DataSource getMySQLDataSource(){
        Properties props = new Properties();
        FileInputStream fis = null;
        MysqlDataSource mysqlDataSource = null;
        try{
            fis = new FileInputStream("db.properties");
            props.load(fis);
            mysqlDataSource = new MysqlDataSource();
            mysqlDataSource.setURL(props.getProperty("MYSQL_DB_URL"));
            mysqlDataSource.setUser(props.getProperty("MYSQL_DB_USERNAME"));
            mysqlDataSource.setPassword(props.getProperty("MYSQL_DB_PASSWORD"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return mysqlDataSource;
    }
}

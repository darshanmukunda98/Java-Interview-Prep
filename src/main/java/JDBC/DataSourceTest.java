package JDBC;

import javax.sql.DataSource;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class DataSourceTest {
    public static void main(String[] args){
        testDataSource();
    }
    private static void testDataSource(){
        DataSource ds = null;
        ds = MyDataSourceFactory.getMySQLDataSource();
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            con = ds.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from employee");
            while(rs.next()){
                System.out.println("Employee ID="+rs.getInt("id")+", Name="+rs.getString("name"));            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally{
            try {
                if(rs != null) rs.close();
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}

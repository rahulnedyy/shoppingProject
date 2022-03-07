package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dbutil.DBConnection;
import pojo.UserPojo;

public class UserDao {
    public static String validateUser(UserPojo user)throws SQLException{
    System.out.println(user);
    PreparedStatement ps=DBConnection.getConnection().prepareStatement("select username from users where userId=? and password=? and usertype=?");
        ps.setString(1,user.getUserId());
        ps.setString(2,user.getPassword());
        ps.setString(3,user.getUserType());
        ResultSet rs=ps.executeQuery();
        String username=null;
        if(rs.next()){
            username=rs.getString(1);
            
        }
        return username;   


}  

}

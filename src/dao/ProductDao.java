package dao;
import dbutil.DBConnection;
import pojo.ProductPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import pojo.ProductPojo;
public class ProductDao {
  
 
public static boolean addProduct(ProductPojo e) throws SQLException{
       
     PreparedStatement ps=DBConnection.getConnection().prepareStatement("insert into PRODUCT (TYPE,PRODUCTNAME,PRICE,SELLERINFO,DATE)values(?,?,?,?,?)");
        ps.setString(1,e.gettype());
        ps.setString(2,e.getpname());
        ps.setString(3,e.getprice());
         ps.setString(4,e.getsellerInfo());
          ps.setString(5,e.getdate());
        int result=ps.executeUpdate();
     
        
        return result==1;    
    
}
public static ArrayList<ProductPojo> getAllHomeProducts()throws SQLException{
        ArrayList<ProductPojo> prodList=new ArrayList<>();
        
       Statement st=DBConnection.getConnection().createStatement();
       ResultSet rs=st.executeQuery("select PRODUCTNAME,PRICE,SELLERINFO,DATE from PRODUCT where TYPE='Home Appliances'");
        while(rs.next())
        {
           ProductPojo e=new ProductPojo();
            e.setpname(rs.getString(1));
            e.setprice(rs.getString(2));
            e.setsellerInfo(rs.getString(3));
              e.setdate(rs.getString(4));
          prodList.add(e);
       
        }
        return prodList;
   }

public static ArrayList<ProductPojo> getAllMobileProducts()throws SQLException{
        ArrayList<ProductPojo> prodList=new ArrayList<>();
        
       Statement st=DBConnection.getConnection().createStatement();
       ResultSet rs=st.executeQuery("select PRODUCTNAME,PRICE,SELLERINFO,DATE from PRODUCT where TYPE='Mobile Phone and Accessories'");
        while(rs.next())
        {
           ProductPojo e=new ProductPojo();
            e.setpname(rs.getString(1));
            e.setprice(rs.getString(2));
            e.setsellerInfo(rs.getString(3));
              e.setdate(rs.getString(4));
          prodList.add(e);
       
        }
        return prodList;
   }

public static ArrayList<ProductPojo> getAllFashionProducts()throws SQLException{
        ArrayList<ProductPojo> prodList=new ArrayList<>();
        
       Statement st=DBConnection.getConnection().createStatement();
       ResultSet rs=st.executeQuery("select PRODUCTNAME,PRICE,SELLERINFO,DATE from PRODUCT where TYPE='Fashion and Apparels'");
        while(rs.next())
        {
           ProductPojo e=new ProductPojo();
            e.setpname(rs.getString(1));
            e.setprice(rs.getString(2));
            e.setsellerInfo(rs.getString(3));
              e.setdate(rs.getString(4));
          prodList.add(e);
       
        }
        return prodList;
   }

public static ArrayList<ProductPojo> getAllBooksProducts()throws SQLException{
        ArrayList<ProductPojo> prodList=new ArrayList<>();
        
       Statement st=DBConnection.getConnection().createStatement();
       ResultSet rs=st.executeQuery("select PRODUCTNAME,PRICE,SELLERINFO,DATE from PRODUCT where TYPE='Books'");
        while(rs.next())
        {
           ProductPojo e=new ProductPojo();
            e.setpname(rs.getString(1));
            e.setprice(rs.getString(2));
            e.setsellerInfo(rs.getString(3));
            e.setdate(rs.getString(4));
          prodList.add(e);
       
        }
        return prodList;
   }
}

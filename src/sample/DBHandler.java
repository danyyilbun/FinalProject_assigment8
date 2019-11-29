package sample;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBHandler {
    public List<Trucker> getTruckers() throws ClassNotFoundException, SQLException {
        List<Trucker> tc = new ArrayList<Trucker>();
        try{
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser("root");
            dataSource.setPassword(" ");
            dataSource.setServerName("jdbc:mysql://localhost:3306/db_trip");
          //  Class.forName("com.mysql.jdbc.Driver");
     //   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_trip","root","");
            Connection con = dataSource.getConnection();
            //here sonoo is database name, root is username and password
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from trip_journals");
        while(rs.next())
            tc.add(new Trucker(rs.getInt(1)
                    ,rs.getInt(2)
                    ,rs.getInt(3)
                    ,rs.getInt(4)
                    ,rs.getString(5)
                    ,rs.getString(6)
                    ,rs.getString(7)
                    ,rs.getInt(8)
                    ,rs.getInt(9)
                    ,rs.getInt(10)
                    ,rs.getDouble(11)
                    ,rs.getString(12)
                    ,rs.getString(13)
                    ,rs.getString(14)));
        con.close();
             }catch(Exception e){ System.out.println(e);
             }

        return tc;
        }
    public List<Trucker> getTruckers( String condition, String id) throws ClassNotFoundException, SQLException {
        List<Trucker> tc = new ArrayList<Trucker>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_trip","root","");
            //here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from trip_journals where " + condition +" " +id);
            while(rs.next())
                tc.add(new Trucker(rs.getInt(1)
                        ,rs.getInt(2)
                        ,rs.getInt(3)
                        ,rs.getInt(4)
                        ,rs.getString(5)
                        ,rs.getString(6)
                        ,rs.getString(7)
                        ,rs.getInt(8)
                        ,rs.getInt(9)
                        ,rs.getInt(10)
                        ,rs.getDouble(11)
                        ,rs.getString(12)
                        ,rs.getString(13)
                        ,rs.getString(14)));
            con.close();
        }catch(Exception e){ System.out.println(e);}
        return tc;
    }
    public void addTrucker( Trucker tr) throws ClassNotFoundException, SQLException {

        String SQL = "INSERT INTO trip_journals(truck_number,driver_number,co_driver_number,trip_number,date_departed," +
                "date_returned,state_code,miles_driven) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_trip","root","");
            //here sonoo is database name, root is username and password
            PreparedStatement pstmt = con.prepareStatement(SQL,
                    Statement.RETURN_GENERATED_KEYS);

            pstmt.setInt(1, tr.getTruck_number());
            pstmt.setInt(2, tr.getDriver_number());
            pstmt.setInt(3, tr.getCo_driver_number());
            pstmt.setInt(4, tr.getDriver_number());
            pstmt.setString(5, tr.getDate_departed());
            pstmt.setString(6, tr.getDate_returned());
            pstmt.setString(7, tr.getState_code());
            pstmt.setInt(8, tr.getMiles_driven());
            pstmt.setInt(9, tr.getFuel_receipt_number());
            pstmt.setInt(10, tr.getGallons_purchased());
            pstmt.setDouble(11, tr.getTaxes_paid());
            pstmt.setString(12, tr.getStation_name());
            pstmt.setString(13, tr.getStation_street_location());
            pstmt.setString(14, tr.getStation_city_location());



            int affectedRows = pstmt.executeUpdate();
            con.close();
        }catch(Exception e){ System.out.println(e);}

    }
    }


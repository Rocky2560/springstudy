package Projects.Postgresql;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class testdaoimp implements testdao{
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public test findbyid(int id) {
        test t = null;
        String query = "select * from test where id=?";
        Connection connection = null;
        PreparedStatement prepstmt = null;
        ResultSet rsltSet = null;
        try {
            connection = dataSource.getConnection();
//            System.out.println(connection);
            prepstmt = connection.prepareStatement("select * from test where id=?");
//            System.out.println(prepstmt);

            prepstmt.setInt(1, id);
            rsltSet = prepstmt.executeQuery();

            t = new test();
            while (rsltSet.next()) {
                t.setId(id);
                t.setName(rsltSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rsltSet != null) rsltSet.close();
                if (prepstmt != null) prepstmt.close();
            } catch (Exception ex) {
            }
        }
        return t;
    }


//    public HashMap<String, Object> display(HashMap<String,Object> testing) {
        public void display(){
//        test t = null;
        String query = "select * from test where id=?";
        Connection connection = null;
        PreparedStatement prepstmt = null;
        ResultSet rsltSet = null;
        HashMap<String,Object> testing1 = new HashMap<String,Object>();
        try {
            connection = dataSource.getConnection();
//            System.out.println(connection);
            prepstmt = connection.prepareStatement("select * from test");
//            System.out.println(prepstmt);

//            prepstmt.setInt(1, id);
            rsltSet = prepstmt.executeQuery();

                    while (rsltSet.next()) {
//                        testing1.put("id",rsltSet.getString("id"));
//                        testing1.put("name",rsltSet.getString("name"));
                        System.out.println(rsltSet.getString("id") + "\t"
                                + rsltSet.getString("name"));

                    }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rsltSet != null) rsltSet.close();
                if (prepstmt != null) prepstmt.close();
            } catch (Exception ex) {
            }
        }
//        return testing1;
    }

    public void insert() {
        test t = null;
        Connection connection = null;
        PreparedStatement prepstmt = null;
        ResultSet rsltSet = null;
        try {
            connection = dataSource.getConnection();

            prepstmt = connection.prepareStatement("Insert into test(id,name) Values(?,?)");

                prepstmt.setInt(1,23);
                prepstmt.setString(2,"check");
                 prepstmt.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rsltSet != null) rsltSet.close();
                if (prepstmt != null) prepstmt.close();
            } catch (Exception ex) {
            }
        }

    }
}

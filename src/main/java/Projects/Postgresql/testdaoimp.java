package Projects.Postgresql;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
            prepstmt = connection.prepareStatement("query");
            prepstmt.setInt(1, id);
            rsltSet = prepstmt.executeQuery();
            t = new test();
            while (rsltSet.next()) {
                t.setId(id);
                t.setName("sudip");
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
}

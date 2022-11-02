import java.sql.*;

public class task3
{
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String DB_URL= "jdbc:oracle:thin:@localhost:1521:xe";
    static final String USER="Nibir";
    static final String PASS="cse4308";
    public static void main (String args[])
    {
        Connection conn=null;
        Statement stmt=null;
        try
        {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database");
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Creating statement");
            stmt=conn.createStatement();
            String sql;
            sql="SELECT count(T_id) AS TRANSACTION FROM (" +
                    "SELECT T_id, EXTRACT(YEAR FROM DTM) as YEAR," +
                    "EXTRACT(MONTH FROM DTM) AS MONTH FROM TRANSACTIONS) WHERE YEAR= 2021" +
                    "AND MONTH >6 ";
            System.out.println("Executing the query: " + sql);
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
               int transaction = rs.getInt("TRANSACTION");
               System.out.println(transaction + " transactions in last 6 months of 2021");
            }

            rs.close();
            stmt.close();
            conn.close();
            System.out.println("Thank you for banking with us!");
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
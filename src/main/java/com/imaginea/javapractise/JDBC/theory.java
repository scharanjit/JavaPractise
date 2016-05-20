package JDBC;

public class theory {

}


/*




Stored procedure type	                                JDBC method
Stored procedure requires no IN or OUT parameters	    Use a Statement object
Stored procedure with IN parameters	                    Use a PreparedStatement object
Stored procedure with IN and OUT parameters	            Use a CallableStatement object

1.)Simple statement

  try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("{call GETCUSTNAME}");
            while (rs.next()) {
            System.out.println(rs.getString("Name"));
            }
            rs.close();
            stmt.close();
            }
        catch (Exception e) {
            e.printStackTrace();
            }
            
            
 2.) Prepared Statement
 
          try {
        PreparedStatement pstmt = con.prepareStatement("{call getorders(?)}");
        pstmt.setInt(1, c_id);
        ResultSet rs = pstmt.executeQuery();                
        while (rs.next()) {
            System.out.println("Order Number\t: "+rs.getString("order_num"));
            System.out.println("Order Date\t: "+rs.getString("order_date"));
            System.out.println("Instructions\t: "+rs.getString("shinstruc"));
            System.out.println();
            }
        rs.close();
        pstmt.close();
        }
    catch (Exception e) {
        e.printStackTrace();
    }


3.) Callable statement


try {
        CallableStatement cstmt = con.prepareCall("{call GetTotal(?, ?)}");
        cstmt.setInt(1, o_id);
        cstmt.registerOutParameter(2, Types.INTEGER);
        cstmt.execute();
        System.out.println("Total price for order" + o_id +"is $"+cstmt.getInt(2));
    }
    catch (Exception e) {
        e.printStackTrace();
    }


            



*/
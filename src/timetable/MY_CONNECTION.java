package timetable;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class MY_CONNECTION {
    
       // create connection
    
    public static Connection con;
    
    public static Connection getConnection() throws Exception{
        
          String dbpath = "jdbc:mysql://mytimeserver.mysql.database.azure.com:3306/timetable";
          String user = "uvini@mytimeserver";
          String pass ="jayanga1996#";
        
//        try{
//          File file = new File("e:\\RZKTechnology\\Configurations\\db_config.txt");
//          dbpath = Files.readAllLines(file.toPath()).get(0);
//          user = Files.readAllLines(file.toPath()).get(1);
//          pass = Files.readAllLines(file.toPath()).get(2);
//        
//      } 
//      catch(IOException e){
//        System.out.println(e);
//      }
//        
        
        
        if(con == null){
        Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbpath, user, pass);
        }
        
        
        return con;
    }
    
    //save update delete
    
    public static void setData(String sql)throws Exception{  
       MY_CONNECTION.getConnection().createStatement().executeUpdate(sql);
    }
    
    // search
    
    public static ResultSet getData(String sql)throws Exception{
        ResultSet executeQuery = MY_CONNECTION.getConnection().createStatement().executeQuery(sql);
        return executeQuery;
    }

    static Object createConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

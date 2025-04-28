
import java.sql.*;
public class jdbcDemo {
    public static void main (String [] args) throws Exception {

        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;


        String url = "jdbc:postgresql://localhost:5432/students";
        String username = "postgres";
        String password = "admin";

        try {
            // Step 1: Load and Register the Driver (Class.forName is a simpler way)
            Class.forName("org.postgresql.Driver"); // Automatically registers the driver

            /** 
             * Explanation of above line : 
             * 
             * 1) It loads the PostgreSQL JDBC Driver class (org.postgresql.Driver) into memory at runtime.

               2) It registers the driver with the JDBC DriverManager, so that when you try to connect to a database 
                using DriverManager.getConnection(...), the DriverManager knows which driver to use to establish the connection.



                Earlier version , we needed to do like this

                In older JDBC versions (before JDBC 4.0, which came with Java 6), drivers were not auto-registered.

                    The DriverManager needs to know about the driver class before it can use it.

                    So you had to manually load and initialize the driver class at runtime by using Class.forName().

                    When the class is loaded, the static block inside org.postgresql.Driver executes automatically 
                    and registers itself with DriverManager.

                    Example:
                    The PostgreSQL Driver class typically has something like this:

                    static {
                        try {
                            java.sql.DriverManager.registerDriver(new Driver());
                        } catch (SQLException e) {
                            throw new RuntimeException("Can't register driver!");
                        }
                    }
            **/

            // Step 2: Establish a connection (example for PostgreSQL)
            // JDBC URL SYNTAX :: <mainprotocol>:<subprotocol>:<subname>
            //  mainprotocol -> jdbc  , subprotocol (DB Engine name) -> postgresql:// <address of the DB enging> (localhost:5432) / <db_name>

            conn = DriverManager.getConnection(url, username, password);
            
            if(conn!=null){
                System.out.println("Connection established successfully! ==> " + conn.getClass().getName());
                // Step 3 : Create a Statement Object
                statement = conn.createStatement();

                if(statement != null ){
                    System.out.println("Statement Object is created:: " + statement);

                    String sqlSelectQuery = "select * from student_table";
                    resultSet = statement.executeQuery(sqlSelectQuery);

                    if(resultSet != null){
                        System.out.println("ResultSet object is created:: " + resultSet); 

                        // Step 4 : process the resultSet Object which we got from Executing the Query
                        while (resultSet.next()) {
                            System.out.println("User ID: " + resultSet.getInt("id"));
                            System.out.println("User Name: " + resultSet.getString("name"));
                        }

                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("PostgreSQL Driver not found.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection failed.");
        } finally {
            // Final Step : Close the connection when done
            if(resultSet!=null){
                resultSet.close();
            }
            if(statement!=null){
                statement.close();
            }
            if(conn!=null){
                conn.close();
            }
        }

    }
}

/**  I added POSTGRES DRIVER JAR PATH in SETTINGS.JSON  like this "java.project.referencedLibraries": [
*   "C:/Users/gayle/Downloads/postgresql-42.7.5.jar"
*   ]
*   so that i can directly run from the VSCODE.
*/
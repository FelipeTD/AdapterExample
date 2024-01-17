import connections.MySQLAdapter;
import connections.MySQLCommands;
import connections.OracleCommands;

public class Main {

    public static void main(String[] args) {

        OracleCommands oracle = new OracleCommands();
        oracle.insert();
        oracle.update();
        oracle.delete();

        System.out.println();
        MySQLAdapter mySQL = new MySQLAdapter(new MySQLCommands());
        mySQL.insert();
        mySQL.update();
        mySQL.delete();

    }

}
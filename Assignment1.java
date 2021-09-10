
class DbConnection{

    private static DbConnection instance=null;

    private DbConnection(String dbUser,String dbPassword,String dbName ) { 
    	SQLConnection connection = new SQLConnection(dbUser, dbPassword, dbName);
   }


	public static DbConnection getDbConnection(String dbUser,String dbPassword,String dbName) {
      if (instance== null ) 
		instance = new DbConnection(dbUser,dbPassword,dbName) ;                           

      return instance;
    }
}

class SQLConnection {
	
	String dbUser;
	String dbPassword;
	String dbName;
	
	public SQLConnection(String dbUser, String dbPassword, String dbName) {
		super();
		this.dbUser = dbUser;
		this.dbPassword = dbPassword;
		this.dbName = dbName;
	}
	

}







public class Assignment1 {

    public static void main(String[] args) throws Exception
    {
        System.out.println("hello abdullah al nouman");
        System.out.println("hello shahriar ovi");
        String dbUser="admin";
         String dbPassword="admin";
         String dbName="tesDb";
         DbConnection connection=DbConnection.getDbConnection(dbUser, dbPassword, dbName);

    }
}


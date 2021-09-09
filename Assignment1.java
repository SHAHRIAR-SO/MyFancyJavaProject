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


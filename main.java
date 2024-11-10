import config.Database;

    public class main{
        public static void main(String[] args) {
            Database database = new Database("my_jo","root","","localhost","3306");
            database.setup();
        }
    }


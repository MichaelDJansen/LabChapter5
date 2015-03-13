package za.ac.cput.ac.za.Creational.Singleton;

/**
 * Created by Michael on 13/03/2015.
 */
public class DatabaseConnSingleton
{
        private static DatabaseConnSingleton instance = null;

        private DatabaseConnSingleton()
        {
        }

        public static DatabaseConnSingleton getInstance()
        {
            if(instance == null){
                instance = new DatabaseConnSingleton();
            }
            return instance;
        }

        public String connect()
        {
            return "Connected";
        }

        public String disconnect()
        {
            return "Disconnected";
        }
}

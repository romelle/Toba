import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.sql.*;

public class DBUtil{

    /**
     *
     */
    public static  EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("TOBAPU2");
            
    public static EntityManagerFactory getEmFactory(){
        return emf;
    }
    
}
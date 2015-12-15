package gruppe16.sdupay;

import java.sql.SQLException;

/**
 * Created by jonaspedersen on 15/12/15.
 */
public class DatabaseController {

    private static DatabaseController   _instance;

    private DatabaseController()
    {

    }

    public synchronized static DatabaseController getInstance()
    {
        if (_instance == null)
        {
            _instance = new DatabaseController();
        }
        return _instance;
    }


}

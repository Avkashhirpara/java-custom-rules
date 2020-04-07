
import com.ecw.dao.EcwLog;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyClass {


    public static Connection getConnection() throws Exception
    {
        try
        {
            Class.forName( "SlaveDBDriver" );	//NOSONAR
        }
        catch( Exception e )
        {
            EcwLog.AppendExceptionToLog( e );
            throw e;
        }

        try
        {
            Connection oCon = DriverManager.getConnection( "SlaveDBUrl", "SlaveDBUserName", "SlaveDBPassword" );
            oCon.setReadOnly(true);
            return oCon;
        }
        catch( Exception ex )
        {
            EcwLog.AppendExceptionToLog( ex );
            throw ex;
        }
    }
}
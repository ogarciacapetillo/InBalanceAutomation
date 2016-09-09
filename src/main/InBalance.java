package main;
import main.db.DBMethods;
import main.utils.HashMapCompare;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by OS344312 on 9/7/2016.
 */
public class InBalance {

    static ArrayList<Map<String,String>> requestMap;
    static ArrayList<Map<String,String>> responseMap;

    /*public static final PropertyLoader property= new PropertyLoader();

    public static final String DRIVER_URL =property.loadProperty("inbalance.conn.driver");
    public static final String CONNECTION_URL=property.loadProperty("inbalance.conn.url");
    public static final String CONNECTION_USERNAME=property.loadProperty("inbalance.conn.username");
    public static final String CONNECTION_PASSWORD=property.loadProperty("inbalance.conn.password");*/

    public static void main(String[] args) throws SQLException {

        DBMethods dbMethods;
        dbMethods = new DBMethods();
        requestMap = dbMethods.getRequestMessage();
        System.out.println("-----------------------------------------");
        responseMap = dbMethods.getResponseMessage();
        HashMapCompare comparator = new HashMapCompare();
        comparator.compareMaps(requestMap,responseMap);
        System.out.println(requestMap.size());
        System.out.println(responseMap.size());
        System.out.print("Complete");
    }

}

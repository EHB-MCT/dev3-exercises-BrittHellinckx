import java.sql.*
import java.util.*

fun main(){
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val credentials = Credentials()
    // Prepare credentials
    val connectionProps = Properties();
    connectionProps["user"] = credentials.databaseUser
    connectionProps["password"] = credentials.databasePassword
    // Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.databaseName,
        connectionProps)

    //Collect data
    val statement = connection.prepareStatement("SELECT * from 6_rides" + " "+
                "LEFT JOIN 6_trains ON 6_trains.id = 6_rides.train_id" +" "+
                "LEFT JOIN 6_cities ON 6_cities.id = 6_rides.arrival_city_id" )
    val result = statement.executeQuery()
    while(result.next()){
        println("At: "+result.getString("departure_time"))
        println(result.getString("train_name"))
        println("To: " + result.getString("city_name"))
    }
}

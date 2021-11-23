import java.sql.*
import java.time.LocalDate
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

    //Ask city
    println("Waar wil je naartoe?")
    val userCity = readLine()
    //val currentDate = LocalDate.now()

    //Collect data for city
    val statement = connection.prepareStatement("SELECT * from 6_rides" +
            " LEFT JOIN 6_trains ON 6_trains.id = 6_rides.train_id" +
            " LEFT JOIN 6_cities ON 6_cities.id = 6_rides.arrival_city_id" +
            " WHERE city_name = ? AND departure_time < NOW()" +
            //time: '$currentDate%'
            " ORDER BY (departure_time) ASC" +
            " LIMIT 3")
    statement.setString(1, userCity)
    val result = statement.executeQuery()


    //Print data
    while(result.next()){
        println("Naar: " + result.getString("city_name"))
        println("Om: " + result.getString("departure_time"))
        println("Met: " + result.getString("train_name"))
        println("Op spoor: " + result.getString("platform"))
        println(" ")
    }
}

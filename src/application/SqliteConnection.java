package application;

import java.sql.*;

public class SqliteConnection {
	public static Connection connector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:mydatabase.sqlite");
			return conn;
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
}

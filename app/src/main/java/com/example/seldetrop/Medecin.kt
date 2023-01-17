package com.example.seldetrop

import java.sql.DriverManager

data class Medecin(val id: Int, val nom: String, val adresse: String, val tel: Int, val mail: String) {

    fun connexion(): Boolean{

        val jdbcUrl = "jdbc:mariadb://127.0.0.1:3306/visite"

        // get the connection
        val connection = DriverManager.getConnection(jdbcUrl, "root", "motdepasse")

        return connection.isValid(0)

    }

}
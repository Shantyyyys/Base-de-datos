package com.example.basedatos.Usuario

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity("usuarios_table")
data class Usuario(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nombre: String,
    val edad: Int
)
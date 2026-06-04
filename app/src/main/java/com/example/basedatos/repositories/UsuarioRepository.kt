package com.example.basedatos.repositories

import com.example.basedatos.Usuario.Usuario
import com.example.basedatos.dao.UsuarioDao

class UsuarioRepository(private val usuarioDao: UsuarioDao) {
    suspend fun addUsuario(usuario: Usuario) = usuarioDao.insertarUsuario(usuario)
    suspend fun getAllUsuarios() = usuarioDao.obtenerUsuarios()

}
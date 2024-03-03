package dev.bryan.forum.service

import dev.bryan.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
class UsuarioService(var usuarios: List<Usuario>) {

    init {
        val usuario = Usuario(
            1,
            "Bryan",
            "ibryyan@hotmail.com"
        )

        usuarios = listOf(usuario)
    }

    fun buscarPeloId(id: Long): Usuario {
        return usuarios.stream().filter { t -> t.id == id }.findFirst().get()
    }
}

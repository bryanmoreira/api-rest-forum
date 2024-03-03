package dev.bryan.forum.dto

import dev.bryan.forum.model.StatusTopico
import java.time.LocalDateTime

data class TopicoView(
    val id: Long?,
    val titulo: String,
    val mensagem: String,
    val dataCriacao: LocalDateTime,
    val status: StatusTopico,
)

package dev.bryan.forum.service

import dev.bryan.forum.model.Curso
import org.springframework.stereotype.Service

@Service
class CursoService(var cursos: List<Curso>) {

    init {
        val curso = Curso(
            1,
            "Kotlin",
            "Programação"
        )

        cursos = listOf(curso)
    }

    fun buscarPorId(id: Long): Curso {
        return cursos.stream().filter { t -> t.id == id }.findFirst().get()
    }
}

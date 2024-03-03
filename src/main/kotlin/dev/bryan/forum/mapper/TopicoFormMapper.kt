package dev.bryan.forum.mapper

import dev.bryan.forum.dto.NovoTopicoForm
import dev.bryan.forum.model.Topico
import dev.bryan.forum.service.CursoService
import dev.bryan.forum.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService,
): Mapper<NovoTopicoForm, Topico> {

    override fun map(t: NovoTopicoForm): Topico {
        return Topico(
            titulo = t.titulo,
            mensagem = t.mensagem,
            curso = cursoService.buscarPorId(t.idCurso),
            autor = usuarioService.buscarPeloId(t.idAutor)
        )
    }

}

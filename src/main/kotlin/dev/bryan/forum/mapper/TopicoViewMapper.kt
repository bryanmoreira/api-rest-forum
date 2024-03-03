package dev.bryan.forum.mapper

import dev.bryan.forum.dto.TopicoView
import dev.bryan.forum.model.Topico
import org.springframework.stereotype.Component

@Component
class TopicoViewMapper: Mapper<Topico, TopicoView> {

    override fun map(t: Topico): TopicoView {
        return TopicoView(
            t.id,
            t.titulo,
            t.mensagem,
            t.dataCriacao,
            t.status
        )
    }
}
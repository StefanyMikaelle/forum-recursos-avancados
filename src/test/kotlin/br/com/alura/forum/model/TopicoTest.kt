package br.com.alura.br.com.alura.forum.model

object TopicoTest {
    fun build() = _root_ide_package_.br.com.alura.forum.model.Topico(
        id = 1,
        titulo = "Kotlin Basico",
        mensagem = "Aprendendo kotlin basico",
        curso = CursoTest.build(),
        autor = UsuarioTest.build()
    )
}
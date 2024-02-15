enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val idade: Int, val id: Long)

data class ConteudoEducacional(var nome: String, var duracao: Int = 60)

data class Formacao(val nome: String, var nivel: Nivel, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario, conteudos: List<ConteudoEducacional>) {
        inscritos.add(usuario)
        println("${usuario.nome}, id: ${usuario.id} está matriculado na formação $nome")
        println("Conteúdos:")
        conteudos.forEachIndexed { index, conteudo ->
            println("${index + 1}- ${conteudo.nome}")
        }
        println()
    }
}

fun Kotlin() {
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 120)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos em Kotlin", 180)
    val conteudo3 = ConteudoEducacional("Desenvolvimento Backend com Kotlin", 360)
    
    val formacaoKotlin = Formacao("Kotlin", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2, conteudo3))
    formacaoKotlin.matricular(Usuario("Rodrigo", 25, 1754968), listOf(conteudo1, conteudo2, conteudo3))
}

fun Python(){
    val conteudo1 = ConteudoEducacional("Fundamentos de Python", 180)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos com Python", 240)
    val conteudo3 = ConteudoEducacional("Tratamento de dados com Python", 360)
    
    val formacaoPython = Formacao("Python", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2, conteudo3))
    formacaoPython.matricular(Usuario("Diego", 35, 1325698), listOf(conteudo1, conteudo2, conteudo3))
}

fun MachineLearning(){    
    val conteudo1 = ConteudoEducacional("Introdução ao Machine Learning", 240)
    val conteudo2 = ConteudoEducacional("Algoritmos de Treinamento em Machine Learning", 360)
    val conteudo3 = ConteudoEducacional("Fundamentos e Práticas da Deep Learning", 480)
    val conteudo4 = ConteudoEducacional("Processamento de Imagens com Machine Learning", 600)
    
    val formacaoML = Formacao("Machine Learning Specialist", Nivel.AVANCADO, listOf(conteudo1, conteudo2, conteudo3, conteudo4))
    formacaoML.matricular(Usuario("Lucas", 32, 17945268), listOf(conteudo1, conteudo2, conteudo3, conteudo4))
    formacaoML.matricular(Usuario("Bruno", 30, 25430824), listOf(conteudo1, conteudo2, conteudo3, conteudo4))
}

fun main() {
    Kotlin()
    Python()
    MachineLearning()
}

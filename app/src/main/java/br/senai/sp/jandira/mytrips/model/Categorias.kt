package br.senai.sp.jandira.mytrips.model

import androidx.compose.ui.graphics.painter.Painter
import java.time.LocalDate

data class Categorias(
    var id: Int = 0,
    var nomeCategoria: String = " ",
    var imagemCategoria: Painter?
)

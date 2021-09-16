package com.adir.adirstodo.data.models
import androidx.compose.ui.graphics.Color
import com.adir.adirstodo.ui.theme.HighPriorityColor
import com.adir.adirstodo.ui.theme.LowPriorityColor
import com.adir.adirstodo.ui.theme.MediumPriorityColor
import com.adir.adirstodo.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {

    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)

}
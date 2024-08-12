package com.alphabetz.students.viewmodel

import androidx.lifecycle.ViewModel
import com.alphabetz.students.model.Classes

class StudentsViewModel : ViewModel() {

    val classList: ArrayList<Classes> = ArrayList()

    init {
        classList.add(Classes(1, "I"))
        classList.add(Classes(2, "II"))
        classList.add(Classes(3, "III"))
        classList.add(Classes(4, "IV"))
        classList.add(Classes(5, "V"))
        classList.add(Classes(6, "VI"))
        classList.add(Classes(7, "VII"))
        classList.add(Classes(8, "VIII"))
        classList.add(Classes(9, "IX"))
        classList.add(Classes(10, "X"))
        classList.add(Classes(11, "XI"))
        classList.add(Classes(12, "XII"))
    }
}
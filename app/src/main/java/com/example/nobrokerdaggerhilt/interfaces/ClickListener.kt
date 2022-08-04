package com.example.nobrokerdaggerhilt.interfaces

import java.text.FieldPosition
//helps us to get the position of the view clicked on the recycler view
interface ClickListener {
    fun onClick(position: Int)
}
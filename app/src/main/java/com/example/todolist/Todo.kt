package com.example.todolist

//hold the data, to populate the views, passed to the TodoAdapter
data class Todo (
        val title: String,
        var isChecked: Boolean = false
)
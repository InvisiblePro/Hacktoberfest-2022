package com.example.todo_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var rvTodoItems : RecyclerView
    lateinit var todoAdapter: TodoAdapter
    lateinit var addTodo : Button
    lateinit var deletedTidi : Button
    lateinit var edText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        initializer()
        todoAdapter = TodoAdapter(mutableListOf())

        rvTodoItems.adapter = todoAdapter
        rvTodoItems.layoutManager = LinearLayoutManager(this)

        addTodo.setOnClickListener {
            val todotitle = edText.text.toString()
            if (todotitle.isNotEmpty()){
                val todo = Todo(todotitle)
                todoAdapter.addTodo(todo)
                edText.text.clear()
            }
        }

        deletedTidi.setOnClickListener {
            todoAdapter.deleteDoneTodos()
        }

    }

    fun initializer(){
        rvTodoItems = findViewById(R.id.rvTodoList)
        addTodo = findViewById(R.id.btAddTodo)
        deletedTidi = findViewById(R.id.btDeleteDoneTodos)
        edText = findViewById(R.id.etTodoTitle)
    }
}
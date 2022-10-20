package com.example.todo_list

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(
    private var todos : MutableList<Todo>
) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    class TodoViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.list_todo,
                parent,
                false
            )
        )
    }

    fun addTodo(todo : Todo){
        todos.add(todo)
        notifyItemChanged(todos.size-1)
    }

    fun deleteDoneTodos(){
        todos.removeAll { todo->
            todo.isChecked
        }
        notifyDataSetChanged()
    }

    private fun toggleStrikeThrough(tvTodoTitle : TextView, isChecked : Boolean){
        if (isChecked){
            tvTodoTitle.paintFlags = tvTodoTitle.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        }else{
            tvTodoTitle.paintFlags = tvTodoTitle.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val curTodo = todos[position];
        holder.itemView.findViewById<TextView>(R.id.tvTodoTitle).text = curTodo.title;
        holder.itemView.findViewById<CheckBox>(R.id.cbDone).isChecked = curTodo.isChecked;
        toggleStrikeThrough(holder.itemView.findViewById<TextView>(R.id.tvTodoTitle),
        curTodo.isChecked)
        holder.itemView.findViewById<CheckBox>(R.id.cbDone).setOnCheckedChangeListener { _, b ->
            toggleStrikeThrough(holder.itemView.findViewById<TextView>(R.id.tvTodoTitle),b)
            curTodo.isChecked = !curTodo.isChecked
        }
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}
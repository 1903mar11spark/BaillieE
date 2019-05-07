import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/Models/Todos';
import { TodoService } from 'src/app/services/todo.service';

@Component({
  selector: 'app-todos',
  templateUrl: './todos.component.html',
  styleUrls: ['./todos.component.css']
})
export class TodosComponent implements OnInit {
  todos:Todo[];

  constructor(private todoService:TodoService) { }
//life cycle method --created on works like the constructor but it runs all the way, you want the constructor to import services
  ngOnInit() {
   this.todoService.getTodos().subscribe(todos => {
     this.todos = todos
    }); 
   //subscirbe -.then --> basically
  }

  deleteTodo(todo:Todo){
    console.log('delete me');

    //removes from UI
    //using filter -- like for each or maps
    this.todos= this.todos.filter(t => t.id !== todo.id);

    //Removes from server
    this.todoService.deleteTodo(todo).subscribe(); //gives us an observable--just deleting not returning anything--can put the one above into the subscribe if you wanted to 
  }

  addTodo(todo:Todo){
    this.todoService.addTodo(todo).subscribe(todo => {this.todos.push(todo);
    });
  }
  
}

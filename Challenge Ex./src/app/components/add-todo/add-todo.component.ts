import { Component, OnInit, EventEmitter, Output} from '@angular/core';

@Component({
  selector: 'app-add-todo',
  templateUrl: './add-todo.component.html',
  styleUrls: ['./add-todo.component.css']
})
export class AddTodoComponent implements OnInit {

  @Output() addTodo: EventEmitter<any> = new EventEmitter();

  title:String;
// when you have form inputs you want to assign them as properties to your components
  constructor() { }

  ngOnInit() {
  }

  onSubmit(){
    const todo ={
      title: this.title,
      completed: false
    }
  
//needs to be emitted upwards
 this.addTodo.emit(todo);
}
}

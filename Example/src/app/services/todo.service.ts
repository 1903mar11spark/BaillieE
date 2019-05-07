import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import {Observable} from 'rxjs';
import { Todo } from 'src/app/Models/Todos';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
}

@Injectable({
  providedIn: 'root'
}) 
export class TodoService {
  
  constructor(private http:HttpClient) { }

  todosUrl: string = 'https://jsonplaceholder.typicode.com/todos';

  todosLimit = '?_limit=5';
//can use ?_limit=5 to limit the number recieved but we are gonna move that
//returns observalbe
  getTodos():Observable<Todo[]>{
    return this.http.get<Todo[]>(`${this.todosUrl}${this.todosLimit}`);

   //temperal literal syntax 
  }
//delete todo

deleteTodo(todo:Todo):Observable<Todo>{
  //need id like with the put requests
  const url = `${this.todosUrl}/${todo.id}`;
  return this.http.delete<Todo>(url,httpOptions);
}

//add todo
addTodo(todo:Todo):Observable<Todo> {
  return this.http.post<Todo>(this.todosUrl, todo, httpOptions);
}

  //Toggle Completed
  toggleCompleted(todo: Todo):Observable<any> {
    const url = `${this.todosUrl}/${todo.id}`;
    return this.http.put(url, todo, httpOptions);
    //httpOptions will contain the headers

  }
}

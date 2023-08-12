import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { StudentsData } from '../students-data.model';
@Injectable({
  providedIn: 'root'
})
export class StudentsService {

  constructor(private httpClient: HttpClient) { }

  url = 'http://localhost:7090/students';
  
  getAllstudents(): Observable<StudentsData[]> {
    return this.httpClient.get<StudentsData[]>(this.url);
  }
  
  getStudentById(student_id : number): Observable<any> {
    return this.httpClient.get<StudentsData>(this.url+`/getStudentbyId/${student_id}`);
  }

  updateStudent(student_id: number, students: StudentsData) {
    return this.httpClient.put(`${this.url}/updateStudent/${student_id}`,students);
  }

  deleteStudent(student_id: number): Observable<any> {
    return this.httpClient.delete(this.url+`/deleteStudent/${student_id}`);
  }

  saveStudentsData(students: StudentsData) {
    return this.httpClient.post(`${this.url}`, students);
  }

}


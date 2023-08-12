import { OnInit, ViewChild } from '@angular/core';
import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { StudentsService } from './services/students.service';
import { StudentAddEditComponent } from './student-add-edit/student-add-edit.component';
import {MatPaginator} from '@angular/material/paginator';
import {MatSort} from '@angular/material/sort';
import {MatTableDataSource} from '@angular/material/table';
import { CoreServiceService } from './core/core-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  // title = 'FalconSportInfoDisplay';
  displayedColumns: string[] = ['student_id'
  , 'student_name',
   'student_age',
   'student_institute',
    'gender'
  ,'email',
   'action'];
  dataSource!: MatTableDataSource<any>;

  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;
  constructor(private _dialog: MatDialog, private _studentService: StudentsService, private _coreService: CoreServiceService ) {}

  ngOnInit(): void {
    this.getAllstudents();
  }
  openAddEditStudentForm() {
    const dialogRef =  this._dialog.open(StudentAddEditComponent);
    dialogRef.afterClosed().subscribe({
      next: (val) => {
        if(val) {
          this.getAllstudents();
        }
      }
    })
  }
  getAllstudents(){
    this._studentService.getAllstudents().subscribe({
      next:(res) => {
        this.dataSource = new MatTableDataSource(res);
        this.dataSource.sort = this.sort;
        this.dataSource.paginator = this.paginator;
      },
      error: (err) => {
        console.log(err);
      }
    })
  }
  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
  }
  deleteStudent(student_id: number) {
    this._studentService.deleteStudent(student_id).subscribe({
      next: (res) => {
        // alert('Student Deleted!');
        this._coreService.openSnackBar('Student Deleted!','done')
        this.getAllstudents();
      },
      error: console.log
    });
  }

  openEditStudentForm(data:any) {
     const dialogRef = this._dialog.open(StudentAddEditComponent, {
      data,
     });

     dialogRef.afterClosed().subscribe({
      next: (val) => {
        if(val) {
          this.getAllstudents();
        }
      }
    })
  }
}

//import { DialogRef } from '@angular/cdk/dialog';
import { OnInit } from '@angular/core';
import { Inject } from '@angular/core';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { CoreServiceService } from '../core/core-service.service';
import { StudentsService } from '../services/students.service';

@Component({
  selector: 'app-student-add-edit',
  templateUrl: './student-add-edit.component.html',
  styleUrls: ['./student-add-edit.component.scss']
})
export class StudentAddEditComponent implements OnInit {

  studentForm: FormGroup
  ageOptions: number[] = [
    6,
    7,
    8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24
  ];

  

  constructor(private _fb: FormBuilder, private _studentService: StudentsService, 
    private _dialogRef: MatDialogRef<StudentAddEditComponent>, 
    @Inject(MAT_DIALOG_DATA) public data: any,
    private _coreService: CoreServiceService) {
    this.studentForm = this._fb.group({
      student_name:'',
      student_age: '',
      student_institute:'',
      gender:'',
      email:''
    })
  }

  ngOnInit(): void {
    this.studentForm.patchValue(this.data);
  }

  onFormSubmit(){
    if(this.studentForm.valid) {
      if(this.data) {
        this._studentService.updateStudent(this.data.student_id, this.studentForm.value).subscribe({
          next: (val:any) => {
            // alert('Student detail updated!');
            this._coreService.openSnackBar('Student detail updated!');
            this._dialogRef.close(true);
          },
          error: (err:any) => {
            console.error(err);
          }
        });

      } else {
        this._studentService.saveStudentsData(this.studentForm.value).subscribe({
          next: (val:any) => {
            // alert('Student added successfully');
            this._coreService.openSnackBar('Student added successfully');
            this._dialogRef.close(true);
          },
          error: (err:any) => {
            console.error(err);
          }
        });
      }
      
    }
  }

}

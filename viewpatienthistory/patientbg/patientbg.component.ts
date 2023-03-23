import { DataService } from './../data.service';
import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-patientbg',
  templateUrl: './patientbg.component.html',
  styleUrls: ['./patientbg.component.scss']
})
export class PatientbgComponent implements OnInit {
  constructor(private data : DataService){}
  ngOnInit(): void {
    this.getpatientDetails();
    throw new Error('Method not implemented.');
  }
  patientInfo:any;
  getpatientDetails(){
    this.data.getPrevPatientDetails(1,1).subscribe(response =>{
      this.patientInfo = response;
      console.log(this.patientInfo);
    },
    (error : HttpErrorResponse)=>{
      alert(error.message);
    })
  }

}

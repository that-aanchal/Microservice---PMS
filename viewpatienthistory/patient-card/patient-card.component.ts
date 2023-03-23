import { DataService } from './../data.service';
import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';

export interface Patient{
  
	patientId: number,
	email: string,
	title: string,
	firstName: string,
	lastName: string,
	age: number,
	contactNumber: string,
	password: string,
	gender: string,
	address: string
}

@Component({
  selector: 'app-patient-card',
  templateUrl: './patient-card.component.html',
  styleUrls: ['./patient-card.component.scss']
})
export class PatientCardComponent implements OnInit {

  constructor(private data : DataService){}
  ngOnInit(): void {
    this.getPatientDetails();
    throw new Error('Method not implemented.');
  }
  patientInfo:any;
  getPatientDetails(){
     this.data.getPatientDetails(1).subscribe(response =>{
      this.patientInfo=response;
      console.log(this.patientInfo);
     },
     (error:HttpErrorResponse)=>{
      alert(error.message);
     })
  }

}

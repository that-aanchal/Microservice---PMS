import { DataService } from './../data.service';
import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-keynotes',
  templateUrl: './keynotes.component.html',
  styleUrls: ['./keynotes.component.scss']
})
export class KeynotesComponent implements OnInit {
  constructor(private data : DataService){}
  ngOnInit(): void {
    this.getPatientDetailsByNurse();
    throw new Error('Method not implemented.');
  }

  visitDetails:any;
  getPatientDetailsByNurse(){
    this.data.getPrevPatientDetails(1,1).subscribe(response =>{
      this.visitDetails = response;
      console.log(this.visitDetails);
    },
    (error : HttpErrorResponse)=>{
      alert(error.message);
    })
  }

}

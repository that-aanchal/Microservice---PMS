import { HttpErrorResponse } from '@angular/common/http';
import { DataService } from './../data.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-visit-details',
  templateUrl: './visit-details.component.html',
  styleUrls: ['./visit-details.component.scss']
})
export class VisitDetailsComponent implements OnInit {
  constructor(private data : DataService){}
  ngOnInit(): void {
    this.getPatientPrevDetails();
    throw new Error('Method not implemented.');
  }

  visitDetails:any;
  getPatientPrevDetails(){
    this.data.getAppointmentDetails(1,1).subscribe(response =>{
      this.visitDetails = response;
      console.log(this.visitDetails);
    },
    (error : HttpErrorResponse)=>{
      alert(error.message);
    })
  }

}

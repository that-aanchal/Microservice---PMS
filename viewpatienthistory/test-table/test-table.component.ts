import { DataService } from './../data.service';
import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';

export interface Test {
  testId: number;
  testName: string;
  result: string;
  testNotes: string;
  visitId : number;
  
}

@Component({
  selector: 'app-test-table',
  templateUrl: './test-table.component.html',
  styleUrls: ['./test-table.component.scss']
})
export class TestTableComponent implements OnInit {

  constructor(private data : DataService){}
  displayedColumns: string[] = [
    'testId',
    'testName',
    'result',
    'testNotes',
  ];
  ngOnInit(): void {
    this.getTestsOfPatient();
    throw new Error('Method not implemented.');
  }
 test : any;
  getTestsOfPatient(){
    this.data.getTestDetails(1).subscribe(response =>{
      this.test = response;
      console.log(this.test);
      },
    (error: HttpErrorResponse)=>{
      alert(error.message);
     })
  }

}

import { Component, ViewChild, AfterViewInit } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { MatDialog } from '@angular/material/dialog';

import { ViewprescriptionComponent } from '../viewprescription/viewprescription.component';






@Component({
  selector: 'app-viewpatienthistory',
  templateUrl: './viewpatienthistory.component.html',
  styleUrls: ['./viewpatienthistory.component.scss'],
})
export class ViewpatienthistoryComponent  {
  
  //dataSource = new MatTableDataSource(ELEMENT_DATA);
  @ViewChild(MatPaginator) paginator!: MatPaginator;

  // ngAfterViewInit() {
  //   this.dataSource.paginator = this.paginator;
  // }
   constructor(private matDialog: MatDialog) {}
  openDialogViewPrescription() {
    this.matDialog.open(ViewprescriptionComponent),
      {
        Width: '800px',
      };
    }
}

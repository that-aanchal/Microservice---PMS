import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http :HttpClient) {  }

  getPatientDetails(patientId : number){
    return this.http.get(`http://localhost:8089/patient/${patientId}`);
  }

  getPrevPatientDetails(visitId : number , patientId : number){
    return this.http.get(`http://localhost:8083/patientDetails/${visitId}/${patientId}`);
  }
  getAppointmentDetails(appointmentId : number ,patientId : number){
    return this.http.get(`http://localhost:8081/patient/${appointmentId}/${patientId}`);
  }

  getTestDetails(visitId: number){
    return this.http.get(`http://localhost:8083/patient/tests/${visitId}`);
  }
}

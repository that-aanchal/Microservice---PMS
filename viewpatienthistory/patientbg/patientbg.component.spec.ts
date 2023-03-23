import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PatientbgComponent } from './patientbg.component';

describe('PatientbgComponent', () => {
  let component: PatientbgComponent;
  let fixture: ComponentFixture<PatientbgComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PatientbgComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PatientbgComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

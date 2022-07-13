import { Component, OnInit } from '@angular/core';
import { AprovalClass } from '../api/apirest.model';
import { ApirestService } from '../api/apirest.service';

@Component({
  selector: 'app-formulary',
  templateUrl: './formulary.component.html',
  styleUrls: ['./formulary.component.css'],
})
export class FormularyComponent implements OnInit {
  public dto: AprovalClass = new AprovalClass();

  constructor(private aproval: ApirestService) {}

  ngOnInit(): void {}

  sendRequest(): void {
    const data = {
      column1: this.dto.column1,
      column2: this.dto.column2,
      column3: this.dto.column3,
      column4: this.dto.column4,
      column5: this.dto.column5,
      column6: this.dto.column6,
      column7: this.dto.column7,
      column8: this.dto.column8,
      column9: this.dto.column9,
      column10: this.dto.column10,
      column11: this.dto.column11,
      column12: this.dto.column12,
      column13: this.dto.column13,
      column14: this.dto.column14,
      column15: this.dto.column15,
      column16: this.dto.column16,
    };
    console.log(this.dto);
    this.aproval.predict(data).subscribe();
  }
}

import { Component } from '@angular/core';
import { CalcService } from '../calc.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrl: './about.component.css'
})
export class AboutComponent {
    sum : number;
    sub : number;
    constructor(private cal : CalcService) {
      this.sum = cal.getAdd(85,30);
      this.sub= cal.getSub(40,10);
    }
}

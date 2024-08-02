import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalcService {
   getAdd(a :number,b :number){
    return a+b;
   }

   getSub(a : number, b:number){
    return a-b;
   }
  constructor() { }
}

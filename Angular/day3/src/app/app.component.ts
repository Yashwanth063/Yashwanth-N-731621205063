import { Component } from '@angular/core';
import { CalcService } from './calc.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
// export class AppComponent {
//   name : string;
//   age : number;
//   email : string;
//   imageone:string;
//   fname:string;


// constructor(){
//   this.name = "Yash";
//   this.age=10;
//   this.email="yash@gmail.com";
//   this.imageone="https://miro.medium.com/v2/resize:fit:1358/0*wuNf24urnMp7ypDp.png"
//   this.fname="";

// }
// change(){
//   this.name="vijay";
// }
// changeage(){
//   this.age=21;
// }

// changeemail(){
//   this.email="yashmuthu@gmail.com";
// }

// Image(){
// this.imageone="https://miro.medium.com/v2/resize:fit:1400/1*bMgQ8MhbnQexpqHgIgBJPA.png"

// }

// }

// export class AppComponent{
//   flag : boolean;
//   vech:string[];
//   selectedVechicle:string;
//   mystyle:{};
// style1:string;

//   constructor(){
//     this.flag=true;
//     this.vech=["two wheeler","three wheeler","four wheeler"];
//     this.selectedVechicle="";
//     this.mystyle={'width':'200px','border':'2px solid blue','height':'200px'};
//     this.style1="headstyle";
//   }

//   changeflag(){
//     this.flag= ! this.flag;
//   }

// setSelectedItem(vech : string){
//   this.selectedVechicle=vech;
// }
// changeStyle(){
//   this.mystyle={'width':'300px','border':'2px solid red','height':'200px'};
// }
// }

export class AppComponent{
  sum :number;
  sub : number;
  constructor(private cal:CalcService){
    this.sum=cal.getAdd(10,20);
    this.sub=cal.getSub(10,20);
  }
}
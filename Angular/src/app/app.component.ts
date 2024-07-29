import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name : string;
  age : number;
  email : string;
  imageone:string;


constructor(){
  this.name = "Yash";
  this.age=10;
  this.email="yash@gmail.com";
  this.imageone="https://miro.medium.com/v2/resize:fit:1358/0*wuNf24urnMp7ypDp.png"

}
change(){
  this.name="vijay";
}
changeage(){
  this.age=21;
}

changeemail(){
  this.email="yashmuthu@gmail.com";
}

Image(){
this.imageone="https://miro.medium.com/v2/resize:fit:1400/1*bMgQ8MhbnQexpqHgIgBJPA.png"

}
}
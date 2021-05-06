import { Component, OnInit } from '@angular/core';
import { UserService } from '../service/user-service.service'
import { ActivatedRoute, Router } from '@angular/router';
import { User } from '../model/user';
import { Grant } from '../model/grant';
import { NgForm } from '@angular/forms'
@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})

export class FormComponent {
  user: User;
  constructor(private route: ActivatedRoute, private router: Router, private userService: UserService){
    this.user = new User()
  }

  ngOnInit(): void{}

  onSubmit() {
    this.userService.save(this.user).subscribe(result => this.gotoUserList());
  }

    gotoUserList() {
      this.router.navigate(['/users'])
    }
}

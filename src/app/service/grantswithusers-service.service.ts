import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs/Observable';
import {GrantsWithUsers} from '../model/grants-with-users';

@Injectable()
export class GrantsWithUsersService {

  private grantsUsersUrl: string;

  constructor(private http: HttpClient) {
    this.grantsUsersUrl = 'http://localhost:8080/grantsUsers';
  }

  public findAll(): Observable<GrantsWithUsers[]> {
    return this.http.get<GrantsWithUsers[]>(this.grantsUsersUrl);
  }

  public save(grantswithusers: GrantsWithUsers) {
    return this.http.post<GrantsWithUsers>(this.grantsUsersUrl, grantswithusers);
  }
}

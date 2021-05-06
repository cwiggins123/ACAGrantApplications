import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Grant } from '../model/grant';
import { Observable } from 'rxjs/Observable';
import { GrantsWithUsers } from '../model/grants-with-users';

@Injectable()
export class GrantService {

  private grantUrl: string;

  constructor(private http: HttpClient) {
    this.grantUrl = 'http://localhost:8080/grants';
  }

  public findAll(): Observable<Grant[]> {
    return this.http.get<Grant[]>(this.grantUrl);
  }

  public save(grant: Grant) {
    return this.http.post<Grant>(this.grantUrl, grant);
  }

}

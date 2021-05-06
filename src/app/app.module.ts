import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { TablesComponent } from './tables';
import { FormComponent } from './form/form.component';
import { UserService } from './service/user-service.service';
import { GrantService } from './service/grant-service.service';
import { RouterModule } from '@angular/router';
import {GrantsWithUsersService} from './service/grantswithusers-service.service';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    TablesComponent,
    FormComponent,
    HomeComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(
      [{path: 'forms', component:FormComponent},
        {path: 'tables', component:TablesComponent}, {path:'home', component: HomeComponent}]
    )
  ],
  providers: [UserService, GrantService, GrantsWithUsersService],
  bootstrap: [AppComponent]
})

export class AppModule { }

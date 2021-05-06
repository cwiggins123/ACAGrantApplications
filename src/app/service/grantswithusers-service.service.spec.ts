import { TestBed } from '@angular/core/testing';

import { GrantswithusersServiceService } from './grantswithusers-service.service';

describe('GrantswithusersServiceService', () => {
  let service: GrantswithusersServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GrantswithusersServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

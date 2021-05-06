import { TestBed } from '@angular/core/testing';

import { GrantServiceService } from './grant-service.service';

describe('GrantServiceService', () => {
  let service: GrantServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GrantServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

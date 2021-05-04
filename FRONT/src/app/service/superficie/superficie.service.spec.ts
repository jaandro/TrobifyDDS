import { TestBed } from '@angular/core/testing';

import { SuperficieService } from './superficie.service';

describe('SuperficieService', () => {
  let service: SuperficieService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SuperficieService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

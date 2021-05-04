import { TestBed } from '@angular/core/testing';

import { InteresadoService } from './interesado.service';

describe('InteresadoService', () => {
  let service: InteresadoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(InteresadoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

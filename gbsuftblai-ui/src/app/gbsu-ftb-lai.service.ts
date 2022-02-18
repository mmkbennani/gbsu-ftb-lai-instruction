import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Result } from './model/result';
import { environment } from '../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class GbsuFtbLaiService {
  constructor(private http: HttpClient) { }

  getConversion(nbr: Number) {
    return this.http.get<Result>(environment.url_back+"gbsu-ftb-lai/"+nbr);
  }

}

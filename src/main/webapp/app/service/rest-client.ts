import {Http, Response} from '@angular/http';
import {Observable} from 'rxjs/Rx';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';

export class RestClient<T>{
     baseURL: string;

    constructor(protected http: Http) {
    }
    
    find(id: number): Observable<T> {
        let url = this.baseURL + id;
        return this.http.get(url)
            .map((res: Response) => res.json());
    }
    
    findAll(): Observable<Array<T>> {
        return this.http.get(this.baseURL)
            .map((res: Response) => res.json());
    }

    create(obj: T) : Observable<T> {
        return this.http.post(this.baseURL, obj)
            .map((res: Response) => res.json());
    }

    edit(obj: T) {
        return this.http.put(this.baseURL, obj)
            .map((res: Response) => res.json());
    }

    remove(id: number) {
        let url = this.baseURL + id;
        return this.http.delete(url)
            .map((res: Response) => res.json());
    }
}
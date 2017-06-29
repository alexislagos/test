"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
require("rxjs/add/operator/catch");
require("rxjs/add/operator/map");
var RestClient = (function () {
    function RestClient(http) {
        this.http = http;
    }
    RestClient.prototype.find = function (id) {
        var url = this.baseURL + id;
        return this.http.get(url)
            .map(function (res) { return res.json(); });
    };
    RestClient.prototype.findAll = function () {
        return this.http.get(this.baseURL)
            .map(function (res) { return res.json(); });
    };
    RestClient.prototype.create = function (obj) {
        return this.http.post(this.baseURL, obj)
            .map(function (res) { return res.json(); });
    };
    RestClient.prototype.edit = function (obj) {
        return this.http.put(this.baseURL, obj)
            .map(function (res) { return res.json(); });
    };
    RestClient.prototype.remove = function (id) {
        var url = this.baseURL + id;
        return this.http.delete(url)
            .map(function (res) { return res.json(); });
    };
    return RestClient;
}());
exports.RestClient = RestClient;
//# sourceMappingURL=rest-client.js.map
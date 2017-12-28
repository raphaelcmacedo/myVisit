var main = angular.module('main', ['ngRoute','rest']);

//configure our routes
main.config(function($routeProvider) {
    $routeProvider

        // index
        .when('/', {
            templateUrl : 'pages/list.html'
        })
        
        // detail
        .when('/detail', {
            templateUrl : 'pages/detail.html'
        });
});
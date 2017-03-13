'use strict';

var AngularSpringApp = {};

var App = angular.module('AngularSpringApp', ['AngularSpringApp.filters', 'AngularSpringApp.services', 'AngularSpringApp.directives']);

// Declare app level module which depends on filters, and services
App.config(['$routeProvider', function ($routeProvider) {



    $routeProvider.when('/users', {
        templateUrl: 'users/layout',
        controller: UserController
    });


    $routeProvider.when('/:name', {
        templateUrl: 'image/layout',
        controller: ImageController
    });


    $routeProvider.otherwise({redirectTo: '/users'});
}]);

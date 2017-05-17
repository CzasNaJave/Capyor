var App=angular.module("App", []);
App.controller("MyController", function($scope, $http){

    $scope.welcomeMsg = "Welcome!";




});



config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/bang', {templateUrl: 'bang.html'});
}]);

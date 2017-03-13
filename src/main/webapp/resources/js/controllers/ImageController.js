/**
 * Created by Exilion on 2017-02-08.
 */



var ImageController = function($scope, $routeParams, $http) {

    $scope.name = $routeParams.name;

    $scope.url = "i.imgur.com/" + $scope.name;


    $scope.image = {};


    $scope.addNewImage = function(image) {

        var Indata = {'url': $scope.name };
        $http.post("image/addImage", Indata);


    };


// var req = {
//     method: 'POST',
//     url: 'image/addImage',
//     headers: {
//         'Content-Type': application/json
//     },
//     data: { url: 'Testtt' }
// }


}
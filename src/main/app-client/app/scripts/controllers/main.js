'use strict';

angular.module('NgAppApp')
  .controller('MainCtrl', ['$scope', 'DummySvc', function ($scope, DummySvc) {
    $scope.awesomeThings = [
            'HTML5 Boilerplate',
            'AngularJS',
            'Karma'
        ];
    DummySvc.get().then(function(data){
            angular.forEach(data, function(value, key){
                $scope.awesomeThings.push(value.name);
            });
        });

}]);

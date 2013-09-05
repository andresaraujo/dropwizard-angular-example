'use strict';

angular.module('NgAppApp', ['services.dummy'])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/', {
            templateUrl: 'views/main.html',
            controller: 'MainCtrl'
        })
      .otherwise({
            redirectTo: '/'
        });
}]);

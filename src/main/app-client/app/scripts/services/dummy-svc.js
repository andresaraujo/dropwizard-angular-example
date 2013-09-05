'use strict';
//Declare dummy service resource
angular.module('services.dummy', []);

angular.module('services.dummy').factory('DummySvc', ['$http', function ($http){
    var service={
        get: function(){
                var data={};
                var promise = $http.get('/api/dummy', {params: data}).then(function(response) {
                    console.log(response);
                    return response.data;
                });
                return promise;
            }

    };
    return service;
}]);


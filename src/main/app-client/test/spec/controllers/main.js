'use strict';

describe('Controller: MainCtrl', function () {
  var MainCtrl;
  var scope;
  var fakeFactory, q, deferred;
  var mockService;
  //mock Application to allow us to inject our own dependencies
  beforeEach(module('NgAppApp'));

  beforeEach(function () {
          mockService = {
              get: function () {
                  deferred = q.defer();
                  // Place the fake return object here
                  deferred.resolve([{id: 1, name: 'Java'}, {id:2, name: 'Dropwizard'}]);
                  return deferred.promise;
              }
          };
          spyOn(mockService, 'get').andCallThrough();
      });

  // Initialize the controller
  beforeEach(inject(function ($controller, $rootScope, $q) {

    //create an empty scope
    scope = $rootScope.$new();

    q = $q;

    //Declare controller with mock objects
    MainCtrl = $controller('MainCtrl', {
      $scope: scope,
      DummySvc: mockService
    });
  }));

  it('awesomeThings Should have be defined and have zero objects', function () {
        // Before $apply is called the promise hasn't resolved
        expect(scope.awesomeThings).toBeDefined();
        expect(scope.awesomeThings.length).toBe(0);
  });
  it('awesomeThings Should have be defined and have two objects', function () {
          // This propagates the changes to the models
          // This happens itself when you're on a web page, but not in a unit test framework
          scope.$apply();
          expect(scope.awesomeThings).toBeDefined();
          expect(scope.awesomeThings.length).toBe(2);
  });

});

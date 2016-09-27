'use strict';

/* App Module */

var webshopApp = angular.module('webshopApp', [
  'ngRoute',
  'webshopAnimations',

  'webshopControllers',
  'webshopFilters',
  'webshopServices',
  'timer'
]);

webshopApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/home', {
        templateUrl: '/templates/partials/product-list.html',
        controller: 'ProductListCtrl'
      }).
      when('/products/:productId', {
        templateUrl: '/templates/partials/product-detail.html',
        controller: 'ProductDetailCtrl'
      });
  }]);

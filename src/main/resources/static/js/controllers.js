'use strict';

/* Controllers */

var webshopControllers = angular.module('webshopControllers', []);

webshopControllers.controller('ProductListCtrl', ['$scope', 'Product', '$location',
  function($scope, Product,  $location) {
    $scope.products = Product.getAll();
    
    $scope.orderProp = 'id';

    $scope.hideProductList = function() {
      return $location.path().indexOf('products') !== -1;
    }

    $scope.viewProduct = function(pId){
      $location.path('/products/'+pId); 
    }

    $scope.countDownFinished = function(index){
      $scope.products[index].offer.discount = false;
      $scope.$apply();
    }
  }]);

webshopControllers.controller('ProductDetailCtrl', ['$scope', '$routeParams', 'Product', '$location',
  function($scope, $routeParams, Product, $location) {
    $scope.product = Product.getProduct({productId: $routeParams.productId}, function(product) {
      $scope.mainImageUrl = product.pictures.main;
    });

    $scope.setImage = function(image) {
      $scope.mainImageUrl = image.normal;
    };

    $scope.toggleSpecs = function(group) {
      if ($scope.isSpecsShown(group)) {
        $scope.shownSpecs = null;
      } else {
        $scope.shownSpecs = group;
      }
    };
  
    $scope.isSpecsShown = function(group) {
      return $scope.shownSpecs === group;
    };

    $scope.return = function(){
      $location.path('/home'); 
    }

    $scope.countDownFinished = function(){
      $scope.product.offer.discount = false;
      $scope.$apply();
    }

  }]);

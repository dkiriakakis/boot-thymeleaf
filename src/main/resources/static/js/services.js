'use strict';

/* Services */

var webshopServices = angular.module('webshopServices', ['ngResource']);

webshopServices.factory('Product', ['$resource',
  function($resource){
    return $resource('products/:prefix:productId.json', {}, {
      getAll: {method:'GET', params:{prefix:'',productId:'all'}, isArray:true},
      getProduct: {method:'GET', params:{prefix:'id'}, isArray:false}
    });
  }]);

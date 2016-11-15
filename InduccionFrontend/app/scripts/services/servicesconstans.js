(function() {
  'use strict';

  /**
  * @ngdoc service
  * @name travelFrontendApp.servicesConstans
  * @description
  * # servicesConstans
  * Constant in the travelFrontendApp.
  */
  var urlServer = 'http://127.0.0.1:8080/TarjetaWEB/';
  var prefix = 'rest/test/';
  var apiVersion = 'api/v1/';
  var auth = 'auth/';
  var travel = 'travel/';

  angular.module('travelFrontendApp')
  .constant('servicesConstants', {
    auth: {
      login: urlServer + apiVersion + auth + 'signin',
      logout: urlServer + apiVersion + auth + 'logout;'
    },
    travel: {
      getAll: urlServer + prefix + 'getAllCards'
    }
  });

})();

(function(angular) {
	angular.module("avaliacaTaxaJurosApp.clienteController", []);
	angular.module("avaliacaTaxaJurosApp.clienteService", []);
	angular.module("avaliacaTaxaJurosApp",[ "ngResource", "avaliacaTaxaJurosApp.clienteController", "avaliacaTaxaJurosApp.clienteService" ]);
}(angular));
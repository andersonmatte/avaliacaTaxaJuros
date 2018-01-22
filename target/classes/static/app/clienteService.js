(function(angular) {
	
	var ClienteFactory = function($resource) {
		return $resource('/avaliacaTaxaJuros/clientes', {
		}, {
			inserirCliente : {
				method : "POST"
			},
		});
	};

	ClienteFactory.$inject = [ '$resource' ];
	angular.module("avaliacaTaxaJurosApp.clienteService").factory("Cliente", ClienteFactory);

}(angular));
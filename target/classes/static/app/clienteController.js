(function(angular) {
	var ClienteController = function($scope, Cliente) {

		//Recuperer clientes.
		Cliente.query(function(response) {
			$scope.clientes = response ? response : [];
		});

		//Inserir um novo cliente.
		$scope.inserirCliente = function(cliente) {
			new Cliente({
				nomeCliente : cliente.nomeCliente,
				limiteCredito : cliente.limiteCredito,
				risco : cliente.risco
			}).$save(function(cliente) {
				$scope.clientes.push(cliente);
			});
		};
		
		//Atualizar um cliente já cadastrado.
		$scope.atualizarCliente = function(cliente) {
			cliente.$update();
		};
		
        //Exckuir um cliente já cadastrado.
		$scope.apagarCliente = function(cliente) {
			cliente.$remove(function() {
				$scope.clientes.splice($scope.clientes.indexOf(cliente), 1);
			});
		};
		
	};

	ClienteController.$inject = [ '$scope', 'Cliente' ];
	angular.module("avaliacaTaxaJurosApp.clienteController").controller("ClienteController", ClienteController);
	
}(angular));
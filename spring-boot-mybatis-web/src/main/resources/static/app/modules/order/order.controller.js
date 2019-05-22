appModule.controller('ListController', function($scope,orderService) {
	$scope.orderInfos = orderService.getList();
});

appModule.controller('DetailController', function($scope, $routeParams,orderService) {
	$scope.orderInfo = orderService.getDetail($routeParams.id);
});
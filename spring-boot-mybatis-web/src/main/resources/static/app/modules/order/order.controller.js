function ListController($scope,orderService) {
//	orderService.getList().then(function(orderInfos) {$scope.orderInfos = orderInfos});
	$scope.orderInfos = orderService.getList();
}

//appModule.controller('ListController', function($scope) {
//	$scope.orderInfos = orderInfos;
//});
function DetailController($scope, $routeParams,orderService) {
//	$scope.orderInfo = orderInfos[$routeParams.id];
//	orderService.getDetail($routeParams.id).then(function(orderInfo) {$scope.orderInfo = orderInfo});
	$scope.orderInfo = orderService.getDetail($routeParams.id);
}
//appModule.controller('DetailController', function($scope) {
//	$scope.orderInfo = orderInfos[$routeParams.id];
//});
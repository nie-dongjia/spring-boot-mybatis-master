function orderRouteConfig($routeProvider) {
	$routeProvider.when('/', {
		controller : 'ListController',
		templateUrl : 'modules/order/list.html'
	}).
	// Notice that for the detail view, we specify a parameterized URL component
	// by placing a colon in front of the id
	when('/view/:id', {
		controller : 'DetailController',
		templateUrl : 'modules/order/detail.html'
	}).otherwise({
		redirectTo : '/'
	});
}
appModule.config(orderRouteConfig);
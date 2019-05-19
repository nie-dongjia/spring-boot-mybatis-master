appModule.service('orderService', function($http) {
    return {
        getList : function(username) {
            return $http.get('/order/list').then(function(response) {
                return response.data;
            });
        },

        getDetail : function(id) {
            return $http.get('/order/' + id).then(function(response){
                console.log(response);
                return response.data;
            });
        }
    };
});
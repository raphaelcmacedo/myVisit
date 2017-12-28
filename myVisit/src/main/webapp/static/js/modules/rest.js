angular.module('rest',['ngResource'])
.factory('resourceVisit',function($resource){

	return $resource('api/visits/:id',null,{
		update:{
			method:'PUT'
		}
	});

});
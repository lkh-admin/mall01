app.service("listService",function($http){
    this.selectAll=function () {
            return $http.get('user');
    }

    this.selectOne=function (id) {
        return $http.get('selectOne?id='+id);
    }
    this.add=function(entity){
        return $http.post('insert',entity);
    }
    
    this.update=function(entity){
        return $http.post('update',entity);
    }
    
    this.dele=function (id) {
        return $http.get('delete?id='+id);
    }

});
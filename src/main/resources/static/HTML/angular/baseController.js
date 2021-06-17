app.controller('baseController',function ($scope) {





    //选择的id
    $scope.selectIds=[];//用户勾选的id集合

    $scope.updatecheckbox=function($event,id){
        if($event.target.checked){
            $scope.selectIds.push(id);//push向集合中添加元素
        }else{
            var index = $scope.selectIds.indexOf(id);//查找值的位置
            $scope.selectIds.splice(index,1);//参数1:移除的位置，参数2：移除的个数
        }
    }
    $scope.jsonToString=function(jsonString,key) {

        var json = JSON.parse(jsonString);
        var value= "";
        for (var i=0;i<json.length;i++){
            if(i>0){
                value+=",";
            }
            value +=  json[i][key];
        }
        return value;
    }

});
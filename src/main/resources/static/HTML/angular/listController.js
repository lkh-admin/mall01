app.controller('listController',function($scope,$controller,listService,$http){

    $controller('baseController',{$scope:$scope});

    $scope.bigImgSrc='';
    //查询品牌列表
    $scope.selectAll=function(){
        listService.selectAll().success(
            function(response){
                $scope.list=response;
            }
        );
    }

    $scope.uploadFile = function(){
        var form = new FormData();
        var file = document.getElementById("fileUpload").files[0];
        form.append('aaa', file);
        $http({
            method: 'POST',
            url: '/file/upload',
            data: form,
            headers: {'Content-Type': undefined},
            transformRequest: angular.identity
        }).success(function (data) {
            alert('upload success');
        }).error(function (data) {
            alert('upload fail');
        })
    }


    //新增&修改保存
    $scope.save=function(){

    	
        var object = null; //方法名称
        if($scope.entity.id!=null){
            
            object=listService.update($scope.entity);
        }else{
            object=listService.add($scope.entity);
        }
        object.success(
            function(response){
              if(response){
                  alert("操作成功！！")
                  listService.selectAll().success(
                      function(response){
                          $scope.list=response;
                      }
                  );
              }
                  

                   
                
            }
        );
    }

    //查询实体
    $scope.selectOne=function(id){
    	
        listService.selectOne(id).success(
            function(response){
                $scope.entity=response;
            }
        );
    }



    //删除
    $scope.dele=function(){
    	
    	if($scope.selectIds.length<1){alert("请选择要删除的数据")}else{
    		
    	if(confirm("确认删除吗")){
        listService.dele($scope.selectIds).success(
            function(response){
                if(response){
                    listService.selectAll().success(
                        function(response){
                            $scope.list=response;
                        }
                    );
                }
            }
        )}
       
    	}
    }
    $scope.showBigImg=function (ev) {
        // layer.alert(ev.target.src)\
        console.log(ev)
        $scope.bigImgSrc=ev.path+'/'+ev.newFileName;
    }




});
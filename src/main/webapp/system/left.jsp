<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!--框架必需start-->
<script type="text/javascript" src="${path}/libs/js/jquery.js"></script>
<script type="text/javascript" src="${path}/libs/js/language/cn.js"></script>
<script type="text/javascript" src="${path}/libs/js/framework.js"></script>
<link href="${path}/libs/css/import_basic.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" id="skin" prePath="${path}/" scrollerY="false"/>
<link rel="stylesheet" type="text/css" id="customSkin"/>
<!--框架必需end-->

<!-- 树start-->
<script type="text/javascript" src="${path}/libs/js/tree/ztree/ztree.js"></script>
<link href="${path}/libs/js/tree/ztree/ztree.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript">
    var setting = {
        callback: {
            onClick: onClick
        }
    };
    var zNodes = [		
                  		{ id:1, parentId:0, name:"用户管理 "},
                  		{ id:101, parentId:1, name:"添加",url:"${path}/user/toAdd", target:"frmright"},
                  		{ id:102, parentId:1, name:"列表",url:"${path}/user/toList", target:"frmright"},
                  		{ id:2, parentId:0, name:"组织机构管理 "},
                  		{ id:201, parentId:2, name:"组织机构",url:"${path}/system/add", target:"frmright"},
                  		{ id:3, parentId:0, name:"角色管理 "},
                  		{ id:301, parentId:3, name:"添加角色",url:"${path}/role/add", target:"frmright"},
                  		{ id:302, parentId:3, name:"列表",url:"${path}/role/list", target:"frmright"},
                  		{ id:4, parentId:0, name:"资源管理 "},
                  		{ id:401, parentId:4, name:"添加商品资源",url:"${path}/resource/toAdd", target:"frmright"},
                  		{ id:402, parentId:4, name:"商品资源列表",url:"${path}/resource/toList", target:"frmright"},
                  		{ id:403, parentId:4, name:"添加图片资源",url:"${path}/resource/toAdd", target:"frmright"},
                  		{ id:404, parentId:4, name:"图片资源列表",url:"${path}/resource/toList", target:"frmright"},
               	]

    function initComplete() {
        $.fn.zTree.init($("#treeDemo"), setting, zNodes);
        //每次刷新时保持上次打开的
        showContent();
    }
    function showContent() {
        var treeNodeId = jQuery.jCookie('leftTreeNodeId');
        if (treeNodeId == false || treeNodeId == "false") { }
        else {
            var zTree = $.fn.zTree.getZTreeObj("treeDemo");
            var node = zTree.getNodeByParam("id", treeNodeId);
            zTree.selectNode(node);
            if (node.url) {
                //每次刷新时设置当前位置内容
               // if (node.name == "当前位置") {
                    top.positionType = "normal";
                    top.positionContent = "当前位置：" + node.getParentNode().name + ">>" + node.name;
                //}
                //else {
                   // top.positionType = "none";
               // }
                top.frmright.location = node.url;
            }
        }
    }

    function onClick(e, treeId, treeNode) {
        //单击展开
        var zTree = $.fn.zTree.getZTreeObj("treeDemo");
        zTree.expandNode(treeNode);
        //出现进度条
        if (treeNode.url != null && treeNode.showProgess != false) {
            showProgressBar();
             top.positionContent = "当前位置：" + treeNode.getParentNode().name + ">>" + treeNode.name;
            top.positionType = "normal";
        }

        //可以设置某些页面出现或者某些页面不出现当前位置组件
        //if (treeNode.name == "当前位置") {
            //每次点击时设置当前位置内容
            //top.positionContent = "当前位置：" + treeNode.getParentNode().name + ">>" + treeNode.name;
           // top.positionType = "normal";
       // }
       // else {
            //top.positionType = "none";
       // }

        //存储点击节点id
        jQuery.jCookie('leftTreeNodeId', treeNode.id.toString());
    }

    function showAll() {
        var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
        treeObj.expandAll(true);
    }
    function hideAll() {
        var treeObj = $.fn.zTree.getZTreeObj("treeDemo")
        treeObj.expandAll(false);
    }
    
    function customHeightSet(contentHeight){
		var windowWidth=document.documentElement.clientWidth;
		$("#scrollContent").width(windowWidth-4);
		$("#scrollContent").height(contentHeight-50);
	}
	function homeHandler(){
		 var treeObj = $.fn.zTree.getZTreeObj("treeDemo")
        treeObj.expandAll(false);
		top.positionType="none";
		jQuery.jCookie('leftTreeNodeId',"false");
	}
</script>
<!-- 树end -->
</head>

<body leftFrame="true">
<div class="padding_top5 ali02" style="height:50px;">
	<a onclick="showAll()">全部展开</a>&nbsp;&nbsp;<a onclick="hideAll()">全部收缩</a>
	<div class="red font_12">欢迎你：${user.username}</div>
</div>

<div id="scrollContent" style="overflow-x:hidden;">

	<div>
		<ul id="treeDemo" class="ztree"></ul>
	</div>
		
</div>				
</body>
</html>
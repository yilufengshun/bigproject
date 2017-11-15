<%--
  Created by IntelliJ IDEA.
  User: meng
  Date: 2017/11/15
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>easyui</title>
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5/themes/bootstrap/easyui.css"/>
    <!-- 图标样式 -->
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5/themes/icon.css"/>
    <!-- 引入easyui的脚本文件 -->
    <script type="application/javascript" src="js/jquery-easyui-1.5/jquery.min.js"></script>
    <script type="application/javascript" src="js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
    <!-- 语言脚本 -->
    <script type="application/javascript" src="js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>

</head>
<body>
<input class="easyui-textbox" data-option="iconCls:'icon-search'">
<table class="easyui-datagrid" style="width:400px;height:250px"
       data-options="url:'easyui2.json',fitColumns:true,singleSelect:true">
    <thead>
    <tr>
        <th data-options="field:'code',width:100">编码</th>
        <th data-options="field:'name',width:100">名称</th>
        <th data-options="field:'price',width:100,align:'right'">价格</th>
    </tr>
    </thead>
</table>
<table id="tt" class="easyui-datagrid" style="width:600px;height:250px"
       url="easyui2.json"
       title="Load Data" iconCls="icon-save"
       rownumbers="true" pagination="true">
    <thead>
    <tr>
        <th data-options="field:'code',width:100">编码</th>
        <th data-options="field:'name',width:100">名称</th>
        <th data-options="field:'price',width:100,align:'right'">价格</th>
    </tr>
    </thead>

</table>



</div>


</body>
</html>

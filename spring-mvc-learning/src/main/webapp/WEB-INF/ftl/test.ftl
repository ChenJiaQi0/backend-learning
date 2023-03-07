<html>
<head>
    <title>Welcome!</title>
    <meta charset="utf-8">
</head>
<style>
    div{
        margin-bottom: 5px;
        width: 200px;
    }
</style>
<body>
    <#list users as user>
        <#if user.gender == '男'>
            <div style="background-color: blue">${user.gender}——${user.username}</div>
        <#else>
            <div style="background-color: red">${user.gender}——${user.username}</div>
        </#if>
    </#list>
</body>
</html>
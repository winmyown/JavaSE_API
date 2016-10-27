<html>
<head>
    <title>freemarker测试</title>
</head>
<body>
<h1>${message},${name}</h1>

<#macro test foo bar baaz>
Test text, and the params: ${foo}, ${bar}, ${baaz}
</#macro>
<#-- call the macro: -->
<@test foo="a" bar="b" baaz=5*5-2/>


foo
<@upper>
bar
<#-- 这里允许使用所有的FTL -->
    <#list ["red", "green", "blue"] as color>
    ${color}
    </#list>
baaz
</@upper>
wombat
</body>
</html>
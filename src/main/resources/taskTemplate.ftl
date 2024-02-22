<#ftl strip_whitespace="true">
Task Details
Task Name: ${taskName}
<#if taskName == "Kadri">
Welcome, baddest!
<#elseif taskName == "Eni">
Good day!
</#if>
Description: ${taskDescription}
Due Date: ${dueDate}
Priority: ${priority}

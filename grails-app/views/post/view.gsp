<%--
  Created by IntelliJ IDEA.
  User: Aaron
  Date: 7/23/2015
  Time: 3:17 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>

    <title>${post.title}</title>
</head>

<body>
<h1>${post.title}</h1>

<p>${post.teaser}</p>

<p>${post.content}</p>
<br>
<br>

<g:link controller="comment" action="edit" id="${post.id}">
    Add a comment
</g:link>

<g:each in="${post.comments}" var="comment">
    <div class="comment">
        <p>${comment.comment}</p>
        <p>Posted by: ${comment.who.name} on ${comment.dateCreated}</p>
    </div>
</g:each>

</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: Aaron
  Date: 7/23/2015
  Time: 2:28 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Fancy Chancey Blog</title>
</head>

<body>

<!--<h1>Welcome to the Fancy Chancey blog!</h1> -->
<!-- <g:render template="/layouts/header"/> -->
<g:link controller="post" action="edit">
    Create a new post!
</g:link>
<g:each in="${posts}" var="post">
    <h2>
        <g:link controller="post" action="view" id="${post.id}">
            ${post.title}
        </g:link>
    </h2>

    <p>${post.teaser}</p>

    <h5>Last updated: ${post.lastUpdated}</h5>
    <br/>
    <g:link controller="post" action="view" id="${post.id}">
        View Post
    </g:link>
    &nbsp
    <g:link controller="post" action="edit" id="${post.id}">
        Edit this post
    </g:link>
    </div>
</g:each>
</body>
</html>
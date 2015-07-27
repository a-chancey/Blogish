<%--
  Created by IntelliJ IDEA.
  User: Aaron
  Date: 7/23/2015
  Time: 2:48 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>

    <title>Manage Post</title>
</head>

<body>
<h1>Edit your post</h1>

<div id="validationerrors">
    <g:renderErrors bean="${post}"/>
</div>

<g:form controller="post" action="save">
    <g:hiddenField name="id" value="${post.id}"/>
    <dl>
        <dt>Post Title:</dt>
        <dd>
            <g:textField name="title" value="${post.title}" size="50"/>
        </dd>
        <dt>Post Teaser:</dt>
        <dd>
            <g:textArea name="teaser" value="${post.teaser}" size="50"/>
        </dd>
        <dt>Post:</dt>
        <dd>
            <g:textArea name="content" value="${post.content}" rows="20" cols="50"/>
        </dd>
    </dl>
    <g:submitButton name="submit" value="Save"/>
</g:form>

</body>
</html>
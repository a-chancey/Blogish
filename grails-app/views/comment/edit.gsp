<%--
  Created by IntelliJ IDEA.
  User: Aaron
  Date: 7/23/2015
  Time: 3:49 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>

    <title>Leave your comment</title>
</head>

<body>
<div id="validationerrors">
    <g:renderErrors bean="${comment}"/>
</div>
<g:form controller="comment" action="save">
    <g:hiddenField name="postId" value="${postId}"/>
    <dl>
        <dt>Your Name:</dt>
        <dd>
            <g:textField name="who.name" value="${comment.who.name}"/>
        </dd>
        <dt>Your email:</dt>
        <dd>
            <g:textField name="who.email" value="${comment.who.email}"/>
        </dd>
        <dt>Your website/blog url:</dt>
        <dd>
            <g:textField name="who.url" value="${comment.who.url}"/>
        </dd>
        <dt>Add your comment:</dt>
        <dd>
            <g:textArea name="comment" value="${comment.comment}" rows="20" cols="50"/>
        </dd>
    </dl>
    <g:submitButton name="submit" value="Save"/>
</g:form>
</body>
</html>
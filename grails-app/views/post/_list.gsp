<%--
  Created by IntelliJ IDEA.
  User: Aaron
  Date: 7/23/2015
  Time: 2:28 PM
--%>

<g:link controller="post" action="edit">
    Create a new post!
</g:link>
<g:each in="${posts}" var="post">
    <h2>
        <g:link controller="post" action="view" id="${post.id}">
            ${post.title}
        </g:link>
    </h2>
    <br/>

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
    <br/>
    <br/>
    <hr/>
    <br/>
</g:each>

<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Welcome to Grails</title>
    </head>
    <body>
        <g:render template="post/list" model="[posts: blogish.Post.list(
                  sort: 'lastUpdated',
                  order: 'desc')]"/>
    </body>
</html>

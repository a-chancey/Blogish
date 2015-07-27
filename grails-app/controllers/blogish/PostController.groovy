package blogish

class PostController {
    static defaultAction = 'list'

    def edit = {
        def post = Post.get(params.id)
        if (!post) {
            post = new Post()
        }
        render(view: 'edit', model: [post: post])
    }

    def list = {
        render(
                template: 'list',
                model: [posts: Post.list(
                        sort: 'lastUpdated',
                        order: 'desc')])
    }

    def save = {
        def post = loadPost(params.id)
        post.properties = params
        if (post.save()) {
            redirect(uri: '/')
        } else {
            render(view: 'edit', model: [post: post])
        }
    }

    def view = {
        render(view: 'view', model: [post: Post.get(params.id)])
    }

    def rss = {
        def posts = Post.list(sort:'lastUpdated',
                    order:'desc')
        render(contentType: "text/xml", text:new PostRssBuilder(request:request).buildRss(posts))
    }

    def startUrl(request) {
        return "http://${request.serverName}:${request.serverPort}${request.contextPath}"
    }

    private loadPost(id) {
        def post = new Post()
        if (id) {
            post = Post.get(id)
        }
        return post
    }

}

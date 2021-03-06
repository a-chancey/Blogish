package blogish

class CommentController {
    def edit() {
        def post = Post.get(params.id)
        render(view:'edit',
                model:[
                        comment:new Comment(),
                        postId:post.id])
    }

    def save() {
        def comment = new Comment(params)
        comment.dateCreated = new Date()
        comment.post = Post.get(params.postId)
        if(comment.save()) {
            redirect(controller:'post', action:'view', id:params.postId)
        } else {
            render(view:'edit',
                    model:[comment:comment, postId:params.postId])
        }
    }
}

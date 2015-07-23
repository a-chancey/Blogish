package blogish

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Post)
class PostSpec extends Specification {

    def setup() {

    }

    def cleanup() {
    }

    void "testCrud"() {
        Post post = new Post(title: "First Grails Project",
                teaser: "Clearing out the clutter",
                content: "The full content of the article",
                published: false)

        post.save()


        def id = post.id
        Post retrievedPost = Post.get(id)

        expect: "post title"
        "First Grails Project" == retrievedPost.title
        null == Post.get(10)

    }

    void "test update"() {
        Post post = new Post(title: "First Grails Project",
                teaser: "Clearing out the clutter",
                content: "The full content of the article",
                published: false)
        post.save()

        def id = post.id

        post.published = true
        post.save()
        Post retrievedPost = Post.get(id)

        expect:"Post is published"
            true == retrievedPost.published
    }
    void "test delete"() {
        Post post = new Post(title: "First Grails Project",
                teaser: "Clearing out the clutter",
                content: "The full content of the article",
                published: false)
        post.save()

        def id = post.id

        post.delete()
        expect:"post is deleted"
        null == Post.get(id)

    }
}

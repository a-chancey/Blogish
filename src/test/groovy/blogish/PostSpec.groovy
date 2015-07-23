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

    void testCrud(){

    Post post = new Post(title:"First Grails Project",
                         teaser:"Clearing out the clutter",
                         content:"The full content of the article",
                         published:false)

    post.save()

    def id = post.id
    Post retrievedPost = Post.get(id)

    assertEquals("First Grails Project", retrievedPost.title)

    assertNull(Post.get(10))

    post.published = true
    post.save()

    retrievedPost = Post.get(id)
    assertEquals(true, retrievedPost.published)

    post.delete()
    assertEquals(null, Post.get(id))
}
}

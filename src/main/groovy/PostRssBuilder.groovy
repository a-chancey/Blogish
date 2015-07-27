/**
 * Created by Aaron on 7/27/2015.
 */
import groovy.xml.MarkupBuilder

class PostRssBuilder {
    def request

    def buildRss(posts) {
        def writer = new StringWriter()
        def builder = new MarkupBuilder(writer)
        builder.rss(version: "2.0") {
            channel {
                title("Fancy Chancey Blog")
                link("${startUrl(request)}/post/list")
                description("Our Blog")
                language("en-us")
                posts.each {post ->
                    item {
                        title(post.title)
                        description(post.teaser)
                        pubDate(post.lastUpdated)
                        guid("${startUrl(request)}/post/view/${post.id}")
                    }
                }
            }
        }
        return writer.toString()
    }

    def startUrl(request) {
        return "http://${request.serverName}:${request.serverPort}${request.contextPath}"
    }

}

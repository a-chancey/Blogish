package blogish

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(PostController)
class PostControllerSpec extends Specification {


    def setup() {
    }

    def cleanup() {
    }

    void testStartUrlCanBeDetermined() {
        def request = new Expando()
        request.serverName = "localhost"
        request.serverPort = "8080"
        request.contextPath = "/groovypublish"

        def controller = new PostController()
        expect:"get the url"
            controller.startUrl(request) == "http://localhost:8080/groovypublish"
    }

}

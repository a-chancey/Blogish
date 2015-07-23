package blogish

class Post {
    String title
    String teaser
    String content
    Date lastUpdated
    Boolean published = false

    static constraints = {
    }
}

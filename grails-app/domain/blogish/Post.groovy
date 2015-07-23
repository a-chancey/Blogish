package blogish

class Post {
    String title
    String teaser
    String content
    Date lastUpdated
    Boolean published = false
    SortedSet comments


    static hasMany = [comments:Comment]

    static constraints = {
    }
}

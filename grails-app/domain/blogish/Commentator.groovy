package blogish

class Commentator {
    static belongsTo = Comment

    String name
    String url
    String email
    Comment comment
}

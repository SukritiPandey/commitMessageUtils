def call(String commitMessage) {
    def commitInfo = [:]

    // Split the commit message into lines
    def lines = commitMessage.trim().split(':')

    // The first line is the commit title
    commitInfo['title'] = lines[0].trim()

    // The rest of the lines are the commit body
    commitInfo['body'] = lines[1..-1].collect { it.trim() }.join('\n')
    print("Durga Prasad Rath")

    return this
}

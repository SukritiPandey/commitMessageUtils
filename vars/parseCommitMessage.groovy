def call(String commitMessage) {
    def pattern = /^(feat|fix|docs|style|refactor|test|chore):\s.+$/

    if (commitMessage ==~ pattern) {
        echo "Commit message follows the correct pattern."
    } else {
        error "Commit message does not follow the correct pattern."
    }
}

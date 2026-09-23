def call(String credentialsId, String destination = 'backend/.env') {
    withCredentials([file(
        credentialsId: credentialsId,
        variable: 'ENV_FILE'
    )]) {
        sh "cp \"\$ENV_FILE\" \"${destination}\""
    }
}

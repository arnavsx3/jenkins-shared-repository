def call(String composeFile = 'docker-compose.yml') {
    sh "docker compose -f ${composeFile} build"
}

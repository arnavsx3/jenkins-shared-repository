def call(String sonarServer) {
    withSonarQubeEnv(sonarServer) {
        sh "sonar-scanner"
    }
}

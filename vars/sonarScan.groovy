def call(String sonarServer, String projectKey) {
    def scannerHome = tool 'SonarQube-scanner'

    withSonarQubeEnv(sonarServer) {
        sh """
            ${scannerHome}/bin/sonar-scanner \
                -Dsonar.projectKey=${projectKey} \
                -Dsonar.sources=.
        """
    }
}


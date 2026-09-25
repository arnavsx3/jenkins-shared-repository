def call(String installation, String nvdCredentialId) {

    withCredentials([
        string(credentialsId: nvdCredentialId, variable: 'NVD_API_KEY')
    ]) {
        dependencyCheck(
            additionalArguments: "--scan ./ --nvdApiKey \$NVD_API_KEY",
            odcInstallation: installation
        )
    }

    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}

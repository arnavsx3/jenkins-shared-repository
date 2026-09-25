def call(String installation, String nvdCredentialId) {

    dependencyCheck(
        additionalArguments: '--scan ./',
        odcInstallation: installation,
        nvdCredentialsId: nvdCredentialId,
        stopBuild: true
    )

    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}

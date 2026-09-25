def call(String installation, String nvdCredentialId) {

    dependencyCheck(
        additionalArguments: '--scan ./',
        odcInstallation: installation,
        nvdCredentialsId: nvdCredentialId
    )

    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
